package Heranca;

public class Gerente extends Funcionario implements Autenticavel {
    private int senha;
    private int numeroFuncionariosGerenciados;

    @Override
    public double getBonificacao() {
        return super.getSalario()*0.10 + 1000.00;
    }

    @Override
    public double getValeAlimentacao() {
        return super.getSalario()*0.10 + 400.00;
    }

    public Gerente(String nome, String cpf, double salario, int senha, int numeroFuncionariosGerenciados) {
        super(nome, cpf, salario);
        this.senha = senha;
        this.numeroFuncionariosGerenciados = numeroFuncionariosGerenciados;
    }

    public Gerente(String nome, String cpf, double salario) {
        super(nome, cpf, salario);
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

    @Override
    public boolean autentica(int senha) {
        return true;
    }
}
