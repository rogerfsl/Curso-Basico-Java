import java.util.Scanner;

public class ex31 {

    public static void main(String [] args){
        Scanner scan = new Scanner(System.in);

        int [] vetorA = new int[20];
        int [] vetorB = new int[vetorA.length];
        int posB = 0;

        for (int i = 0 ; i < vetorA.length; i++){
            System.out.print("Digite um valor para a posição " + (i + 1) + ": ");
            vetorA[i] = scan.nextInt();
            if (vetorA[i] % 2 == 0){
                vetorB[posB] = vetorA[i];
                posB++;
            }
        }
        for (int i = 0 ; i < vetorA.length; i++){
            if (vetorA[i] % 2 == 1){
                vetorB[posB] = vetorA[i];
                posB ++;
            }
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
        }


    }
}
