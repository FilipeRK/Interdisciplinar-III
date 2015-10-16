package model;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;


@Entity
@SequenceGenerator(name="seq_unidademadeira", sequenceName="seq_unidademadeira", allocationSize = 1)
public class UnidadeMadeira implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator="seq_unidademadeira")
    private int codunidademadeira;
    private String nome;

    public int getCodunidademadeira() {
        return codunidademadeira;
    }

    public void setCodunidademadeira(int codunidademadeira) {
        this.codunidademadeira = codunidademadeira;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
