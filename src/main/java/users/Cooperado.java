package users;

import armazem.Armazem;
import conta.Conta;

public class Cooperado extends User{
     private Conta conta;
     private String rg;
     private String cpf;
     private String quantidadeFamiliares;
     private String endereco;
     private String telefone;
     private Armazem armazem;

     public Cooperado() {
     }

     public Cooperado(String nome, String email, String codigoCooperativa, String senha, Conta conta, String rg, String cpf, String quantidadeFamiliares, String endereco, String telefone, Armazem armazem) {
          super(nome, email, codigoCooperativa, senha);
          this.conta = conta;
          this.rg = rg;
          this.cpf = cpf;
          this.quantidadeFamiliares = quantidadeFamiliares;
          this.endereco = endereco;
          this.telefone = telefone;
          this.armazem = armazem;
     }

     public Cooperado(String nome, String email, String codigoCooperativa, String senha, String rg, String cpf, String quantidadeFamiliares, String endereco, String telefone) {
          super(nome, email, codigoCooperativa, senha);
          this.rg = rg;
          this.cpf = cpf;
          this.quantidadeFamiliares = quantidadeFamiliares;
          this.endereco = endereco;
          this.telefone = telefone;
     }

     public Conta getConta() {
          return conta;
     }

     public void setConta(Conta conta) {
          this.conta = conta;
     }

     public String getRg() {
          return rg;
     }

     public void setRg(String rg) {
          this.rg = rg;
     }

     public String getCpf() {
          return cpf;
     }

     public void setCpf(String cpf) {
          this.cpf = cpf;
     }

     public String getQuantidadeFamiliares() {
          return quantidadeFamiliares;
     }

     public void setQuantidadeFamiliares(String quantidadeFamiliares) {
          this.quantidadeFamiliares = quantidadeFamiliares;
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

     public Armazem getArmazem() {
          return armazem;
     }

     public void setArmazem(Armazem armazem) {
          this.armazem = armazem;
     }
}
