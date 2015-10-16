package dao;

import java.util.List;
import javax.swing.JOptionPane;
import model.Banco;
import org.hibernate.Session;
import org.hibernate.Transaction;
import util.HibernateUtil;


public class BancoDao {
    public BancoDao(){
        session = HibernateUtil.getSessionFactory().openSession();
    }
    
    private final Session session;
    
    public void insert(Banco ban){
        Transaction t = session.beginTransaction();
        
        session.save(ban);
        t.commit();
    }
    
    public void update(Banco ban){
        Transaction t = session.beginTransaction();
        
        session.merge(ban);
        t.commit();
    }
    
    public void delete(Banco ban){
        Transaction t = session.beginTransaction();
        
        session.delete(ban);
        try{
            t.commit();  
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Não é possível deletar! \n\n Este campo está sendo usado em outra tabela.", "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    public Banco findById(int id){
        return (Banco) session.load(Banco.class, id);
    }
    
    public List<Banco> findAll(){ 
        return session.createQuery("From Banco").list();
    }
}
