package introducaoOO;

public class Conta {
    public int numeroConta;
    public String nomeTitular;
    public Double saldo;
    public String tipoConta;

    public Conta() {
        System.out.println("Construtor vazio.");
    }

    public Conta(int numeroConta, String nomeTitular, Double saldo, String tipoConta) {
        this.numeroConta = numeroConta;
        this.nomeTitular = nomeTitular;
        this.saldo = saldo;
        this.tipoConta = tipoConta;
        System.out.println("Construtor com parametros");
    }

    public void exibeBanco() {
        System.out.println("Banco do Brasil.");
    }

    public void depositar(Double valor) {
        extrato();
        if (valor > 0) {
            this.saldo += valor;
        } else {
            System.out.println("Insira um valor correto.");
        } extrato();
    }

    public void sacar(Double valor) {
        if (valor <= this.saldo) {
            this.saldo = this.saldo - valor;
        } else {
            System.out.println("Quantia informada maior que o saldo disponivel. Insira um novo valor.");
        }
    }

    public String getNomeTitular() {
        return this.nomeTitular;
    }

    public Double getSaldo() {
        return this.saldo;
    }

    public void extrato() {
        System.out.println("Numero da conta: " + this.numeroConta);
        System.out.println("Nome do titular: " + this.nomeTitular);
        System.out.println("Saldo: " + this.saldo + "R$");
        System.out.println("Tipo de conta: " + this.tipoConta);
    }

    public void transferir(Conta contaTranseferencia, Double valor){
        if (valor <= this.saldo) {
            this.saldo -= valor;
            contaTranseferencia.saldo += valor;
        }
    }
}
