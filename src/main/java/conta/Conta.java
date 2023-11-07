package conta;

import users.Cooperado;

import java.util.List;

public class Conta {
    private long numeroConta;
    private String dataAbertura;
    private long montante;
    private Cooperado cooperado;

    public Conta(long numeroConta, String dataAbertura, long montante, Cooperado cooperado) {
        this.numeroConta = numeroConta;
        this.dataAbertura = dataAbertura;
        this.montante = montante;
        this.cooperado = cooperado;
    }

    public Conta(long numeroConta, String dataAbertura, Cooperado cooperado) {
        this.numeroConta = numeroConta;
        this.dataAbertura = dataAbertura;
        this.cooperado = cooperado;
    }

    public long getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(long numeroConta) {
        this.numeroConta = numeroConta;
    }

    public String getDataAbertura() {
        return dataAbertura;
    }

    public void setDataAbertura(String dataAbertura) {
        this.dataAbertura = dataAbertura;
    }

    public long getMontante() {
        return montante;
    }

    public void setMontante(long montante) {
        this.montante = montante;
    }

    public Cooperado getCooperado() {
        return cooperado;
    }

    public void setCooperado(Cooperado cooperado) {
        this.cooperado = cooperado;
    }
}
