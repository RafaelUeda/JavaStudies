package Heranca;
//criação do coordenador
public class Coordenador extends Funcionario {
    private String projetos;
    private String equipes;

    public Coordenador(String nome, String cpf, double salario, String projetos, String equipes) {
        super(nome, cpf, salario);
        this.projetos = projetos;
        this.equipes = equipes;
    }

    public String getProjetos() {
        return projetos;
    }

    public void setProjetos(String projetos) {
        this.projetos = projetos;
    }

    public String getEquipes() {
        return equipes;
    }

    public void setEquipes(String equipes) {
        this.equipes = equipes;
    }
}

