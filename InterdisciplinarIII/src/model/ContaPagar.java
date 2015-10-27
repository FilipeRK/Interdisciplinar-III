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
@SequenceGenerator(name="seq_contapagar", sequenceName="seq_contapagar", allocationSize = 1)
public class ContaPagar implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator="seq_contapagar")
    private int codcontapagar;
    private double valor;
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date dataconta, datavencimento;
    private String credor;
    
    @JoinColumn(name="codtipocontapagar")
    @ManyToOne
    private TipoContaPagar tipocontapagar;

    public int getCodcontapagar() {
        return codcontapagar;
    }

    public void setCodcontapagar(int codcontapagar) {
        this.codcontapagar = codcontapagar;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public Date getDataconta() {
        return dataconta;
    }

    public void setDataconta(Date dataconta) {
        this.dataconta = dataconta;
    }

    public Date getDatavencimento() {
        return datavencimento;
    }

    public void setDatavencimento(Date datavencimento) {
        this.datavencimento = datavencimento;
    }

    public TipoContaPagar getTipocontapagar() {
        return tipocontapagar;
    }

    public void setTipocontapagar(TipoContaPagar tipocontapagar) {
        this.tipocontapagar = tipocontapagar;
    }
    
    public String getCredor() {
        return credor;
    }

    public void setCredor(String credor) {
        this.credor = credor;
    }
}
