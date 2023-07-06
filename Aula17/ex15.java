import java.util.Scanner;

public class ex15 {
    public static void main(String [] args) {
       Scanner scan = new Scanner(System.in);

       System.out.print("Digite quantos termos você quer mostrar: ");
       int n = scan.nextInt();

        int p1 = 0;
        int p2 = 1;


        System.out.print(p1 + " -> " + p2);

        for (int i = 3; i <= n; i++){
            int p3 = p1 + p2;
            p1 = p2;
            p2 = p3;
            System.out.print(" -> " + p3);
        }

        /*while (cont <= n){
            int p3 = p1 + p2;
            System.out.print(" -> " + p3 );
            cont ++;
            p1 = p2;
            p2 = p3;
        }*/
    }
}
