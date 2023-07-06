import java.util.Scanner;

public class LeituraDadosTeclado {

    public static void main (String [] args){

        Scanner scan = new Scanner(System.in);

        /*System.out.print("Digite Seu nome completo: ");
        String nomeCompleto = scan.nextLine();
        System.out.println("Seu nome completo é: " + nomeCompleto);

        System.out.print("Digite o seu primeiro nome: ");
        String primeiroNome = scan.next();
        System.out.println("Seu pprimeiro nome é: " + primeiroNome);

        System.out.print("Digite a sua idade: ");
        int idade = scan.nextInt();
        System.out.println("Sua idade é: " + idade + " anos.");

        System.out.print("Digite a sua altura: ");
        double altura = scan.nextDouble();
        System.out.println("Sua altura é: " + altura);*/

        System.out.println("Digite o  seu primeiro nome: ");
        String primreiroNome = scan.next();
        System.out.println("Digite a sua idade: ");
        int idade = scan.nextInt();
        System.out.println("Digite a sua altura: ");
        double altura = scan.nextDouble();
        System.out.println("Digite a quantidade de filhos que possui: ");
        byte quantFilhos = scan.nextByte();
        System.out.println("Tem animal de estimação?: ");
        boolean temPet = scan.nextBoolean();

        System.out.println("Você digitou os seguintes valores: ");
        System.out.println("Primeiro nome: " + primreiroNome);
        System.out.println("Idade: " + idade + " anos");
        System.out.println("Altura: " + altura);
        System.out.println("Quantidade de filhos: " + quantFilhos);
        System.out.println("Tem animal de estimação: " + temPet);

    }
}
