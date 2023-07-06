import java.util.Scanner;

public class ex15 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Digite o 1º segmento: ");
        double l1 = scan.nextDouble();

        System.out.print("Digite o 2º segmento: ");
        double l2 = scan.nextDouble();

        System.out.print("Digite o 3º segmento: ");
        double l3 = scan.nextDouble();

        if (l1 < l2 + l3 &&
                l2 < l1 + l3 &&
                l3 < l1 + l2){
            System.out.println("Os segmentos digitados podem formar um triângulo.");
            if (l1 == l2 && l2 == l3){
                System.out.println("E formam um triângulo EQUILÁTERO.");
            } else if(l1 != l2 && l1 != l3 && l3 != l1){
                System.out.println("E formam um triângulo ESCALENO.");
            }else if (l1 == l2 || l1 == l3 || l2 == l3){
                System.out.println("E formam um triângulo ISÓSCELES.");
            }
        } else {
            System.out.println("Os segmentos digitados não formam um triângulo.");
        }

    }
}
