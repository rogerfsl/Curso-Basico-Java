package Aula33;

public class Aluno {

    private String nome;
    private int matricula;
    private String curso;
    private String[] disciplinas;
    private double[][] notas;

    public Aluno() {
        this.disciplinas = new String[3];
        this.notas = new double[3][4];
    }

    public Aluno(String nome, int matricula, String curso, String[] disciplinas, double[][] notas) {
        this.nome = nome;
        this.matricula = matricula;
        this.curso = curso;
        this.disciplinas = new String[3];
        this.notas = new double[3][4];
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public String[] getDisciplinas() {
        return disciplinas;
    }

    public void setDisciplinas(String[] disciplinas) {
        this.disciplinas = disciplinas;
    }

    public double[][] getNotas() {
        return notas;
    }

    public void setNotas(double[][] notas) {
        this.notas = notas;
    }

    public void mostrarInfo(){
        System.out.println("Nome: " + nome);
        System.out.println("Matrícula: " + matricula);
        System.out.println("Nome do curso: " + curso);

        for (int i =0; i < notas.length; i++){
            System.out.print("Notas da disciplina " + disciplinas[i] + ": ");
            for (int j =0; j < notas[i].length; j++){
                System.out.print(notas[i][j] + ": ");
            }
            System.out.println();
            System.out.print("Média: "+ obterMedia(i) + " ");
            System.out.println();
            System.out.print("Situação: ");
            verificaMedia(i);
            System.out.println();
        }
    }
    private double obterMedia(int indice){
        double soma = 0;
        for (int i = 0; i < notas[indice].length; i++){
            soma += notas[indice][i];
        }
        double media = soma /4;
        return  media;
    }

    public void verificaMedia (int indice){
        if (obterMedia(indice) >= 7){
            System.out.println("Aprovado");
        }else {
            System.out.println("Reprovado");
        }
    }

    public void setDisciplinaPos(int pos, String nomeDisciplina){
        this.disciplinas[pos] = nomeDisciplina;
    }

    public void setNomePosIJ(int posI, int posJ, double nota){
        this.notas[posI][posJ] = nota;
    }

}
