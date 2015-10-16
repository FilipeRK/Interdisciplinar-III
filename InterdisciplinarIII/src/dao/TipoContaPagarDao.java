package dao;

import java.util.List;
import javax.swing.JOptionPane;
import model.TipoContaPagar;
import org.hibernate.Session;
import org.hibernate.Transaction;
import util.HibernateUtil;


public class TipoContaPagarDao {
 public TipoContaPagarDao(){
        session = HibernateUtil.getSessionFactory().openSession();
    }
    
    private final Session session;
    
    public void insert(TipoContaPagar ban){
        Transaction t = session.beginTransaction();
        
        session.save(ban);
        t.commit();
    }
    
    public void update(TipoContaPagar ban){
        Transaction t = session.beginTransaction();
        
        session.merge(ban);
        t.commit();
    }
    
    public void delete(TipoContaPagar ban){
        Transaction t = session.beginTransaction();
        
        session.delete(ban);
        try{
            t.commit();  
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Não é possível deletar! \n\n Este campo está sendo usado em outra tabela.", "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    public TipoContaPagar findById(int id){
        return (TipoContaPagar) session.load(TipoContaPagar.class, id);
    }
    
    public List<TipoContaPagar> findAll(){ 
        return session.createQuery("From TipoContaPagar").list();
    }
}
