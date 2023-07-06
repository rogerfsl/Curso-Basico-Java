import java.util.Scanner;

public class ex10 {
    public static void main(String [] args){
        Scanner scan = new Scanner(System.in);
        int vetorA[] = new int[10];
        int vetorB[]= new int[vetorA.length];

        for(int i = 0; i < vetorA.length; i++){
            System.out.println("Digite o valor para a posição " + i + ":");
            vetorA[i] = scan.nextInt();
            //vetorB[i] = vetorA[i] * 2;
        }
        for (int i =0; i <vetorA.length; i++){
            vetorB[i] = vetorA[i] % 2;
        }

        System.out.print("Vetor A = ");
        for (int i: vetorA){
            System.out.print(i + " ");
        }
        System.out.println();

        System.out.print("Vetor B = ");
        for (int i: vetorB) {
            System.out.print(i + " ");
        }

    }
}
