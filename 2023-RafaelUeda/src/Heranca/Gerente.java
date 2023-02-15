package Heranca;

public class Gerente extends Funcionario {
    private int senha;
    private int numeroFuncionariosGerenciados;

    public Gerente(){
    }

    public boolean autentica(int senha) {
        return true;
    }
}
