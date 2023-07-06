import java.util.Scanner;

public class ex16 {
    public static void main(String [] args){
        Scanner scan = new Scanner(System.in);

        int [] vetorA = new int[10];

        for (int i = 0; i < vetorA.length; i++){
            System.out.print("Digite o " + (i + 1) + "º número inteiro: ");
            vetorA[i] = scan.nextInt();
        }

        int somaMenor15 = 0;
        int somaMaior15 = 0;
        int contIgual = 0;
        int contMaior = 0;
        for (int i = 0; i < vetorA.length; i++){
            if (vetorA[i] < 15){
                somaMenor15 += vetorA[i];
            }else if (vetorA[i] == 15){
                contIgual +=1;
            }else {
                somaMaior15 += vetorA[i];
                contMaior ++;
            }
        }
        int media = somaMaior15 / contMaior;
        System.out.println();

        System.out.print("Números digitados: ");
        for(int i: vetorA){
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println("A) A soma dos elementos menores que 15 é: " + somaMenor15);
        System.out.println("B) A quantidade de elementos que são iguais a 15 é: " + contIgual);
        System.out.println("C) A soma dos elementos maiores que 15 é: " + somaMaior15);
        System.out.println("D) A media dos elementos maiors que 15 é: " + media);

    }
}
