import java.util.Scanner;

public class ex29 {
    public static void main(String [] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Digite um número inteiro: ");
        int num = scan.nextInt();

        for (int i = 1; i <= num;  i++){

            boolean primo = true;

            for (int j = 2; j < i; j++){
                if (i % j == 0){
                   // System.out.println("Divisível por: " + i);
                    primo = false;
                }
            }
            if (primo){
                System.out.println(i);
            }
        }

    }
}
