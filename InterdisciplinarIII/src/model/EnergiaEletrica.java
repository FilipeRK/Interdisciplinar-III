package model;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

@Entity
@SequenceGenerator(name="seq_energiaeletrica", sequenceName="seq_energiaeletrica", allocationSize = 1)
public class EnergiaEletrica implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator="seq_energiaeletrica")
    private int codenergiaeletrica;
    private String prestadora;
    private double valorhora;

    public int getCodenergiaeletrica() {
        return codenergiaeletrica;
    }

    public void setCodenergiaeletrica(int codenergiaeletrica) {
        this.codenergiaeletrica = codenergiaeletrica;
    }

    public String getPrestadora() {
        return prestadora;
    }

    public void setPrestadora(String prestadora) {
        this.prestadora = prestadora;
    }

    public double getValorhora() {
        return valorhora;
    }

    public void setValorhora(double valorhora) {
        this.valorhora = valorhora;
    }
}
