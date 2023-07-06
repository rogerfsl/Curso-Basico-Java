import java.util.Scanner;

public class ex14 {
    public static void main(String [] args) {
        Scanner scan = new Scanner(System.in);

        int num;
        int par = 0 ;
        int impar = 0;

        for (int i = 0; i < 10; i++){
            System.out.print("Digite o " + (i +1) + " número: ");
            num = scan.nextInt();

            if (num % 2 == 0){
                par += 1;
            } else{
                impar += 1;
            }
        }
        System.out.println("Foram digitados " + par + " números pares.");
        System.out.println("Foram digitados " + impar + " números ímpares.");
    }
}
