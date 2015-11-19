package dao;

import java.io.InputStream;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.swing.JOptionPane;
import model.CustoVenda;
import net.sf.jasperreports.engine.JRException;
import org.hibernate.Session;
import org.hibernate.Transaction;
import util.ConnectionFactory;
import util.HibernateUtil;
import util.ReportUtils;


public class CustoVendaDao {
    public CustoVendaDao(){
        session = HibernateUtil.getSessionFactory().openSession();
    }
    
    private final Session session;
    private String sql;
    public int cod;
    public String datainicial, datafinal;
    
    SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
    Date datai, dataf; 
    
    public void insert(CustoVenda ban){
        Transaction t = session.beginTransaction();
        
        session.save(ban);
        t.commit();
    }
    
    public void update(CustoVenda ban){
        Transaction t = session.beginTransaction();
        
        session.merge(ban);
        t.commit();
    }
    
    public void delete(CustoVenda ban){
        Transaction t = session.beginTransaction();
        
        session.delete(ban);
        try{
            t.commit();  
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Não é possível deletar! \n\n Este campo está sendo usado em outra tabela.", "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    public CustoVenda findById(int id){
        return (CustoVenda) session.load(CustoVenda.class, id);
    }
    
    public List<CustoVenda> findAll(){ 
        return session.createQuery("From CustoVenda").list();
    }
    
    public List<CustoVenda> findAllTeste(String datai, String dataf){ 
        return session.createQuery("From CustoVenda where datavenda between '"+datai+"' and '"+dataf+"'").list();
    }
    
    public void abrirRelatorioSelecao() {
 
        InputStream inputStream = getClass().getResourceAsStream( "/CustoVenda.jasper" );
        Map parametros = new HashMap();
        
        sql = "select cv.*, ma.nome as maquinanome, m.nome as madeiranome from custovenda cv inner join madeira m on cv.codmadeira = m.codmadeira inner join maquina ma on cv.codmaquina = ma.codmaquina where cv.codcustovenda = "+cod;
        parametros.put("CONSULTA", sql);

        try {
            ReportUtils.openReport( "CustoVenda", inputStream, parametros,
                    ConnectionFactory.getBancoConnection());
 
        } catch ( SQLException | JRException exc ) {
        }
    }
    
    public void abrirRelatorioGeral() {
 
        InputStream inputStream = getClass().getResourceAsStream( "/CustoVendaGeral.jasper" );
        Map parametros = new HashMap();

        try {
            ReportUtils.openReport( "CustoVenda", inputStream, parametros,
                    ConnectionFactory.getBancoConnection());
 
        } catch ( SQLException | JRException exc ) {
        }
    }
    
    public void abrirRelatorioData() throws ParseException {
 
        InputStream inputStream = getClass().getResourceAsStream( "/CustoVendaData.jasper" );
        Map parametros = new HashMap();
        
        datai = formatter.parse(datainicial);
        dataf = formatter.parse(datafinal);
        java.sql.Date d1 = new java.sql.Date(datai.getTime());  
        java.sql.Date d2 = new java.sql.Date(dataf.getTime()); 
        sql = "select cv.*, ma.nome as maquinanome, m.nome as madeiranome from custovenda cv inner join madeira m on cv.codmadeira = m.codmadeira inner join maquina ma on cv.codmaquina = ma.codmaquina where cv.datavenda between '"+datai+"' and '"+dataf+"'";
        parametros.put("CONSULTA", sql);

        try {
            ReportUtils.openReport( "CustoVenda", inputStream, parametros,
                    ConnectionFactory.getBancoConnection());
 
        } catch ( SQLException | JRException exc ) {
        }
    }
    
    public String retornaSaldoCustoDia(String data){
        
         String saldoDia = (session.createSQLQuery("SELECT SUM(CUSTOFINAL) FROM CUSTOVENDA WHERE DATAVENDA = '"+data+"'").list().toString()).replace("[", ""); 
         String sDF1 =  saldoDia.replace("]", ""); 
         return sDF1;
    }
    
    public String retornaSaldoFinalDia(String data){
        
         String saldoDia = (session.createSQLQuery("SELECT SUM(VALORFINAL) FROM CUSTOVENDA WHERE DATAVENDA = '"+data+"'").list().toString()).replace("[", ""); 
         String sDF1 =  saldoDia.replace("]", ""); 
         return sDF1;
    }

    
}