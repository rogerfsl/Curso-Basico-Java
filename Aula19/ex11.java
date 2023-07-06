import java.util.Scanner;

public class ex11 {
    public static void main(String [] args){
        Scanner scan = new Scanner(System.in);

        int[] vetorA = new int[10];
        int n;
        int totPar = 0;

        for (int i = 0; i < vetorA.length; i++){
            System.out.print("Digite o " + (i + 1) + "º número inteiro: ");
            n = scan.nextInt();
            if (n % 2 ==0){
                vetorA[i] = n;
                totPar +=1;
            }
        }
        System.out.println();

        if (totPar <= 0){
            System.out.println("Não foi digitado nenhum número par.");
        } else if (totPar == 1) {
            System.out.println("Foi digitado apenas 1 número par.");

            System.out.print("E foi: ");
            for (int i: vetorA) {
                if (i > 0){
                    System.out.print(i + " ");
                }
            }
        }else {
            System.out.println("Foram digitados " + totPar + " Números pares.");

            System.out.print("E foram: ");
            for (int i: vetorA){
                if (i > 0){
                    System.out.print(i + " ");
                }
            }
        }
    }
}
