public class Main {
    public static void main(String[] args) {

        int i = 0;
        int j = 0;

        /*for (i =0; i < 5; i++){
            System.out.println("Valor de i: " + i );
        }
        System.out.println();

        for (i=5; i >=0; i--){
            System.out.println("I tem valor de: " + i);
        }

        for(i = 0, j=10; i < j; i++, j--){
            System.out.println("i = " + i + "; j = " + j);
        }*/

        for (; i < 10;){
            System.out.println("Valor de i = " + i);
            i += 2;
        }
        for (int cont = 0; cont < 10; cont += 2){
            System.out.println("cont tem valor de: " + cont);
        }

        int soma = 0;
        for (i = 1; i < 5; soma += i++);
        System.out.println("O valor da soma é: " + soma);


    }
}