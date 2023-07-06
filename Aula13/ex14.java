import java.util.Scanner;

public class ex14 {

    public static void main(String [] args){

        Scanner scan = new Scanner(System.in);

        System.out.println("Quantos quilos de peixe João pescou? ");
        int pesoPeixe = scan.nextInt();

        int excesso = (pesoPeixe - 50) * 4;

        System.out.println("A multa devida por joão é de: R$ "+ excesso);
    }
}
