import java.util.Scanner;

public class ex13 {
    public static void main(String [] args){
        Scanner scan = new Scanner(System.in);

        int[] vetorA = new int[10];
        int soma = 0;

        for(int i = 0; i < vetorA.length; i++){
            System.out.print("Digite o " + (i + 1) + "º número inteiro: ");
            vetorA[i] = scan.nextInt();
        }
        for (int i = 0; i < vetorA.length; i++){
            if(vetorA[i] % 5 == 0){
                soma += vetorA[i];
            }
        }
        System.out.println();

        System.out.print("Os números digitados foram: ");
        for(int i: vetorA){
            System.out.print( i + " ");
        }
        System.out.println();
        if (soma == 0){
            System.out.println("Não foi digitado nenhum número múltiplo de 5.");
        }else{
            System.out.println("A soma dos múltiplos de 5 digitados foi: " + soma);
        }

    }
}
