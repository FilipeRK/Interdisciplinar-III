package dao;

import java.util.List;
import javax.swing.JOptionPane;
import model.Funcionario;
import org.hibernate.Session;
import org.hibernate.Transaction;
import util.HibernateUtil;


public class FuncionarioDao {
  public FuncionarioDao(){
        session = HibernateUtil.getSessionFactory().openSession();
    }
    
    private final Session session;
    
    public void insert(Funcionario ban){
        Transaction t = session.beginTransaction();
        
        session.save(ban);
        t.commit();
    }
    
    public void update(Funcionario ban){
        Transaction t = session.beginTransaction();
        
        session.merge(ban);
        t.commit();
    }
    
    public void delete(Funcionario ban){
        Transaction t = session.beginTransaction();
        
        session.delete(ban);
        try{
            t.commit();  
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Não é possível deletar! \n\n Este campo está sendo usado em outra tabela.", "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    public Funcionario findById(int id){
        return (Funcionario) session.load(Funcionario.class, id);
    }
    
    public List<Funcionario> findAll(){ 
        return session.createQuery("From Funcionario").list();
    }
}
