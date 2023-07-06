package Aula34;

public class Contador {
    private static int cont;

    public Contador(){
        cont++;
    }
    public static int Incremento(){
        return cont +=1 ;
    }

    public static int Decremento(){
        return cont -= 1;
    }

    public static int Zerar(){
        return cont = 0;
    }

    public static int ObterValor(){
        return cont;
    }
}
