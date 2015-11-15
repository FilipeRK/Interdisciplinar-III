package dao;

import java.io.IOException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.Transaction;
import model.Usuario;
import util.HibernateUtil;

public class UsuarioDao {
    
    public UsuarioDao(){
        session = HibernateUtil.getSessionFactory().openSession();
    }
    public boolean logado;
    private final Session session;
    public String usuarioPLog, senhaPLog, retornaCodUser;

    public boolean findUser(String usuario, String senha) throws IOException{
    
        List teste;
        teste = session.createQuery("From Usuario where usuario = '"+usuario+"' and senha = '"+senha+"'").list();

        if(teste.size() == 1){
            logado = true;
            
            usuarioPLog = usuario;
            senhaPLog = senha;
            return logado;
        }else{
            logado = false;
            return logado;
        }
    }
    
    public int retornaCodUser(){       
        List retorno = session.createSQLQuery("SELECT CODUSUARIO FROM USUARIO WHERE USUARIO = '"+usuarioPLog+"'").list(); 
        Object primeiraLinha = retorno.get(0); 
        String codigousuario = String.valueOf(primeiraLinha);
        int codRCU = Integer.valueOf(codigousuario);
        
        return codRCU;
    } 
    
    public void insert(Usuario usuario){
        Transaction t = session.beginTransaction();
        
        session.save(usuario);
        t.commit();
    }
    
    public void update(Usuario usuario){
        Transaction t = session.beginTransaction();
        
        session.merge(usuario);
        t.commit();
    }
    
    public void delete(Usuario usuario){
        Transaction t = session.beginTransaction();
        
        session.delete(usuario);
        t.commit();
    }
}
