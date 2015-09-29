package dao;

import java.text.DateFormat;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.Transaction;
import model.AFCaixa;
import util.HibernateUtil;

public class AFCaixaDao {
    
    public AFCaixaDao(){
        session = HibernateUtil.getSessionFactory().openSession();
    }
    
    private final Session session;
    
    public void insert(AFCaixa afcaixa){
        Transaction t = session.beginTransaction();
        
        session.save(afcaixa);
        t.commit();
    }
    
    public void update(AFCaixa afcaixa){
        Transaction t = session.beginTransaction();
        
        session.merge(afcaixa);
        t.commit();
    }
    
    public void delete(AFCaixa afcaixa){
        Transaction t = session.beginTransaction();
       
        session.delete(afcaixa);
        t.commit();
    }
    
    public AFCaixa findById(int id){
        return (AFCaixa) session.load(AFCaixa.class, id);
    }
    
    public List<AFCaixa> findAll(){
        return session.createQuery("From AFCaixa Order By codafcaixa").list();
    }
    
    //Método que retorna o saldo do dia de acordo com a data atual do sistema
    public String retornaSaldoDia(){
        NumberFormat formatter = new DecimalFormat("#,###.00");  
        String saldo2 = (session.createSQLQuery("SELECT ((SELECT VALOR FROM AFCAIXA WHERE TIPO = 'F' AND DATA = '"+retornaData()+"')-(VALOR)) AS SALDO FROM AFCAIXA WHERE TIPO = 'A' AND DATA = '"+retornaData()+"'").list().toString()).replace("[", "");
        String saldo1 =  saldo2.replace("]", "");
        double saldo = Double.valueOf(saldo1);
        return formatter.format(saldo);
    }
 
   
    public String retornaSaldoDiaPFechar(){
        
        String saldoDiaFechar1 = (session.createSQLQuery("SELECT SUM(L.VALOR) FROM lancamentos L INNER JOIN TIPOALTERACAO TA ON L.CODTIPOALTERACAO = TA.CODTIPOALTERACAO WHERE TA.STATUS = 'E'  AND L.DATA = '"+retornaData()+"'").list().toString()).replace("[", ""); 
        String saldoDiaFechar2 = (session.createSQLQuery("SELECT SUM(L.VALOR) FROM lancamentos L INNER JOIN TIPOALTERACAO TA ON L.CODTIPOALTERACAO = TA.CODTIPOALTERACAO WHERE TA.STATUS = 'S'  AND L.DATA = '"+retornaData()+"'").list().toString()).replace("[", "");
        String sDF1 =  saldoDiaFechar1.replace("]", "");
        String sDF2 =  saldoDiaFechar2.replace("]", "");
        
        if(!"null".equals(sDF1) && !"null".equals(sDF2)){
            double s1 = Double.valueOf(sDF1);
            double s2 = Double.valueOf(sDF2);

            double total = (s1+Double.valueOf(retornaSaldoDiaAnterior())-s2);


            String saldoDiaFechar =  String.valueOf(total);
            return saldoDiaFechar;
        }else{
            if(!"null".equals(sDF1) && "null".equals(sDF2)){
                double s1 = Double.valueOf(sDF1);
                double s2 = 0.0;

                double total = (s1+Double.valueOf(retornaSaldoDiaAnterior())-s2);


                String saldoDiaFechar =  String.valueOf(total);
                return saldoDiaFechar;
            }else{
                 if("null".equals(sDF1) && !"null".equals(sDF2)){
                    double s1 = 0.0;
                    double s2 = Double.valueOf(sDF2);

                    double total = (s1+Double.valueOf(retornaSaldoDiaAnterior())-s2);


                    String saldoDiaFechar =  String.valueOf(total);
                    return saldoDiaFechar;
                 }else{
                     return retornaSaldoDiaAnterior();
                 }
            }
        }
    }
    
    public String retornaSaldoDiaPFechar2(){
        
        String saldoDiaFechar1 = (session.createSQLQuery("SELECT SUM(L.VALOR) FROM lancamentos L INNER JOIN TIPOALTERACAO TA ON L.CODTIPOALTERACAO = TA.CODTIPOALTERACAO WHERE TA.STATUS = 'E'  AND L.DATA = '"+retornaData()+"'").list().toString()).replace("[", ""); 
        String saldoDiaFechar2 = (session.createSQLQuery("SELECT SUM(L.VALOR) FROM lancamentos L INNER JOIN TIPOALTERACAO TA ON L.CODTIPOALTERACAO = TA.CODTIPOALTERACAO WHERE TA.STATUS = 'S'  AND L.DATA = '"+retornaData()+"'").list().toString()).replace("[", "");
        String sDF1 =  saldoDiaFechar1.replace("]", "");
        String sDF2 =  saldoDiaFechar2.replace("]", "");
        
        NumberFormat formatter = new DecimalFormat("#,###.00");  
        
        if(!"null".equals(sDF1) && !"null".equals(sDF2)){
            double s1 = Double.valueOf(sDF1);
            double s2 = Double.valueOf(sDF2);

            double total = (s1+Double.valueOf(retornaSaldoDiaAnterior())-s2);


            //String saldoDiaFechar =  String.valueOf(total);
            return formatter.format(total);
        }else{
            if(!"null".equals(sDF1) && "null".equals(sDF2)){
                double s1 = Double.valueOf(sDF1);
                double s2 = 0.0;

                double total = (s1+Double.valueOf(retornaSaldoDiaAnterior())-s2);


                //String saldoDiaFechar =  String.valueOf(total);
                return formatter.format(total);
            }else{
                 if("null".equals(sDF1) && !"null".equals(sDF2)){
                    double s1 = 0.0;
                    double s2 = Double.valueOf(sDF2);

                    double total = (s1+Double.valueOf(retornaSaldoDiaAnterior())-s2);


                    //String saldoDiaFechar =  String.valueOf(total);
                    return formatter.format(total);
                 }else{
                     return retornaSaldoDiaAnterior2();
                 }
            }
        }
    }
    
     public String retornaValorAbCaixa(){ 
        String saldoAbCaixa2 = (session.createSQLQuery("SELECT VALOR FROM AFCAIXA WHERE TIPO = 'A' AND DATA = '"+retornaData()+"'").list().toString()).replace("[", "");
        String saldoAbCaixa1 =  saldoAbCaixa2.replace("]", "");
        return saldoAbCaixa1;
    }
    
    public String retornaSaldoDiaAnterior(){
        String saldoDiaAnt2 = (session.createSQLQuery("SELECT FIRST 1 VALOR FROM AFCAIXA WHERE TIPO = 'F' ORDER BY DATA DESC").list().toString()).replace("[", "");
        String saldoDiaAnt =  saldoDiaAnt2.replace("]", "");
        return saldoDiaAnt;   
    }
    
     public String retornaValorAbCaixa2(){ 
        NumberFormat formatter = new DecimalFormat("#,###.00"); 
        String saldoAbCaixa2 = (session.createSQLQuery("SELECT VALOR FROM AFCAIXA WHERE TIPO = 'A' AND DATA = '"+retornaData()+"'").list().toString()).replace("[", "");
        String saldoAbCaixa1 =  saldoAbCaixa2.replace("]", "");
        double saldoAbCaixa = Double.valueOf(saldoAbCaixa1);
        return formatter.format(saldoAbCaixa);
    }
    
    public String retornaSaldoDiaAnterior2(){
        NumberFormat formatter = new DecimalFormat("#,###.00"); 
        String saldoDiaAnt2 = (session.createSQLQuery("SELECT FIRST 1 VALOR FROM AFCAIXA WHERE TIPO = 'F' ORDER BY DATA DESC").list().toString()).replace("[", "");
        String saldoDiaAnt1 =  saldoDiaAnt2.replace("]", "");
        double saldoDiaAnt = Double.valueOf(saldoDiaAnt1);
        return formatter.format(saldoDiaAnt);   
    }

    //Método para trazer a data atual do sistema
    public String retornaData(){
        
        DateFormat df = new SimpleDateFormat("dd/MM/yyyy");    
        Calendar c = Calendar.getInstance();      
        String teste2  = df.format(c.getTime()); 
        StringBuilder sb = new StringBuilder(); 

        try{
            java.util.Date dt; 
            dt = df.parse(teste2);
            java.sql.Date d = new java.sql.Date(dt.getTime()); 
            return String.valueOf(d);
        }catch(ParseException e){ 
            return null;
        }
    }
            
    public String retornaStatusCX(){
        String status1 = (session.createSQLQuery("SELECT TIPO FROM AFCAIXA WHERE DATA = '"+retornaData()+"' AND (TIPO = 'A' OR TIPO = 'F')").list().toString()).replace("[", "");
        String status =  status1.replace("]", "");
        if("A, F".equals(status)){
            return "AF";
        }else{
            if("A".equals(status)){
                return "A";
            }else{
                return "F";
            }
        }
    }
}
