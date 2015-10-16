package dao;

import java.util.List;
import javax.swing.JOptionPane;
import model.TipoCartao;
import org.hibernate.Session;
import org.hibernate.Transaction;
import util.HibernateUtil;


public class TipoCartaoDao {
     public TipoCartaoDao(){
        session = HibernateUtil.getSessionFactory().openSession();
    }
    
    private final Session session;
    
    public void insert(TipoCartao tct){
        Transaction t = session.beginTransaction();
        
        session.save(tct);
        t.commit();
    }
    
    public void update(TipoCartao tct){
        Transaction t = session.beginTransaction();
        
        session.merge(tct);
        t.commit();
    }
    
    public void delete(TipoCartao tct){
        Transaction t = session.beginTransaction();
        
        session.delete(tct);
        try{
            t.commit();  
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Não é possível deletar! \n\n Este campo está sendo usado em outra tabela.", "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    public TipoCartao findById(int id){
        return (TipoCartao) session.load(TipoCartao.class, id);
    }
    
    public List<TipoCartao> findAll(){ 
        return session.createQuery("From TipoCartao").list();
    }
    
}
