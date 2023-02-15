package introducaoOO;

import java.util.Scanner;

public class Teste {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int v = -1;
        do {
            v = scanner.nextInt();
        } while (v <= 0);
        int r = 1;
        for (int i = v; i > 1; i--){
            r *= i;
        }
        System.out.println(r);
    }
}
