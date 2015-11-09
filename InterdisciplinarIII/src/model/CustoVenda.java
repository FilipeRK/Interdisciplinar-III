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
@SequenceGenerator(name="seq_custovenda", sequenceName="seq_custovenda", allocationSize = 1)
public class CustoVenda implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator="seq_custovenda")
    private int codcustovenda;
    private int perda, margemlucro, horas, minutos;
    private double custoadicional, custofinal, valorfinal, tamanhomadeira;
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date datavenda;
    
    @JoinColumn(name="codmaquina")
    @ManyToOne
    private Maquina maquina;
    
    @JoinColumn(name="codenergiaeletrica")
    @ManyToOne
    private EnergiaEletrica energiaeletrica;
    
    @JoinColumn(name="codfuncionario")
    @ManyToOne
    private Funcionario funcionario;
    
    @JoinColumn(name="codmadeira")
    @ManyToOne
    private Madeira madeira;

    public int getCodcustovenda() {
        return codcustovenda;
    }

    public void setCodcustovenda(int codcustovenda) {
        this.codcustovenda = codcustovenda;
    }

    public int getPerda() {
        return perda;
    }

    public void setPerda(int perda) {
        this.perda = perda;
    }

    public int getMargemlucro() {
        return margemlucro;
    }

    public void setMargemlucro(int margemlucro) {
        this.margemlucro = margemlucro;
    }

    public double getCustoadicional() {
        return custoadicional;
    }

    public void setCustoadicional(double custoadicional) {
        this.custoadicional = custoadicional;
    }

    public double getCustofinal() {
        return custofinal;
    }

    public void setCustofinal(double custofinal) {
        this.custofinal = custofinal;
    }

    public double getValorfinal() {
        return valorfinal;
    }

    public void setValorfinal(double valorfinal) {
        this.valorfinal = valorfinal;
    }

    public Date getDatavenda() {
        return datavenda;
    }

    public void setDatavenda(Date datavenda) {
        this.datavenda = datavenda;
    }

    public Maquina getMaquina() {
        return maquina;
    }

    public void setMaquina(Maquina maquina) {
        this.maquina = maquina;
    }

    public EnergiaEletrica getEnergiaeletrica() {
        return energiaeletrica;
    }

    public void setEnergiaeletrica(EnergiaEletrica energiaeletrica) {
        this.energiaeletrica = energiaeletrica;
    }

    public Funcionario getFuncionario() {
        return funcionario;
    }

    public void setFuncionario(Funcionario funcionario) {
        this.funcionario = funcionario;
    }

    public Madeira getMadeira() {
        return madeira;
    }

    public void setMadeira(Madeira madeira) {
        this.madeira = madeira;
    }  
    
    public int getHoras() {
        return horas;
    }

    public void setHoras(int horas) {
        this.horas = horas;
    }
    
    public double getTamanhomadeira() {
        return tamanhomadeira;
    }

    public void setTamanhomadeira(double tamanhomadeira) {
        this.tamanhomadeira = tamanhomadeira;
    }

    public int getMinutos() {
        return minutos;
    }

    public void setMinutos(int minutos) {
        this.minutos = minutos;
    }
}
