package Aula36;

public class Curso {

    private String nome;
    private String hora;
    private Professor professor;
    private Aluno[] alunos;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    public Aluno[] getAlunos() {
        return alunos;
    }

    public void setAlunos(Aluno[] alunos) {
        this.alunos = alunos;
    }

    public String obterInfo(){
        String info = "Nome do Curso = " + nome + " \n";

        if (professor != null){
            info += professor.obterInfo();
        }
        if (alunos != null){
            System.out.println("-=--=--=-ALUNOS-=--=--=-");
            for (Aluno aluno: alunos){
                if ( aluno!= null){
                    info += aluno.obterInfo();
                    info += "\n";
                }
            }
            info += "\nMédia da turma = " + obterMediaTurma();
        }
        return info;
    }

    public double obterMediaTurma(){
        double soma =0;
        for (Aluno aluno: alunos){
            if (aluno != null){
                soma += aluno.obterMedia();
            }
        }
        return soma/ alunos.length;
    }
}
