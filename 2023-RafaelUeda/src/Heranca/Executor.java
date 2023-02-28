package Heranca;

public class Executor {
    public static void main(String[] args) {
        /*Gerente gerente = new Gerente();
        System.out.println(gerente.getNome());

        gerente.setNome("Rafael");
        System.out.println(gerente.getNome());

        Coordenador coordenador = new Coordenador();
        System.out.println(coordenador.getEquipes());

        coordenador.setEquipes("Equipe - 1");
        System.out.println(coordenador.getEquipes());

        coordenador.setProjetos("Projeto - X");
        System.out.println(coordenador.getProjetos());*/



        //Funcionario funcionario = new Funcionario("Rafael", "06381323981", 1000.00);
        //System.out.println(funcionario.getBonificacao());

        /*Gerente gerente = new Gerente("Rafa", "0001", 3000.00);
        gerente.setSalario(5000.00);
        System.out.println(gerente.getBonificacao());*/

        /*Gerente gerente = new Gerente("Rafa", "0001", 5000.00);
        Funcionario funcionario = gerente;
        System.out.println(funcionario.getBonificacao());*/

        ControleDeBonificacoes controleDeBonificacoes = new ControleDeBonificacoes();
        Gerente funcionario1 = new Gerente("Rafa", "0001", 5000.0);
        controleDeBonificacoes.registra(funcionario1);

        System.out.println(controleDeBonificacoes.getTotalDeBonificacoes());

    }
}
