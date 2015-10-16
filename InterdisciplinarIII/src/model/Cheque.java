package model;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Temporal;


@Entity
@SequenceGenerator(name="seq_cheque", sequenceName="seq_cheque", allocationSize = 1)
public class Cheque implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator="seq_cheque")
    private int codcheque, numerocheque;
    private double valor;
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date data;
    
    @JoinColumn(name="codcliente")
    @ManyToOne
    private Cliente cliente;
    
    @JoinColumn(name="codbanco")
    @ManyToOne
    private Banco banco;

    public int getCodcheque() {
        return codcheque;
    }

    public void setCodcheque(int codcheque) {
        this.codcheque = codcheque;
    }

    public int getNumerocheque() {
        return numerocheque;
    }

    public void setNumerocheque(int numerocheque) {
        this.numerocheque = numerocheque;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Banco getBanco() {
        return banco;
    }

    public void setBanco(Banco banco) {
        this.banco = banco;
    }
}
