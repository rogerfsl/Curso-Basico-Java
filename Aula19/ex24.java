import java.awt.desktop.SystemEventListener;
import java.util.Scanner;

public class ex24 {
    public static void main(String [] args){
        Scanner scan = new Scanner(System.in);

        int [] vetorA = new int[10];

        for (int i =0; i < vetorA.length; i++) {
            System.out.print("Digite um valor para a posição " + (i + 1) + ": ");
            vetorA[i] = scan.nextInt();
        }

        boolean palindromo = true;

        System.out.println();
        for (int i = (vetorA.length/2) ; i >= 0; i--){
            if (vetorA[i] != vetorA[vetorA.length - 1- i]){
                palindromo = false;
                break;
            }
        }
        if (palindromo){
            System.out.println("É Palindromo");
        }else{
            System.out.println("Não é palindromo");
        }

    }
}
