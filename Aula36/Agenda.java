package Aula36;

public class Agenda {

    private String nome;
    private Contato2[] contatos;


    public Contato2[] getContatos() {
        return contatos;
    }

    public void setContatos(Contato2[] contatos) {
        this.contatos = contatos;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }


    public String obterInfo(){
        String info = "nome = " + nome + "\n";

        if (contatos != null){
            for (Contato2 c: contatos){
                info += c.obterInfo() + "\n";
            }
        }
        return info;
    }
}
