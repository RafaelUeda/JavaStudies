package introducaoOO;

public class Executor {

    public static void main(String[] args) {
    Conta conta1 = new Conta(1, "Rafael", 20.00, "Poupanca");
    Conta conta2 = new Conta(2, "Giulia", 1000.00, "Corrente");
    //conta1.depositar(22.0);

    conta1.extrato();
    conta2.extrato();
    conta1.transferir(conta2,10.00);
    conta1.extrato();
    conta2.extrato();
    }
}
