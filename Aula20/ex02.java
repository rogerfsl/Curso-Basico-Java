import java.text.DecimalFormat;
import java.util.Random;
import java.util.Scanner;

public class ex02 {

    public static void main(String [] args){

        //Scanner scan = new Scanner(System.in);
        int[][] aleatorios = new int[10][10];
        Random gerador = new Random();

        int maior5 = 0;
        int menor5 = 0;
        int maior7 = 0;
        int menor7 = 0;

        for (int i = 0; i < aleatorios.length; i++){
            for(int j = 0; j < aleatorios[i].length; j++){
                aleatorios[i][j] = gerador.nextInt(100);
                if (i == 4){
                    maior5 = aleatorios[4][j];
                    menor5 = aleatorios[4][j];
                }else{
                    if (aleatorios[4][j]> maior5){
                        maior5 = aleatorios[4][j];
                    }
                    if (aleatorios[4][j] < menor5){
                        menor5 = aleatorios[4][j];
                    }
                }
            }
        }
        for (int i = 0; i < aleatorios.length; i++) {
            for (int j = 0; j < aleatorios[i].length; j++) {
                if (i == 0){
                    maior7 = aleatorios[i][6];
                    menor7 = aleatorios[i][6];
                }else{
                    if (aleatorios[i][6] > maior7){
                        maior7 = aleatorios[i][6];
                    }
                    if (aleatorios[i][6] < menor7){
                        menor7 = aleatorios[i][6];
                    }
                }
            }
        }
        DecimalFormat df = new DecimalFormat("###");

        for (int i = 0; i < aleatorios.length; i++){
            for(int j = 0; j < aleatorios[i].length; j++){
                System.out.print("|" +  df.format(aleatorios[i][j]) + "| ");
            }
            System.out.println();
        }
        System.out.println("----------------------------------------");

        System.out.println("O maior número da 5ª linha é: " + maior5);
        System.out.println("O menor número da 5ª linha é: " + menor5);
        System.out.println("O maior número da 7ª coluna é: " + maior7);
        System.out.println("O menor número da 7ª coluna é: " + menor7);




    }

}
