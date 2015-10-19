package model;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Temporal;


@Entity
@SequenceGenerator(name="seq_funcionario", sequenceName="seq_funcionario", allocationSize = 1)
public class Funcionario implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator="seq_funcionario")
    private int codfuncionario;
    private int horasano;
    private String nome, funcao, endereco, cpf, telefone;
    private double salariobase, salariofinal, inss, insalubridade, quinquenio, sindicato, customediomensal,
            custototalano, customodhora, custodia, custohora;
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date dataadmissao;

    public int getCodfuncionario() {
        return codfuncionario;
    }

    public void setCodfuncionario(int codfuncionario) {
        this.codfuncionario = codfuncionario;
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

    public String getFuncao() {
        return funcao;
    }

    public void setFuncao(String funcao) {
        this.funcao = funcao;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public double getSalariobase() {
        return salariobase;
    }

    public void setSalariobase(double salariobase) {
        this.salariobase = salariobase;
    }

    public double getSalariofinal() {
        return salariofinal;
    }

    public void setSalariofinal(double salariofinal) {
        this.salariofinal = salariofinal;
    }

    public double getInss() {
        return inss;
    }

    public void setInss(double inss) {
        this.inss = inss;
    }

    public double getInsalubridade() {
        return insalubridade;
    }

    public void setInsalubridade(double insalubridade) {
        this.insalubridade = insalubridade;
    }

    public double getQuinquenio() {
        return quinquenio;
    }

    public void setQuinquenio(double quinquenio) {
        this.quinquenio = quinquenio;
    }

    public double getSindicato() {
        return sindicato;
    }

    public void setSindicato(double sindicato) {
        this.sindicato = sindicato;
    }

    public double getCustomediomensal() {
        return customediomensal;
    }

    public void setCustomediomensal(double customediomensal) {
        this.customediomensal = customediomensal;
    }

    public double getCustototalano() {
        return custototalano;
    }

    public void setCustototalano(double custototalano) {
        this.custototalano = custototalano;
    }

    public double getCustomodhora() {
        return customodhora;
    }

    public void setCustomodhora(double customodhora) {
        this.customodhora = customodhora;
    }

    public double getCustodia() {
        return custodia;
    }

    public void setCustodia(double custodia) {
        this.custodia = custodia;
    }

    public double getCustohora() {
        return custohora;
    }

    public void setCustohora(double custohora) {
        this.custohora = custohora;
    }

    public Date getDataadmissao() {
        return dataadmissao;
    }

    public void setDataadmissao(Date dataadmissao) {
        this.dataadmissao = dataadmissao;
    }
}
