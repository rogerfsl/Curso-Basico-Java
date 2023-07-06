import java.util.Scanner;

public class ex17 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.println("O ano é bissexto?");
        System.out.println();
        System.out.print("Digite um ano: ");
        int ano = scan.nextInt();

        System.out.println("O ano digitado foi: " + ano);

        if ((ano % 400 == 0) || (ano % 4 == 0 && ano % 100 != 0)){
            System.out.println("É Bissexto.");
        } else{
            System.out.println("Não é Bissexto.");

        }


    }
}
