import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("");

        int i = 1;
        int max = 10;
        System.out.println("Contando até " + max);
        ;

        while (i <= 10){
            System.out.println("Valor de i: " + i);
            i ++;
        }
        System.out.println(i);
        do {
            i++;
            System.out.println("Valor de i: " + i);
        } while (i<13);

        System.out.print(i + " ");

    }
}