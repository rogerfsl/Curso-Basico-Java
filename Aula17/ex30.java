import javax.management.openmbean.TabularData;
import java.util.Scanner;

public class ex30 {
    public static void main(String [] args) {

        Scanner scan = new Scanner(System.in);

        boolean invalido = true;

        System.out.println("---TABUADA.V2---");
        System.out.println("----------------");

        System.out.print("Tabuada de: ");
        int  n = scan.nextInt();
        int inicio, fim;

        do{

            System.out.print("Entre com o início da tabuada: ");
            inicio = scan.nextInt();

            System.out.print("Entre com o final da tabuada: ");
            fim = scan.nextInt();

            if (fim > inicio){
                invalido = false;
            }
        } while (invalido);

        System.out.println("----------------");
        System.out.println("Tabuada de " + n );
        System.out.println("Começando por " + inicio);
        System.out.println("Terminando em " + fim);
        System.out.println();


        for (int i = inicio; i <= fim; i++){
            System.out.println(n + " x " + i + " = " + (n * i));
        }
    }
}
