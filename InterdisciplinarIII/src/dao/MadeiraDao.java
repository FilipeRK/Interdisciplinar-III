package dao;

import java.io.InputStream;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.swing.JOptionPane;
import model.Madeira;
import net.sf.jasperreports.engine.JRException;
import org.hibernate.Session;
import org.hibernate.Transaction;
import util.ConnectionFactory;
import util.HibernateUtil;
import util.ReportUtils;


public class MadeiraDao {
   public MadeiraDao(){
        session = HibernateUtil.getSessionFactory().openSession();
    }
    
    private final Session session;
    
    public void insert(Madeira ban){
        Transaction t = session.beginTransaction();
        
        session.save(ban);
        t.commit();
    }
    
    public void update(Madeira ban){
        Transaction t = session.beginTransaction();
        
        session.merge(ban);
        t.commit();
    }
    
    public void delete(Madeira ban){
        Transaction t = session.beginTransaction();
        
        session.delete(ban);
        try{
            t.commit();  
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Não é possível deletar! \n\n Este campo está sendo usado em outra tabela.", "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    public Madeira findById(int id){
        return (Madeira) session.load(Madeira.class, id);
    }
    
    public List<Madeira> findAll(){ 
        return session.createQuery("From Madeira").list();
    }
    
    public void abrirRelatorio() {
 
        InputStream inputStream = getClass().getResourceAsStream( "/Madeira.jasper" );
        Map parametros = new HashMap();

        try {
            ReportUtils.openReport( "Madeira", inputStream, parametros,
                    ConnectionFactory.getBancoConnection());
 
        } catch ( SQLException | JRException exc ) {
        }
    }
}