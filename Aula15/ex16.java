import java.util.Scanner;

public class ex16 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.print("Digite um valor para a: ");
        int a = scan.nextInt();

        if (a == 0){
            System.out.println("Não é uma equação de segundo grau.");
        } else{
            System.out.print("Digite um valor para b: ");
            int b = scan.nextInt();

            System.out.print("Digite um valor para c: ");
            int c = scan.nextInt();

            double delta = Math.pow(b,2) - (4 * a * c);
            if(delta < 0 ){
                System.out.println("Delta negativo.");
            } else {
                System.out.println("Delta: " + delta);

                double x1 = ((-b) + Math.sqrt(delta) / (2*a));
                double x2 = ((-b) - Math.sqrt(delta) / (2*a));

                System.out.println("X1 = " + x1);
                System.out.println("X2 = " + x2);
            }
        }





    }
}
