package users;

public class User {
    protected String nome;
    protected String email;
    protected String codigoCooperativa;
    protected String senha;

    public User() {
    }

    public User(String nome, String email, String codigoCooperativa, String senha) {
        this.nome = nome;
        this.email = email;
        this.codigoCooperativa = codigoCooperativa;
        this.senha = senha;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCodigoCooperativa() {
        return codigoCooperativa;
    }

    public void setCodigoCooperativa(String codigoCooperativa) {
        this.codigoCooperativa = codigoCooperativa;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
}
