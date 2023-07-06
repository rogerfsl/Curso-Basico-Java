import java.util.Scanner;

public class ex37 {
        public static void main(String[] args) {

            Scanner scan =  new Scanner(System.in);

            int [] vetorA = new int[15];
            int [] vetorB = new int[vetorA.length];

            for (int i = 0; i < vetorA.length; i++){
                System.out.print("Digite um número para a posição " +(i+1) +": ");
                vetorA[i] = scan.nextInt();
            }

            for (int i = 0; i < vetorA.length; i++){

                vetorB[i] = 1;
                for (int j= 1; j <= vetorA[i]; j ++){
                    vetorB[i] *= j;
                }
            }
            System.out.println();
            System.out.print("Vetor A = ");
            for(double i: vetorA){
                System.out.print(i + " ");
            }

            System.out.println();
            System.out.print("Vetor B = ");
            for(double i: vetorB){
                System.out.print(i + " ");
            }
        }
    }

