import java.util.Scanner;

public class ex36 {
    public static void main(String [] args){
        Scanner scan = new Scanner(System.in);

        double [] vetorA = new double[11];

        for (int i =0; i < vetorA.length;i++){
            vetorA[i] = Math.pow(2, i);
        }

        System.out.print("Vetor A = ");
        for(double i: vetorA){
            System.out.print(i + " ");
        }
        System.out.println();


    }
}
