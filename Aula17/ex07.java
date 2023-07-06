import java.util.Scanner;

public class ex07 {
    public static void main(String [] args){
        Scanner scan = new Scanner(System.in);

        int i, num;
        int maior = Integer.MIN_VALUE;

        for (i= 0; i < 5; i++){
            System.out.print("Digite um número inteiro: ");
            num = scan.nextInt();
            if (i == 0){
                maior = num;
            } else{
                if (num > maior){
                    maior = num;
                }
            }
        }
        System.out.println("O maior número digitado foi: " + maior);
    }
}
