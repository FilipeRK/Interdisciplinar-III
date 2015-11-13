package dao;

import java.io.InputStream;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.swing.JOptionPane;
import model.Maquina;
import net.sf.jasperreports.engine.JRException;
import org.hibernate.Session;
import org.hibernate.Transaction;
import util.ConnectionFactory;
import util.HibernateUtil;
import util.ReportUtils;


public class MaquinaDao {
 public MaquinaDao(){
        session = HibernateUtil.getSessionFactory().openSession();
    }
    
    private final Session session;
    
    public void insert(Maquina ban){
        Transaction t = session.beginTransaction();
        
        session.save(ban);
        t.commit();
    }
    
    public void update(Maquina ban){
        Transaction t = session.beginTransaction();
        
        session.merge(ban);
        t.commit();
    }
    
    public void delete(Maquina ban){
        Transaction t = session.beginTransaction();
        
        session.delete(ban);
        try{
            t.commit();  
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Não é possível deletar! \n\n Este campo está sendo usado em outra tabela.", "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    public Maquina findById(int id){
        return (Maquina) session.load(Maquina.class, id);
    }
    
    public List<Maquina> findAll(){ 
        return session.createQuery("From Maquina").list();
    }
    
     public void abrirRelatorio() {
 
        InputStream inputStream = getClass().getResourceAsStream( "/Maquina.jasper" );
        Map parametros = new HashMap();

        try {
            ReportUtils.openReport( "Maquina", inputStream, parametros,
                    ConnectionFactory.getBancoConnection());
 
        } catch ( SQLException | JRException exc ) {
        }
    }
}
