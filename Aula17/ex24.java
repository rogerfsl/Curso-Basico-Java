import java.util.Scanner;

public class ex24 {

    public static void main(String [] args) {
        //Scanner scan = new Scanner(System.in);

        System.out.println("Panificadora Pão de Ontem - Tabela de preços.");

        for (int i = 1; i <= 50; i++){
            System.out.println(i + "º - " + " R$ " + (0.18 * i));
        }
    }
}
