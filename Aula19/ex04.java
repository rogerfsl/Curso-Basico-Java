import java.text.DecimalFormat;
import java.util.Scanner;

import static java.lang.Math.sqrt;

public class ex04 {
    public static void main(String [] args){
        Scanner scan = new Scanner(System.in);

        int vetorA[] = new int[15];
        double vetorB[]= new double[vetorA.length];

        for (int i = 0; i< vetorA.length; i++){
            System.out.println("Digite um valor para a posição " + i + ":");
            vetorA[i] = scan.nextInt();
            vetorB[i] =  sqrt(vetorA[i]);
        }

        System.out.print("Vetor A = ");
        for (int i: vetorA){
            System.out.print(i + " ");
        }

        System.out.println();
        DecimalFormat df = new DecimalFormat("###,###.###");

        System.out.print("Vetor B = ");
        for (double i: vetorB){
            System.out.print(df.format(i) + " ");
        }

    }
}
