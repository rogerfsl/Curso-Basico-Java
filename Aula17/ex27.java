import java.util.Scanner;

public class ex27 {
    public static void main(String [] args) {
        Scanner scan = new Scanner(System.in);

        double temp;
        double soma = 0;
        double maior = 0;
        double menor = 0;

        System.out.print("Entre com a quantidade de temperaturas: ");
        int quant = scan.nextInt();

        for (int i = 1; i <= quant; i++){
            System.out.print("Digite a " + i + "ª temperatura: ");
            temp = scan.nextDouble();
            soma += temp;

            if (i == 1){
                maior = temp;
                menor = temp;
            }else {
                if (temp > maior ){
                    maior = temp;
                }
                if (temp < menor){
                    menor = temp;
                }
            }
        }
        System.out.println("Você digitou " + quant + " temperaturas.");
        System.out.println("A maior delas foi: " + maior);
        System.out.println("A menor delas foi: " + menor);
        System.out.println("E a media delas foi: " + (soma/ quant));
    }
}
