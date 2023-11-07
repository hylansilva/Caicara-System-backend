package armazem;

import users.Funcionario;

public class Armazem {
    private int numeroArmazem;
    private String localizacao;
    private double capacidadeTon;
    private double capacidadeMetrosQuadrados;
    private Funcionario gerenteResponsavel;

    public Armazem() {
    }

    public Armazem(int numeroArmazem, String localizacao, double capacidadeTon, double capacidadeMetrosQuadrados, Funcionario gerenteResponsavel) {
        this.numeroArmazem = numeroArmazem;
        this.localizacao = localizacao;
        this.capacidadeTon = capacidadeTon;
        this.capacidadeMetrosQuadrados = capacidadeMetrosQuadrados;
        this.gerenteResponsavel = gerenteResponsavel;
    }

    public Armazem(int numeroArmazem, String localizacao, double capacidadeTon, double capacidadeMetrosQuadrados) {
        this.numeroArmazem = numeroArmazem;
        this.localizacao = localizacao;
        this.capacidadeTon = capacidadeTon;
        this.capacidadeMetrosQuadrados = capacidadeMetrosQuadrados;
    }

    public int getNumeroArmazem() {
        return numeroArmazem;
    }

    public void setNumeroArmazem(int numeroArmazem) {
        this.numeroArmazem = numeroArmazem;
    }

    public String getLocalizacao() {
        return localizacao;
    }

    public void setLocalizacao(String localizacao) {
        this.localizacao = localizacao;
    }

    public double getCapacidadeTon() {
        return capacidadeTon;
    }

    public void setCapacidadeTon(double capacidadeTon) {
        this.capacidadeTon = capacidadeTon;
    }

    public double getCapacidadeMetrosQuadrados() {
        return capacidadeMetrosQuadrados;
    }

    public void setCapacidadeMetrosQuadrados(double capacidadeMetrosQuadrados) {
        this.capacidadeMetrosQuadrados = capacidadeMetrosQuadrados;
    }

    public Funcionario getGerenteResponsavel() {
        return gerenteResponsavel;
    }

    public void setGerenteResponsavel(Funcionario gerenteResponsavel) {
        this.gerenteResponsavel = gerenteResponsavel;
    }
}
