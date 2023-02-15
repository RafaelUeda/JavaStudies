package introducaoOO;

public class Teste2 {
    public int abc(int x, int y) {
        if (y == 0) {
            return 1;
        }
        return abc(x, y-1)*x;
    }
    public static void main(String[] args) {
        Teste2 xyz = new Teste2();
        System.out.println(xyz.abc(2,3));
    }
}
