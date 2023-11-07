package produto;

public class Produto {
    private String nome;
    private double peso;
    private double quantidade;
    private double temperaturaArmazenamento;
    private String tipo;

    public Produto() {
    }

    public Produto(String nome, double peso, double quantidade, double temperaturaArmazenamento, String tipo) {
        this.nome = nome;
        this.peso = peso;
        this.quantidade = quantidade;
        this.temperaturaArmazenamento = temperaturaArmazenamento;
        this.tipo = tipo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(double quantidade) {
        this.quantidade = quantidade;
    }

    public double getTemperaturaArmazenamento() {
        return temperaturaArmazenamento;
    }

    public void setTemperaturaArmazenamento(double temperaturaArmazenamento) {
        this.temperaturaArmazenamento = temperaturaArmazenamento;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}
