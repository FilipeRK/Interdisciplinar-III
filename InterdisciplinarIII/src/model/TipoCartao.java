package model;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

@Entity
@SequenceGenerator(name="seq_tipocartao", sequenceName="seq_tipocartao", allocationSize = 1)
public class TipoCartao implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator="seq_tipocartao")
    private int codtipocartao, tarifamensal;
    private String nome;

    public int getCodtipocartao() {
        return codtipocartao;
    }

    public void setCodtipocartao(int codtipocartao) {
        this.codtipocartao = codtipocartao;
    }

    public int getTarifamensal() {
        return tarifamensal;
    }

    public void setTarifamensal(int tarifamensal) {
        this.tarifamensal = tarifamensal;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
