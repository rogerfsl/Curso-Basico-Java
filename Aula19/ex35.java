import java.awt.desktop.SystemEventListener;
import java.util.Scanner;

public class ex35 {
    public static void main(String [] args){
        Scanner scan = new Scanner(System.in);

        int [] vetorA = new int[5];

        for (int i = 0; i < vetorA.length;i++){
            System.out.print("Digite um número para a posição " +(i+1) +": ");
            vetorA[i] = scan.nextInt();
        }

        for (int i =0;  i< vetorA.length; i++){
            System.out.println("Analisando o número " + vetorA[i]);

            for (int j= 1; j < vetorA[i]; j++){
                if (vetorA[i] % j ==0 ){
                    System.out.println(j + " - É divisor ");
                }
            }
            System.out.println();
        }

    }
}
