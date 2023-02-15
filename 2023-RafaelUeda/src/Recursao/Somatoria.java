package Recursao;

public class Somatoria {

    public Somatoria() {

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

    /*public int potenciaDeTres(int valor) {
        //condição de parada
        if (valor == 0) {
            return 0;
        }

        //definir o retorno

        //definir o retorno da chamada recursiva => return potenciaDeTres(valor);
    }*/


}
