import java.util.Scanner;

public class ex20 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int contador = 0;


        System.out.println("Investigação, Responda apenas com [S / N]");

        System.out.print("Telefonou para a vítima? ");
        String r1 = scan.next();

        System.out.print("Esteve no local do crime? ");
        String r2 = scan.next();

        System.out.print("Reside próximo da vítima? ");
        String r3 = scan.next();

        System.out.print("Tinha algum débito com a vítima? ");
        String r4 = scan.next();

        System.out.print("Já trabalhou com a vítima? ");
        String r5 = scan.next();

        if (r1.equalsIgnoreCase("S")){
            contador ++;
        }
        if (r2.equalsIgnoreCase("S")){
            contador ++;
        }
        if (r3.equalsIgnoreCase("S")){
            contador ++;
        }
        if (r4.equalsIgnoreCase("S")){
            contador ++;
        }
        if (r5.equalsIgnoreCase("S")){
            contador ++;
        }
        if (contador >= 0){
            System.out.println("Inocente");
        } else if (contador == 2) {
            System.out.println("Suspeito");
        } else if (contador >2 && contador <=4) {
            System.out.println("Cúmplice");
        } else if (contador == 5) {
            System.out.println("Culpado");
        }
    }
}
