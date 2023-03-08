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

    public int potencia(int base, int expoente) {
        if (expoente == 0) {
            return 1;
        }
        return base*potencia(base, expoente - 1);
    }

    public int fib(int valor) {
        if (valor < 2) {
            return valor;
        }
        return fib(valor - 1) + fib(valor - 2);
    }


    /* FATORIAL RECURSIVO */
    public long fatorial(long n) {
        if (n < 2) {
            return 1;
        }
        return n * fatorial(n-1);
    }
}
