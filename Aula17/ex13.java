import java.util.Scanner;

public class ex13 {
    public static void main(String [] args) {
        Scanner scan = new Scanner(System.in);


        System.out.print("digite a base: ");
        int base = scan.nextInt();

        System.out.print("digite o expoente: ");
        int expoente = scan.nextInt();

        int resultado  = base;

        for (int i = 1; i < expoente; i++){
            resultado *= base;
        }

        System.out.print("Resultado : " + resultado);
    }

}
