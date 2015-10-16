package dao;

import java.util.List;
import javax.swing.JOptionPane;
import model.Cidade;
import org.hibernate.Session;
import org.hibernate.Transaction;
import util.HibernateUtil;


public class CidadeDao {
     public CidadeDao(){
        session = HibernateUtil.getSessionFactory().openSession();
    }
    
    private final Session session;
    
    public void insert(Cidade cid){
        Transaction t = session.beginTransaction();
        
        session.save(cid);
        t.commit();
    }
    
    public void update(Cidade cid){
        Transaction t = session.beginTransaction();
        
        session.merge(cid);
        t.commit();
    }
    
    public void delete(Cidade cid){
        Transaction t = session.beginTransaction();
        
        session.delete(cid);
        try{
            t.commit();  
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Não é possível deletar! \n\n Este campo está sendo usado em outra tabela.", "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    public Cidade findById(int id){
        return (Cidade) session.load(Cidade.class, id);
    }
    
    public List<Cidade> findAll(){ 
        return session.createQuery("From Cidade").list();
    }
}
