import java.util.Scanner;

public class ex10 {
    public static void main(String [] args){
        Scanner scan = new Scanner(System.in);

        int n1, n2, i;

        System.out. print("Digite um número inteiro: ");
        n1 = scan.nextInt();

        System.out.print("Digite outro número inteiro maior que o anterior: ");
        n2 = scan.nextInt();
        System.out.println("Você digitou os números: " + n1 +" e " + n2);
        System.out.print("E os números entre eles são: ");

        for (i = n1; i <= n2; i++){
            System.out.print(i + " ");
        }



    }
}
