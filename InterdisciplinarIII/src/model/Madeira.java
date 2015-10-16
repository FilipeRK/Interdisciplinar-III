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
@SequenceGenerator(name="seq_madeira", sequenceName="seq_madeira", allocationSize = 1)
public class Madeira implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator="seq_madeira")
    private int codmadeira;
    private String nome;
    private double precounitario;
    
    @JoinColumn(name="codunidademadeira")
    @ManyToOne
    private UnidadeMadeira unidademadeira;

    public int getCodmadeira() {
        return codmadeira;
    }

    public void setCodmadeira(int codmadeira) {
        this.codmadeira = codmadeira;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPrecounitario() {
        return precounitario;
    }

    public void setPrecounitario(double precounitario) {
        this.precounitario = precounitario;
    }

    public UnidadeMadeira getUnidademadeira() {
        return unidademadeira;
    }

    public void setUnidademadeira(UnidadeMadeira unidademadeira) {
        this.unidademadeira = unidademadeira;
    }

}
