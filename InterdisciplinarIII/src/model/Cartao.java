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
@SequenceGenerator(name="seq_cartao", sequenceName="seq_cartao", allocationSize = 1)
public class Cartao implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator="seq_cartao")
    private int codcartao;
    private double valorvenda, valorfinal, tarifa;
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date datacad, dacatred;

    @JoinColumn(name="codcliente")
    @ManyToOne
    private TipoCartao tipocartao;

    public int getCodcartao() {
        return codcartao;
    }

    public void setCodcartao(int codcartao) {
        this.codcartao = codcartao;
    }

    public Date getDatacad() {
        return datacad;
    }

    public void setDatacad(Date datacad) {
        this.datacad = datacad;
    }

    public Date getDacatred() {
        return dacatred;
    }

    public void setDacatred(Date dacatred) {
        this.dacatred = dacatred;
    }

    public double getValorvenda() {
        return valorvenda;
    }

    public void setValorvenda(double valorvenda) {
        this.valorvenda = valorvenda;
    }

    public double getValorfinal() {
        return valorfinal;
    }

    public void setValorfinal(double valorfinal) {
        this.valorfinal = valorfinal;
    }

    public double getTarifa() {
        return tarifa;
    }

    public void setTarifa(double tarifa) {
        this.tarifa = tarifa;
    }

    public TipoCartao getTipocartao() {
        return tipocartao;
    }

    public void setTipocartao(TipoCartao tipocartao) {
        this.tipocartao = tipocartao;
    }
 
}
