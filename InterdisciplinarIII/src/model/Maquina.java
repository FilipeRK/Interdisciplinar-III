package model;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;


@Entity
@SequenceGenerator(name="seq_maquina", sequenceName="seq_maquina", allocationSize = 1)
public class Maquina implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator="seq_maquina")
    private int codmaquina, consumo, depreciacao;
    private String nome;
    private double precounitario, valormanutencao;

    public int getCodmaquina() {
        return codmaquina;
    }

    public void setCodmaquina(int codmaquina) {
        this.codmaquina = codmaquina;
    }

    public int getConsumo() {
        return consumo;
    }

    public void setConsumo(int consumo) {
        this.consumo = consumo;
    }

    public int getDepreciacao() {
        return depreciacao;
    }

    public void setDepreciacao(int depreciacao) {
        this.depreciacao = depreciacao;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPrecounitario() {
        return precounitario;
    }

    public void setPrecounitario(double precounitario) {
        this.precounitario = precounitario;
    }

    public double getValormanutencao() {
        return valormanutencao;
    }

    public void setValormanutencao(double valormanutencao) {
        this.valormanutencao = valormanutencao;
    }
}
