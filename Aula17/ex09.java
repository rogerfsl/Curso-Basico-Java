import java.util.Scanner;

public class ex09 {
    public static void main(String [] args){
        // Scanner scan = new Scanner(System.in);

        int i;

        for(i = 1; i < 50; i +=2 ){
            System.out.print(i + " ");
        }
        System.out.println();

        for(i = 1; i < 50; i ++ ){
            if (i % 2 == 1){
                System.out.print(i + " ");
            }
        }

    }
}
