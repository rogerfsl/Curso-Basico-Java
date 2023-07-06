import java.util.Scanner;

public class ex27 {
    public static void main(String [] args){
        Scanner scan = new Scanner(System.in);

        int [] vetorA = new int[10];
        char [] vetorB = new char[vetorA.length];

        for (int i = 0; i < vetorA.length; i++){
            System.out.print("Digite um número para a " + (i + 1) + "ª posição: ");
            vetorA[i] = scan.nextInt();

            if (vetorA[i] < 7){
                vetorB[i] = 'a';
            }else if (vetorA[i] == 7){
                vetorB[i] = 'b';
            }else if (vetorA[i] > 7 && vetorA[i] < 10){
                vetorB[i] = 'c';
            }else if (vetorA[i] == 10){
                vetorB[i] = 'd';
            }else {
                vetorB[i] = 'e';
            }
        }
        System.out.println();
        System.out.print("Vetor A = ");
        for (int i :vetorA ){
            System.out.print(i + " ");
        }
        System.out.println();

        System.out.print("Vetor B = ");
        for (char i :vetorB ){
            System.out.print(i + " ");
        }

    }
}
