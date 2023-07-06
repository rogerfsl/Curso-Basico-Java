import java.util.Scanner;

public class ex15 {
    public static void main(String [] args){
        Scanner scan = new Scanner(System.in);

        int [] vetorA = new int[10];
        int par = 0;
        int impar = 0;

        for (int i =0; i < vetorA.length; i++){
            System.out.print("Digite o " + (i + 1) + "º número inteiro: ");
            vetorA[i] = scan.nextInt();
        }
        for (int i = 0; i < vetorA.length; i++){
            if(vetorA[i] %2 ==0){
                par ++;
            }else{
                impar++;
            }
        }
        int porcPar = (par * 100) / vetorA.length;
        int porcImpar = 100 - porcPar;
        System.out.println();

        System.out.print("Números digitados: ");
        for (int i: vetorA){
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println("Porcentagem de pares: " + porcPar);
        System.out.println("Porcentagem de ímpares: " + porcImpar);

    }
}
