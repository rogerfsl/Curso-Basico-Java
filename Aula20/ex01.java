import java.util.Random;
import java.util.Scanner;

public class ex01 {

    public static void main(String [] args){

        Scanner scan = new Scanner(System.in);
        int [][] aleatorios = new int[4][4];
        Random gerador = new Random();
        int maior = 0;
        int posLinha = 0;
        int posColuna = 0;

        for (int i = 0; i < aleatorios.length; i++){
            for(int j =0; j < aleatorios[i].length; j++){
                aleatorios [i][j] = gerador.nextInt(10);
                if(i == 0){
                    maior = aleatorios[i][j];
                    posLinha = i;
                    posColuna = j;
                }else{
                    if (aleatorios[i][j] > maior){
                        maior = aleatorios[i][j];
                        posLinha = i;
                        posColuna = j;
                    }
                }
            }
        }

        for(int i=0; i < aleatorios.length; i++){
            for (int j =0; j< aleatorios[i].length; j++){
                System.out.print(aleatorios[i][j] + " ");

            }
            System.out.println();
        }
        System.out.println();
        System.out.println("O maior número gerado foi " + maior);
        System.out.println("E ele se encontra na linha " + (posLinha + 1 )+ " e na coluna " + (posColuna + 1));


    }
}
