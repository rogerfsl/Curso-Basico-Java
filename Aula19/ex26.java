import java.awt.desktop.SystemEventListener;
import java.util.Scanner;

public class ex26 {
    public static void main(String [] args){
        Scanner scan = new Scanner(System.in);

        int[] vetorA = new int[10];
        int[] vetorB = new int[vetorA.length];
        int[] vetorC = new int[vetorA.length];

        for(int i = 0; i < vetorA.length; i++){
            System.out.print("Digite o " + (i+1) + "º número para o vetor A: ");
            vetorA[i] = scan.nextInt();

            System.out.print("Digite o " + (i+1) + "º número para o vetor B: ");
            vetorB[i] = scan.nextInt();
            System.out.println("-------------------------------------");

            if (vetorA[i] > vetorB[i]){
                vetorC[i] = 1;
            } else if(vetorA[i] == vetorB[i]){
              vetorC[i] = 0;
            }else{
                vetorC[i] = -1;
            }
        }

        System.out.println();
        System.out.print("Vetor A = ");
        for(int i: vetorA){
            System.out.print(i + " ");
        }
        System.out.println();

        System.out.print("Vetor A = ");
        for(int i: vetorA){
            System.out.print(i + " ");
        }System.out.println();

        System.out.print("Vetor C = ");
        for(int i: vetorC){
            System.out.print(i + " ");
        }

    }
}
