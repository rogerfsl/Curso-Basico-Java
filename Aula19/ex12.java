import java.util.Scanner;

public class ex12 {
    public static void main(String [] args){
        Scanner scan = new Scanner(System.in);

        int[] vetorA = new int[10];

        int soma = 0;

        for (int i = 0; i < vetorA.length; i++){
            System.out.print("Digite o " + (i + 1) + "º número inteiro: ");
            vetorA[i] = scan.nextInt();
            soma += vetorA[i];
        }
        System.out.println();
        System.out.print("Você digitou os números: ");
        for(int i: vetorA){
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println("E a soma deles é " + soma);


    }
}
