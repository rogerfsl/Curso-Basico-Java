import java.util.Scanner;

public class ex03 {
    public static void main(String [] args){
        Scanner scan = new Scanner(System.in);

        int vetorA[] = new int[15];
        int vetorB[]= new int[vetorA.length];

        for (int i = 0; i < vetorA.length; i++){
            System.out.println("Digite um valor para a posição " + i + ": ");
            vetorA[i] = scan.nextInt();
            vetorB[i] = vetorA[i] * vetorA[i];
        }

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
