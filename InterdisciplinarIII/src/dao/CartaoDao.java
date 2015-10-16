package dao;

import java.util.List;
import javax.swing.JOptionPane;
import model.Cartao;
import org.hibernate.Session;
import org.hibernate.Transaction;
import util.HibernateUtil;


public class CartaoDao {
         public CartaoDao(){
        session = HibernateUtil.getSessionFactory().openSession();
    }
    
    private final Session session;
    
    public void insert(Cartao tct){
        Transaction t = session.beginTransaction();
        
        session.save(tct);
        t.commit();
    }
    
    public void update(Cartao tct){
        Transaction t = session.beginTransaction();
        
        session.merge(tct);
        t.commit();
    }
    
    public void delete(Cartao tct){
        Transaction t = session.beginTransaction();
        
        session.delete(tct);
        try{
            t.commit();  
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Não é possível deletar! \n\n Este campo está sendo usado em outra tabela.", "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    public Cartao findById(int id){
        return (Cartao) session.load(Cartao.class, id);
    }
    
    public List<Cartao> findAll(){ 
        return session.createQuery("From Cartao").list();
    }
}
