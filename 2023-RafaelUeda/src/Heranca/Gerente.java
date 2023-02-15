package Heranca;

public class Gerente extends Funcionario {
    private int senha;
    private int numeroFuncionariosGerenciados;

    public Gerente(){
    }

    public int getSenha() {
        return senha;
    }

    public void setSenha(int senha) {
        this.senha = senha;
    }

    public int getNumeroFuncionariosGerenciados() {
        return numeroFuncionariosGerenciados;
    }

    public void setNumeroFuncionariosGerenciados(int numeroFuncionariosGerenciados) {
        this.numeroFuncionariosGerenciados = numeroFuncionariosGerenciados;
    }

    public boolean autentica(int senha) {
        return true;
    }
}
