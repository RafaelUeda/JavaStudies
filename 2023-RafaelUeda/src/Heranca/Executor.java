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

        /*ControleDeBonificacoes cdb = new ControleDeBonificacoes();

        Gerente funcionario1 = new Gerente("Rafa", "0001", 5000.0);
        cdb.registra(funcionario1);

        Funcionario funcionario2 = new Funcionario("Tete", "0002", 5000.0);
        cdb.registra(funcionario2);

        Coordenador funcionario3 = new Coordenador("Mariana", "0003", 5000.00);
        cdb.registra(funcionario3);

        System.out.println(cdb.getTotalDeBonificacoes());
*/

        /*Funcionario funcionario = new Funcionario("Lisa", "0000", 5000.00);

        Gerente funcionario1 = new Gerente("Rafa", "0001", 5000.0);
        System.out.println(funcionario1.getValeAlimentacao());

        Funcionario funcionario2 = new Funcionario("Tete", "0002", 5000.0);
        System.out.println(funcionario2.getValeAlimentacao());

        Coordenador funcionario3 = new Coordenador("Mariana", "0003", 5000.00);
        System.out.println(funcionario3.getValeAlimentacao());

/*        System.out.println(funcionario1.getSalario());
        System.out.println(funcionario2.getSalario());
        System.out.println(funcionario3.getSalario());
*/
        Gerente gerente = new Gerente("Rafa", "100", 500.00);

    }
}
