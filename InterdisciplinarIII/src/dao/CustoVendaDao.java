package dao;

import java.io.InputStream;
import java.sql.SQLException;
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
    
    public void abrirRelatorio() {
 
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
}