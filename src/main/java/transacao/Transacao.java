package transacao;

import armazem.Armazem;
import produto.Produto;
import users.Cliente;
import users.Cooperado;

import java.util.List;

public class Transacao {
    private long numeroTransacao;
    private String dataTransacao;
    private long montante;
    private Cooperado cooperado;
    private Cliente cliente;
    private Armazem armazem;
    private List<Produto> listaProdutos;

    public Transacao(long numeroTransacao, String dataTransacao, long montante, Cooperado cooperado, Cliente cliente, Armazem armazem, List<Produto> listaProdutos) {
        this.numeroTransacao = numeroTransacao;
        this.dataTransacao = dataTransacao;
        this.montante = montante;
        this.cooperado = cooperado;
        this.cliente = cliente;
        this.armazem = armazem;
        this.listaProdutos = listaProdutos;
    }

    public long getNumeroTransacao() {
        return numeroTransacao;
    }

    public void setNumeroTransacao(long numeroTransacao) {
        this.numeroTransacao = numeroTransacao;
    }

    public String getDataTransacao() {
        return dataTransacao;
    }

    public void setDataTransacao(String dataTransacao) {
        this.dataTransacao = dataTransacao;
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

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Armazem getArmazem() {
        return armazem;
    }

    public void setArmazem(Armazem armazem) {
        this.armazem = armazem;
    }

    public List<Produto> getListaProdutos() {
        return listaProdutos;
    }

    public void setListaProdutos(List<Produto> listaProdutos) {
        this.listaProdutos = listaProdutos;
    }
}
