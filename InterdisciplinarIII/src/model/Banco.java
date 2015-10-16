package model;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;


@Entity
@SequenceGenerator(name="seq_banco", sequenceName="seq_banco", allocationSize = 1)
public class Banco implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator="seq_banco")
    private int codbanco;
    private String nome;

    public int getCodbanco() {
        return codbanco;
    }

    public void setCodbanco(int codbanco) {
        this.codbanco = codbanco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
