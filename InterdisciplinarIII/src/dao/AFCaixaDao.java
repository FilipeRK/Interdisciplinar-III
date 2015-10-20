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
    
    //Método que retorna o saldo do dia de acordo com a data atual do sistemaa
    public String retornaSaldoDia(){
        NumberFormat formatter = new DecimalFormat("#,###.00");  
        String valorabre = (session.createSQLQuery("SELECT VALOR FROM AFCAIXA WHERE TIPO = 'A' AND DATA = '"+retornaData()+"'").list().toString()).replace("[", "");
        String valorfecha = (session.createSQLQuery("SELECT VALOR FROM AFCAIXA WHERE TIPO = 'F' AND DATA = '"+retornaData()+"'").list().toString()).replace("[", "");
        
        String valorabre2 = valorabre.replace("]", "");
        String valorfecha2 = valorfecha.replace("]", "");
        double valor1 = Double.parseDouble(valorabre2);
        double valor2 = Double.parseDouble(valorfecha2);
        double saldo = valor2 - valor1;
        return formatter.format(saldo);
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
