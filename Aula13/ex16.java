import java.util.Scanner;

public class ex16 {

    public static void main (String [] arg){

        Scanner scan = new Scanner(System.in);

        System.out.print("Digite o tamanho da área que deseja pintar em metros: ");
        double tamArea = scan.nextDouble();

        System.out.println("A área que deseja pintar é do tamanho de: " + tamArea + " metros quadrados.");
    }
}
