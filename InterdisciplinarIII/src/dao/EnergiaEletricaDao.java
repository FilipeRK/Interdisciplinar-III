package dao;

import java.util.List;
import javax.swing.JOptionPane;
import model.EnergiaEletrica;
import org.hibernate.Session;
import org.hibernate.Transaction;
import util.HibernateUtil;


public class EnergiaEletricaDao {
 public EnergiaEletricaDao(){
        session = HibernateUtil.getSessionFactory().openSession();
    }
    
    private final Session session;
    
    public void insert(EnergiaEletrica ban){
        Transaction t = session.beginTransaction();
        
        session.save(ban);
        t.commit();
    }
    
    public void update(EnergiaEletrica ban){
        Transaction t = session.beginTransaction();
        
        session.merge(ban);
        t.commit();
    }
    
    public void delete(EnergiaEletrica ban){
        Transaction t = session.beginTransaction();
        
        session.delete(ban);
        try{
            t.commit();  
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Não é possível deletar! \n\n Este campo está sendo usado em outra tabela.", "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    public EnergiaEletrica findById(int id){
        return (EnergiaEletrica) session.load(EnergiaEletrica.class, id);
    }
    
    public List<EnergiaEletrica> findAll(){ 
        return session.createQuery("From EnergiaEletrica").list();
    }
}
