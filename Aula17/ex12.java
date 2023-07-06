import java.util.Scanner;

public class ex12 {
    public static void main(String [] args){
        Scanner scan = new Scanner(System.in);

        int num, i;

        System.out.println("----------TABUADA----------");
        System.out.println("Deseja a tabuada do número: ");
        num = scan.nextInt();

        for (i = 1; i <= 10; i++){
            System.out.println( num + " x " + i + " = " + (num  * i));
        }


    }
}
