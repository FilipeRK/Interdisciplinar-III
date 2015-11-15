package model;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;

@Entity
@SequenceGenerator(name="seq_usuario", sequenceName="seq_usuario", allocationSize = 1)
public class Usuario implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator="seq_usuario")
    private int codusuario;
    
    private String usuario, senha;

    public void setCodusuario(int codusuario) {
        this.codusuario = codusuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public int getCodusuario() {
        return codusuario;
    }

    public String getUsuario() {
        return usuario;
    }

    public String getSenha() {
        return senha;
    }
}
