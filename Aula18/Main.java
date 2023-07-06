import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int num = scan.nextInt();

        System.out.print("Digite um limite: ");
        int max = scan.nextInt();

        for (int i = num; i<= max; i++){
            if (i % 7 == 0){
                System.out.println("O primeiro número divisível por " + num + " é: " + i);
                break;
            }
        }


    }
}