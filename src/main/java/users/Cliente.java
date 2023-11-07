package users;

public class Cliente extends User{
    private String  nome;
    private String cnpj;
    private String endereco;
    private String telefone;

    public Cliente() {
    }

    public Cliente(String nome, String email, String codigoCooperativa, String senha, String nome1, String cnpj, String endereco, String telefone) {
        super(nome, email, codigoCooperativa, senha);
        this.nome = nome1;
        this.cnpj = cnpj;
        this.endereco = endereco;
        this.telefone = telefone;
    }

    @Override
    public String getNome() {
        return nome;
    }

    @Override
    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
}
