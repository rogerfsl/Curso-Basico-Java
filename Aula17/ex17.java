import java.util.Scanner;

public class ex17 {
    public static void main(String [] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Digite o número que deseja saber o fatorial: ");
        int n = scan.nextInt();

        int fat = 1;

        System.out.print("Fatorial de " + n + "! = ");


        for (int i = n; i > 1; i --){
            fat *= i;
            System.out.print( i + " x ");
        }
        System.out.print("1 = "+ fat);
    }
}
