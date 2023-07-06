package Aula40;

public class Professor extends Pessoa {

    private double salario;
    private String nomeCurso;

    public void verificarAcesso(){
        this.nomeVisibilidade = "";
    }

    public Professor() {
        super();
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getNomeCurso() {
        return nomeCurso;
    }

    public void setNomeCurso(String nomeCurso) {
        this.nomeCurso = nomeCurso;
    }

    public String obterEtiquetaEndereco(){
        String s = "Esndereço do Professor: ";
        s += super.getEndereco();

        return s;
    }
}
