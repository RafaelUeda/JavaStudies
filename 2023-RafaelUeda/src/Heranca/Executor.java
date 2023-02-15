package Heranca;

public class Executor {
    public static void main(String[] args) {
        Gerente gerente = new Gerente();
        System.out.println(gerente.getNome());

        gerente.setNome("Rafael");
        System.out.println(gerente.getNome());

        Coordenador coordenador = new Coordenador();
        System.out.println(coordenador.getEquipes());

        coordenador.setEquipes("Equipe - 1");
        System.out.println(coordenador.getEquipes());

        coordenador.setProjetos("Projeto - X");
        System.out.println(coordenador.getProjetos());
    }
}
