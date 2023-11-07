package users;

public class Funcionario extends User{
    private String cargo;
    private int salario;
    private String dataAdmissao;
    private String numeroCarteiraTrabalho;

    public Funcionario(String nome, String email, String codigoCooperativa, String senha, String cargo, int salario, String dataAdmissao, String numeroCarteiraTrabalho) {
        super(nome, email, codigoCooperativa, senha);
        this.cargo = cargo;
        this.salario = salario;
        this.dataAdmissao = dataAdmissao;
        this.numeroCarteiraTrabalho = numeroCarteiraTrabalho;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public int getSalario() {
        return salario;
    }

    public void setSalario(int salario) {
        this.salario = salario;
    }

    public String getDataAdmissao() {
        return dataAdmissao;
    }

    public void setDataAdmissao(String dataAdmissao) {
        this.dataAdmissao = dataAdmissao;
    }

    public String getNumeroCarteiraTrabalho() {
        return numeroCarteiraTrabalho;
    }

    public void setNumeroCarteiraTrabalho(String numeroCarteiraTrabalho) {
        this.numeroCarteiraTrabalho = numeroCarteiraTrabalho;
    }
}
