package dao;

import java.util.List;
import javax.swing.JOptionPane;
import model.ContaPagar;
import org.hibernate.Session;
import org.hibernate.Transaction;
import util.HibernateUtil;


public class ContaPagarDao {
    
public ContaPagarDao(){
        session = HibernateUtil.getSessionFactory().openSession();
    }
    
    private final Session session;
    
    public void insert(ContaPagar ban){
        Transaction t = session.beginTransaction();
        
        session.save(ban);
        t.commit();
    }
    
    public void update(ContaPagar ban){
        Transaction t = session.beginTransaction();
        
        session.merge(ban);
        t.commit();
    }
    
    public void delete(ContaPagar ban){
        Transaction t = session.beginTransaction();
        
        session.delete(ban);
        try{
            t.commit();  
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Não é possível deletar! \n\n Este campo está sendo usado em outra tabela.", "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    public ContaPagar findById(int id){
        return (ContaPagar) session.load(ContaPagar.class, id);
    }
    
    public List<ContaPagar> findAll(){ 
        return session.createQuery("From ContaPagar").list();
    }
}
