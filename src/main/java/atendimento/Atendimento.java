package atendimento;

import users.Cooperado;
import users.Funcionario;

public class Atendimento {
    private Cooperado cooperado;
    private Funcionario funcionario;
    private String dataAtendimento;
    private String descricao;
    private boolean concluido;

    public Atendimento(Cooperado cooperado, Funcionario funcionario, String dataAtendimento, String descricao) {
        this.cooperado = cooperado;
        this.funcionario = funcionario;
        this.dataAtendimento = dataAtendimento;
        this.descricao = descricao;
        this.concluido = false;
    }

    public Cooperado getCooperado() {
        return cooperado;
    }

    public void setCooperado(Cooperado cooperado) {
        this.cooperado = cooperado;
    }

    public Funcionario getFuncionario() {
        return funcionario;
    }

    public void setFuncionario(Funcionario funcionario) {
        this.funcionario = funcionario;
    }

    public String getDataAtendimento() {
        return dataAtendimento;
    }

    public void setDataAtendimento(String dataAtendimento) {
        this.dataAtendimento = dataAtendimento;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public boolean isConcluido() {
        return concluido;
    }

    public void setConcluido(boolean concluido) {
        this.concluido = concluido;
    }
}
