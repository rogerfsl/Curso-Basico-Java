public class ex02 {
    public static void main (String[] args){
        Livro livro = new Livro();

        livro.nome = "Mastering ExtJS";
        livro.autor = "Loiane";
        livro.anoLancamento = 2015;

        System.out.println("Nome do livro: " + livro.nome);
        System.out.println("Nome do autor: " + livro.autor);

    }
}
