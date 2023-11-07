package armazem;

import produto.Produto;
import users.Cliente;
import users.Cooperado;
import users.Funcionario;

import java.util.List;

public class Armazem {
    private int numeroArmazem;
    private String localizacao;
    private double capacidadeTon;
    private double capacidadeMetrosQuadrados;
    private Funcionario gerenteResponsavel;
    private List<Cooperado> listaCooperados;
    private List<Cliente> listaClientes;
    private List<Produto> listaProdutos;

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

    public List<Cooperado> getListaCooperados() {
        return listaCooperados;
    }

    public void setListaCooperados(List<Cooperado> listaCooperados) {
        this.listaCooperados = listaCooperados;
    }

    public List<Cliente> getListaClientes() {
        return listaClientes;
    }

    public void setListaClientes(List<Cliente> listaClientes) {
        this.listaClientes = listaClientes;
    }

    public List<Produto> getListaProdutos() {
        return listaProdutos;
    }

    public void setListaProdutos(List<Produto> listaProdutos) {
        this.listaProdutos = listaProdutos;
    }
}
