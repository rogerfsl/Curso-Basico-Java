package Aula36;

public class Professor {
    private String nome;
    private String departamento;
    private String Email;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public String obterInfo(){
        return "Professor = " + nome + "\n";
    }
}
