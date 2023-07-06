import java.util.Scanner;

public class ex14 {
    public static void main(String [] args){
        Scanner scan = new Scanner(System.in);

        int [] vetorA = new int[10];
        int somaImpar = 0;
        int cont = 0;

        for(int i = 0; i < vetorA.length; i++){
            System.out.print("Digite o " + (i + 1) + "º número inteiro: ");
            vetorA[i] = scan.nextInt();
        }
        for (int i = 0; i < vetorA.length; i++){
            if (vetorA[i] % 2 == 1){
                somaImpar += vetorA[i];
                cont += 1;
            }
        }
        int media = somaImpar / cont;

        System.out.println();

        System.out.print("Você digitou os valores: ");
        for( int i: vetorA){
            System.out.print(i + " ");
        }
        System.out.println();

        System.out.println("A soma dos valores ímpares digitados é: " + somaImpar);
        System.out.println("A média aritimética dos valores ímpares é: " + media);
    }
}
