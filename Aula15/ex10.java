import java.util.Scanner;

public class ex10 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.print("Qual o turno que o aluno estuda? (Responda com M / V / N) ");
        String turno = scan.next();

        if (turno.equalsIgnoreCase("m")){
            System.out.println("O aluno estuda no período Matutino.");
        } else if (turno.equalsIgnoreCase("v")) {
            System.out.println("O aluno estuda no período Vespertino.");
        } else if (turno.equalsIgnoreCase("n")) {
            System.out.println("O aluno estuda no período Noturno.");
        } else {
            System.out.println("Valor inválido. Tente novamente.");
        }

        switch (turno){
            case "m":
            case "M": System.out.println("O aluno estuda no período Matutino.");break;
            case "v":
            case "V": System.out.println("O aluno estuda no período Vespertino.");break;
            case "n":
            case "N": System.out.println("O aluno estuda no período Noturno.");break;
            default: System.out.println("Entrada inválida!");
        }
    }
}
