import java.util.Scanner;

public class ex33 {
    public static void main(String [] args){
        Scanner scan = new Scanner(System.in);

        int[] vetorA = new int[5];
        boolean primo;
        String msg = "";

        for (int i = 0; i < vetorA.length; i++){
            System.out.print("Digite um número para a posição " +(i+1) +": ");
            vetorA[i] = scan.nextInt();
        }

        for(int i =0; i < vetorA.length; i++){
            primo = true;
            for (int j = 2; j < vetorA[i]; j++){
                if(vetorA[i] % j ==0){
                    primo = false;
                    break;
                }
            }
            if (primo){
                msg = " É primo.";
            }else {
                msg = " Não é primo";
            }
            System.out.println(vetorA[i] + msg);
        }

    }
}
