package dao;

import java.util.List;
import javax.swing.JOptionPane;
import model.UnidadeMadeira;
import org.hibernate.Session;
import org.hibernate.Transaction;
import util.HibernateUtil;


public class UnidadeMadeiraDao {
 public UnidadeMadeiraDao(){
        session = HibernateUtil.getSessionFactory().openSession();
    }
    
    private final Session session;
    
    public void insert(UnidadeMadeira ban){
        Transaction t = session.beginTransaction();
        
        session.save(ban);
        t.commit();
    }
    
    public void update(UnidadeMadeira ban){
        Transaction t = session.beginTransaction();
        
        session.merge(ban);
        t.commit();
    }
    
    public void delete(UnidadeMadeira ban){
        Transaction t = session.beginTransaction();
        
        session.delete(ban);
        try{
            t.commit();  
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Não é possível deletar! \n\n Este campo está sendo usado em outra tabela.", "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    public UnidadeMadeira findById(int id){
        return (UnidadeMadeira) session.load(UnidadeMadeira.class, id);
    }
    
    public List<UnidadeMadeira> findAll(){ 
        return session.createQuery("From UnidadeMadeira").list();
    }
}
