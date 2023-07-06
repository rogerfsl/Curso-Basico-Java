import java.util.Arrays;
import java.util.Scanner;


public class ex01 {
    public static void main(String [] args){
        Scanner scan = new Scanner(System.in);

        int lista1[] = new int[5];
        int lista2[] = new int[lista1.length];

        for (int i = 0; i< lista1.length; i++){
            System.out.println("Digite o valor da posição " + i + ": ");
            lista1[i] = scan.nextInt();
            lista2[i] = lista1[i];
        }
        Arrays.sort(lista1);
        System.out.print("Lista 1 = ");
        for (int i: lista1 ){
            System.out.print(i + " ");
        }
        System.out.println();

        System.out.print("Lista 2 = ");
        for (int i: lista2 ){
            System.out.print(i + " ");
        }




    }
}
   /* int[] lista1 = {3, 5, 1, 8, 4} ;
    int[] lista2 = lista1.clone();

        for (int i = 0; i < lista1.length; i++){
        Arrays.sort(lista1);
        System.out.println("Na posição  " + (i +1) + " Temos o valor: " + lista1[i]);
        }
        System.out.println();

        for (int valor: lista2){
        System.out.print(valor + " ");

        }*/