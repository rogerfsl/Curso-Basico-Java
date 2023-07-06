import java.util.Scanner;

public class ex03 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.print("Digite F para feminimo ou M para masculino: ");
        String letra = scan.next();

        if (letra.equalsIgnoreCase("f")) {
            System.out.println("Feminino.");
        } else if (letra.equalsIgnoreCase("m")) {
            System.out.println("Masculino.");
        } else {
            System.out.println("Entrada inválida.");
        }
    }
}
