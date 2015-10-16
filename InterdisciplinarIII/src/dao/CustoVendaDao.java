package dao;

import java.util.List;
import javax.swing.JOptionPane;
import model.CustoVenda;
import org.hibernate.Session;
import org.hibernate.Transaction;
import util.HibernateUtil;


public class CustoVendaDao {
    public CustoVendaDao(){
        session = HibernateUtil.getSessionFactory().openSession();
    }
    
    private final Session session;
    
    public void insert(CustoVenda ban){
        Transaction t = session.beginTransaction();
        
        session.save(ban);
        t.commit();
    }
    
    public void update(CustoVenda ban){
        Transaction t = session.beginTransaction();
        
        session.merge(ban);
        t.commit();
    }
    
    public void delete(CustoVenda ban){
        Transaction t = session.beginTransaction();
        
        session.delete(ban);
        try{
            t.commit();  
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Não é possível deletar! \n\n Este campo está sendo usado em outra tabela.", "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    public CustoVenda findById(int id){
        return (CustoVenda) session.load(CustoVenda.class, id);
    }
    
    public List<CustoVenda> findAll(){ 
        return session.createQuery("From CustoVenda").list();
    }
}