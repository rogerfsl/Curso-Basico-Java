import java.util.Scanner;

public class ex03 {
    public static void main(String [] args){
        Scanner scan = new Scanner(System.in);

        boolean validade = false;
        String nome;
        int idade;
        double salario;
        String sexo;
        String estadiCiv;

        do {
            System.out.print("Digite seu nome: ");
            nome = scan.next();

            if (nome.length() > 3){
                validade = true;
            }else {
                System.out.println("Registro inválido. Digite novamente!");
            }
        }while (!validade);

        validade = false;

        do{
            System.out.print("Digite a sua idade: ");
            idade = scan.nextInt();

            if (idade >= 0 && idade <= 150){
                validade = true;
            }else {
                System.out.println("Registro inválido. Digite novamente!");
            }
        }while (!validade);

        validade = false;

        do {
            System.out.print("Digite seu sexo: [M | F] ");
            sexo = scan.next();

            if (sexo.equalsIgnoreCase("f") || sexo.equalsIgnoreCase("m") ){
                validade = true;
            }else{
                System.out.println("Registro inválido. Digite novamente!");
            }

        }while (!validade);

        validade = false;

        do{
            System.out.print("Digite o seu salário: R$ ");
            salario = scan.nextDouble();
            if (salario > 0){
                validade = true;
            }else {
                System.out.println("Registro inválido. Digite novamente!");
            }

        }while (!validade);



        validade = false;

        do {
            System.out.print("Digite seu estado civil: [S | C | D | V] ");
            estadiCiv = scan.next();

            if (estadiCiv.equalsIgnoreCase("s") ||
                    estadiCiv.equalsIgnoreCase("c") ||
                    estadiCiv.equalsIgnoreCase("d")||
                    estadiCiv.equalsIgnoreCase("v")){
                validade = true;
            }else{
                System.out.println("Registro inválido. Digite novamente!");
            }
        }while (!validade);

        System.out.println("Foram adicionadas as seguintes informações.");

        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Sexo: " + sexo);
        System.out.println("Salário: R$ " + salario);
        System.out.println("Estado civil: " + estadiCiv);


    }

}
