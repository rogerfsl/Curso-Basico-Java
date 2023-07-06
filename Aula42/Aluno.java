package Aula42;

import java.util.Arrays;
import java.util.Objects;

public class Aluno  {

    private String curso;
    private double[] notas;

    public void verificarAcesso(){
       // this.nomeVisibilidade  ="XD";
       // super.nomeVisibilidade = "Welson";

        //super.setNomeVisibilidade("Welson");
    }

    public Aluno() {
        super();
    }

    public Aluno(String nome, String endereco, String telefone, String curso) {
        //super(nome, endereco, telefone);
        this.curso = curso;
    }

    @Override
    public String toString() {
        return "Aluno{" +
                "curso='" + curso + '\'' +
                ", notas=" + Arrays.toString(notas) +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Aluno aluno = (Aluno) o;
        return Objects.equals(curso, aluno.curso) && Arrays.equals(notas, aluno.notas);
    }



    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public double[] getNotas() {
        return notas;
    }

    public void setNotas(double[] notas) {
        this.notas = notas;
    }

    public double calcularMedia(){
        return  0;
    }

    public boolean verificarAprovado(){
        return true;
    }

    public void metodoQualquer(){
       // super.setCpf("265556");
       // this.setCpf("36584756");
    }

    public String obterEtiquetaEndereco(){
       String s = "Endereço do Aluno: ";
       //s += super.getEndereco();

       return s;
    }

    //@Override
    public void imprimirEtiquetaEndereco() {

        System.out.println(this.obterEtiquetaEndereco());
    }


}
