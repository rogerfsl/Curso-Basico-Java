import java.util.Scanner;

public class ex25 {
    public static void main(String [] args){
        Scanner scan = new Scanner(System.in);

        int [] vetorA = new int[10];
        int [] vetorB = new int[vetorA.length];

        for(int i = 0; i <vetorA.length; i++){
            System.out.print("Digite um número para a posição " + (i+1) + ": ");
            vetorA[i] = scan.nextInt();
            if (vetorA[i] % 2 == 0){
                vetorB[i] = 1;
            } else{
                vetorB[i] = 0;
            }
        }
        System.out.println();
        System.out.print("Vetor A = ");
        for(int i: vetorA){
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.print("Vetor B = ");
        for(int i: vetorB){
            System.out.print(i + " ");
        }



    }
}
