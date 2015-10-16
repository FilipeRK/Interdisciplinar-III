package dao;

import java.util.List;
import javax.swing.JOptionPane;
import model.Cheque;
import org.hibernate.Session;
import org.hibernate.Transaction;
import util.HibernateUtil;


public class ChequeDao {
  public ChequeDao(){
        session = HibernateUtil.getSessionFactory().openSession();
    }
    
    private final Session session;
    
    public void insert(Cheque ban){
        Transaction t = session.beginTransaction();
        
        session.save(ban);
        t.commit();
    }
    
    public void update(Cheque ban){
        Transaction t = session.beginTransaction();
        
        session.merge(ban);
        t.commit();
    }
    
    public void delete(Cheque ban){
        Transaction t = session.beginTransaction();
        
        session.delete(ban);
        try{
            t.commit();  
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Não é possível deletar! \n\n Este campo está sendo usado em outra tabela.", "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    public Cheque findById(int id){
        return (Cheque) session.load(Cheque.class, id);
    }
    
    public List<Cheque> findAll(){ 
        return session.createQuery("From Cheque").list();
    }
}
