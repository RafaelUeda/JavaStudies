package Recursao;

public class Recursao {

    public Recursao() {

    }

    /* SEM RECURSÃO */

    public int somatorioSemRecursao(int valor) {
        int soma = 0;
        for (int i = 0; i <= valor; i++) {
            soma += i;
        }
        return soma;
    }

    /* COM RECURSÃO */

    public int somatorioComRecursao(int valor) {
        if (valor == 0) {
            return 0;
        }
        return valor + somatorioComRecursao(valor - 1);
    }

    public int potenciaDeDois(int valor) {
        return valor * valor;
    }

    public int fib(int valor) {
        if (valor < 2) {
            return valor;
        }
        return fib(valor - 1) + fib(valor - 2);
    }
}
