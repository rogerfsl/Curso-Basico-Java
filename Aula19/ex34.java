import java.util.Scanner;

public class ex34 {
    public static void main(String [] args){
        Scanner scan = new Scanner(System.in);

        int[] vetorA = new int[3];

        for(int i =0; i < vetorA.length; i++){
            System.out.print("Digite um número para a posição " +(i+1) +": ");
            vetorA[i] = scan.nextInt();
        }

        for (int i : vetorA){
            System.out.println("Analisando o número " + i);
            for (int j = 0; j < i; j++){
                if (j % 2 == 0){
                    System.out.println(j + " é par.");
                }
            }
            System.out.println();
        }


    }
}
