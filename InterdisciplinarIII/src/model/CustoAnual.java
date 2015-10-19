package model;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;


@Entity
@SequenceGenerator(name="seq_custoanual", sequenceName="seq_custoanual", allocationSize = 1)
public class CustoAnual implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator="seq_custoanual")
    private int codcustoanual;
    private int horasano;
    private String nome;
    private double mediames, totalano, custodia;

    public int getCodcustoanual() {
        return codcustoanual;
    }

    public void setCodcustoanual(int codcustoanual) {
        this.codcustoanual = codcustoanual;
    }

    public int getHorasano() {
        return horasano;
    }

    public void setHorasano(int horasano) {
        this.horasano = horasano;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getMediames() {
        return mediames;
    }

    public void setMediames(double mediames) {
        this.mediames = mediames;
    }

    public double getTotalano() {
        return totalano;
    }

    public void setTotalano(double totalano) {
        this.totalano = totalano;
    }

    public double getCustodia() {
        return custodia;
    }

    public void setCustodia(double custodia) {
        this.custodia = custodia;
    }
}
