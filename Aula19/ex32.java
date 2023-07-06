import java.util.Scanner;

public class ex32 {
    public static void main(String [] args){
        Scanner scan = new Scanner(System.in);

        int [] vetorA = new int[5];
        int [] vetorB = new int[10];

        System.out.println("Digite 5 números que deseja saber a tabuada.");

        for (int i = 0; i < vetorA.length; i++){
            System.out.print("Digite o " + (i+1) + "º número: ");
            vetorA[i] = scan.nextInt();
        }
       for(int i =0; i< vetorA.length; i++){
           System.out.println("Tabuada de " + vetorA[i]);
           for(int j= 1; j<=10; j++){
               System.out.println(vetorA[i] + " X " + j +" = " + (vetorA[i] * j));
           }
           System.out.println("================");
       }


    }
}
