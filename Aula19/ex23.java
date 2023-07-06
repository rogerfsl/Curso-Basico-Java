import java.util.Scanner;

public class ex23 {
    public static void main(String [] args){

        Scanner scan = new Scanner(System.in);

        int [] vetorA = new int[10];

        for(int i = 0; i < vetorA.length; i++){
            System.out.print("Digite um número inteiro: ");
            vetorA[i] = scan.nextInt();
            if(vetorA[i] % 2 == 1){
                break;
            }

        }
        System.out.println();

        for(int i: vetorA) {
            System.out.print(i + " ");
        }
    }
}
