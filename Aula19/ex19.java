import java.util.Scanner;

public class ex19 {
    public static void main(String [] args){
        Scanner scan = new Scanner(System.in);


        double[] nota1 = new double[3];
        double[] nota2 = new double[nota1.length];
        double[] resultado = new double[nota1.length];

        for (int i = 0; i < nota1.length ; i++){
            System.out.print("Informe a 1ª nota do " + (i + 1) + " aluno(a): ");
            nota1[i] = scan.nextDouble();

            System.out.print("Informe a 2ª nota do " + (i + 1) + " aluno(a): ");
            nota2[i] = scan.nextDouble();

            resultado[i] = (nota1[i] + nota2[i]) /2;
            System.out.println("-----------------------------------");
        }
        System.out.println();

        System.out.print("Nota 1 = ");
        for (double i: nota1){
            System.out.print(i + " ");
        }
        System.out.println();

        System.out.print("Nota 2 = ");
        for (double i: nota2){
            System.out.print(i + " ");
        }
        System.out.println();

        System.out.println("Resultados ");
        for (double i: resultado){
            if (i >= 7){
                System.out.println( i + " - Aprovado");
            }else{
                System.out.println(i + " - Reprovado");
            }
        }

    }
}
