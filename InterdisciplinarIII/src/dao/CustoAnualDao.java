package dao;

import java.util.List;
import javax.swing.JOptionPane;
import model.CustoAnual;
import org.hibernate.Session;
import org.hibernate.Transaction;
import util.HibernateUtil;


public class CustoAnualDao {
    public CustoAnualDao(){
        session = HibernateUtil.getSessionFactory().openSession();
    }
    
    private final Session session;
    
    public void insert(CustoAnual ban){
        Transaction t = session.beginTransaction();
        
        session.save(ban);
        t.commit();
    }
    
    public void update(CustoAnual ban){
        Transaction t = session.beginTransaction();
        
        session.merge(ban);
        t.commit();
    }
    
    public void delete(CustoAnual ban){
        Transaction t = session.beginTransaction();
        
        session.delete(ban);
        try{
            t.commit();  
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Não é possível deletar! \n\n Este campo está sendo usado em outra tabela.", "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    public CustoAnual findById(int id){
        return (CustoAnual) session.load(CustoAnual.class, id);
    }
    
    public List<CustoAnual> findAll(){ 
        return session.createQuery("From CustoAnual").list();
    }
}
