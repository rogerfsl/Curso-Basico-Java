import java.util.Scanner;

public class ex28 {

    public static void main(String [] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Digite um número inteiro: ");
        int n = scan.nextInt();
        boolean primo = true;

        for (int i = 2;i < n; i++){
            if (n % i == 0){
                System.out.println("Divisível por: " + i);
                primo = false;
            }
        }
        if (primo){
            System.out.println("O número é primo.");
        }else{
            System.out.println("E por isso ele não é primo.");
        }
    }
}
