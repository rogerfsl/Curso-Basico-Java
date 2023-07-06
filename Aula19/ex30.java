import java.util.Scanner;

public class ex30 {
    public static void main(String [] args){
        Scanner scan = new Scanner(System.in);

        int [] vetorA = new int[5];
        int [] par = new int[vetorA.length];
        int [] impar = new int[vetorA.length];

        for (int i = 0; i < vetorA.length; i++){
            System.out.print("Digite um número inteiro: ");
            vetorA[i] = scan.nextInt();

        }

        int posPar = 0;
        int posImpar = 0;

        for (int i = 0; i < vetorA.length; i++ ){
            if (vetorA[i] % 2 ==0){
                par[posPar] = vetorA[i];
                posPar ++;
            }else{
                impar[posImpar] = vetorA[i];
                posImpar++;
            }
        }

        System.out.println();

        System.out.print("Vetor A: ");
        for (int i: vetorA){
            System.out.print(i + " ");
        }

        System.out.println();

        System.out.print("Pares: ");
        for (int i = 0; i < posPar; i++){
            System.out.print(par[i] + " ");
        }
        System.out.println();

        System.out.print("Ímpares: ");
        for (int i = 0; i < posImpar; i++){
            System.out.print(impar[i] + " ");
        }

    }
}
