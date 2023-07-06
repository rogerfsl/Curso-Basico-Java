package Aula24;
import java.util.Date;

public class ex04 {

    public static void main (String[] args){
        LivroDeBiblioteca livro = new LivroDeBiblioteca();

        livro.nome = "Mastering ExtJS";
        livro.autor = "Loiane";
        livro.anoLancamento = 2015;
        livro.emprestado = true;
        livro.nomeLocatario = "Welson";
        livro.dataEmprestimo =  new Date();
        livro.dataEstrega = new Date();


        System.out.println("Nome do livro: " + livro.nome);
        System.out.println("Nome do autor: " + livro.autor);
        System.out.println("");

    }
}
