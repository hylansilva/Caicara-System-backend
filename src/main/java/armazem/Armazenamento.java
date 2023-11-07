package armazem;

import produto.Produto;
import users.Cooperado;

public class Armazenamento {
    private Armazem armazem;
    private Produto produto;
    private Cooperado cooperado;

    public Armazenamento() {
    }

    public Armazenamento(Armazem armazem, Produto produto, Cooperado cooperado) {
        this.armazem = armazem;
        this.produto = produto;
        this.cooperado = cooperado;
    }

    public Armazem getArmazem() {
        return armazem;
    }

    public void setArmazem(Armazem armazem) {
        this.armazem = armazem;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public Cooperado getCooperado() {
        return cooperado;
    }

    public void setCooperado(Cooperado cooperado) {
        this.cooperado = cooperado;
    }
}
