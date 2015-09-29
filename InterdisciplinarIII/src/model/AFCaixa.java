package model;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

@Entity
@SequenceGenerator(name="seq_afcaixa", sequenceName="seq_afcaixa", allocationSize = 1)
public class AFCaixa implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator="seq_afcaixa")
    private int codafcaixa;
    private String data, valor, tipo;

    public AFCaixa(){
        
    }
    
    public void setCodafcaixa(int codafcaixa) {
        this.codafcaixa = codafcaixa;
    }

    public void setData(String data) {
        this.data = data;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getCodafcaixa() {
        return codafcaixa;
    }

    public String getData() {
        return data;
    }

    public String getValor() {
        return valor;
    }

    public String getTipo() {
        return tipo;
    }


}
