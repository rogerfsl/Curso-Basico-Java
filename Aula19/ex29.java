import java.util.Scanner;

public class ex29 {
    public static void main(String [] args){
        Scanner scan = new Scanner(System.in);

        int[] vetorA = new int[10];
        int[] vetorB = new int[vetorA.length];
        int[] vetorC = new int[vetorA.length * 2];

        for (int i = 0; i < vetorA.length; i++){
            System.out.print("Digite um número para a posição " + (i+1) + " do vetor A: ");
            vetorA[i] = scan.nextInt();
            vetorC[i] = vetorA[i];

        }
        for (int i = 0; i < vetorA.length; i++) {
            System.out.print("Digite um número para a posição " + (i + 1) + " do vetor B: ");
            vetorB[i] = scan.nextInt();
            vetorC[i + vetorA.length] = vetorB[i];

        }



        System.out.println();
        System.out.print("Vetor A: ");
        for (int i: vetorA){
            System.out.print(i + " ");
        }
        System.out.println();

        System.out.print("Vetor B: ");
        for (int i: vetorB){
            System.out.print(i + " ");
        } System.out.println();

        System.out.print("Vetor C: ");
        for (int i: vetorC){
            System.out.print(i + " ");
        }


    }
}
