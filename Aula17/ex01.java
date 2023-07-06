import java.util.Scanner;

public class ex01 {
    public static void main(String [] args){
        Scanner scan = new Scanner(System.in);

        while (true){
            System.out.print("Digite a nota do aluno: ");
            double nota = scan.nextDouble();
            if (nota >= 0 && nota <= 10){
                System.out.println("Nota: " + nota);
                break;
            }else {
                System.out.println("nota inválida!");
            }
        }
    }
}

/* boolean notaValida = false;

        do {
            System.out.println("Digite um número entre 1 e 10: ");
            double nota = scan.nextDouble();

            if (nota >= 0 && nota <= 10){
                notaValida = true;
                System.out.println("Você digitou a nota: " + nota);
            }else {
                System.out.println("Nota inválida! Digite novamente.");
            }

        }while (!notaValida);*/