package Heranca;

public class Coordenador extends Funcionario {
    private String projetos;
    private String equipes;

    public Coordenador() {
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

