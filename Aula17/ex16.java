import java.util.Scanner;

public class ex16 {
    public static void main(String [] args) {
        Scanner scan = new Scanner(System.in);

        int t1 = 0;
        int t2 = 1;
        int cont = 3;
        int t3 = 0;
        System.out.print(t1 + " -> " + t2);

        while (t3 < 500){
            t3 = t1 + t2;
            System.out.print(" -> " + t3 );
            cont ++;
            t1 = t2;
            t2 = t3;


        }


    }
}
