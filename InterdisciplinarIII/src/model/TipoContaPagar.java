package model;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;


@Entity
@SequenceGenerator(name="seq_tipocontapagar", sequenceName="seq_tipocontapagar", allocationSize = 1)
public class TipoContaPagar implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator="seq_tipocontapagar")
    private int codtipocontapagar;
    private String nome;

    public int getCodtipocontapagar() {
        return codtipocontapagar;
    }

    public void setCodtipocontapagar(int codtipocontapagar) {
        this.codtipocontapagar = codtipocontapagar;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
