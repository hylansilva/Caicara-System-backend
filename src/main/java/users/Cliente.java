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
}
