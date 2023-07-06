import java.util.Scanner;

public class ex19 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.print("Digite um número inteiro: ");
        int n1 = scan.nextInt();

        System.out.print("Digite outro número: ");
        int n2 = scan.nextInt();

        System.out.print("Digite a operação desejada: (+ - * /) ");
        String opc = scan.next();;

        double resultado = 0;

        System.out.println("Você digitou os números: " + n1 + " e " + n2);
        Boolean valida = true;

        switch (opc){
            case "+":
                resultado = n1 + n2;
                System.out.println("A soma entre os números digitados é: " + resultado);
                break;
            case "-":
                resultado = n1 - n2;
                System.out.println("A subtração entre nos números digitados é: " + resultado);
                break;
            case "*":
                resultado = n1 * n2;
                System.out.println("A multiplicação entre nos números digitados é: " + resultado);
                break;
            case "/":
                resultado = n1 / n2;
                System.out.println("A divisão entre nos números digitados é: " + resultado);break;
            default:
                System.out.println("Operação inválida!");
                valida = false;
        }
        System.out.println();

        if (valida){
            if (resultado % 2 == 0){
                System.out.println("O resultado é um número par");
            }else {
                System.out.println("O resultado é um número ímpar");
            }
            if(resultado < 0){
                System.out.println("O resultado é um número negativo");
            }else {
                System.out.println("O resultado é um número positivo");
            }
        }
    }
}
