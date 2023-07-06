import java.util.Scanner;

public class ex07 {
    public static void main(String [] args){
        Scanner scan = new Scanner(System.in);


        int vetorA[] = new int[10];
        int vetorB[] = new int[vetorA.length];
        int vetorC[] = new int[vetorA.length];

        for(int i = 0; i < vetorA.length; i++){
            System.out.print("Digite um valor para a posição " + i +": ");
            vetorA[i] = scan.nextInt();
        }
        System.out.println();

        for(int i = 0; i < vetorB.length; i++){
            System.out.print("Digite um valor para a posição " + i +": ");
            vetorB[i] = scan.nextInt();
        }
        System.out.println();
        for (int i = 0; i < vetorC.length; i++){
            vetorC[i] = vetorA[i] - vetorB[i];
        }
        System.out.print("Vetor A = ");
        for (int i: vetorA){
            System.out.print(i + " ");
        }
        System.out.println();

        System.out.print("Vetor B = ");
        for (int i: vetorB){
            System.out.print(i + " ");
        }
        System.out.println();

        System.out.print("Vetor C = ");
        for (int i: vetorC) {
            System.out.print(i + " ");
        }
    }
}
