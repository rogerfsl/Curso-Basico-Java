import javax.management.ValueExp;
import java.awt.desktop.SystemEventListener;
import java.util.Scanner;

public class ex03 {
    public static void main(String [] args){

        Scanner scan = new Scanner(System.in);

        int [][] numeros = new int[3][3];
        int qntPar = 0;
        int qntImpar =0;

        for( int i = 0; i < numeros.length; i++){
            for(int j = 0; j < numeros[i].length; j++){
                System.out.print("Digite um número para linha " + (i+1) + " e para coluna " + (j+1) + ": ");
                numeros[i][j] = scan.nextInt();
                if(numeros[i][j] % 2 == 0){
                    qntPar ++;
                }else{
                    qntImpar++;
                }
            }
        }
        for( int i = 0; i < numeros.length; i++) {
            for (int j = 0; j < numeros[i].length; j++) {
                System.out.print("|"+numeros[i][j] + "| ");
            }
            System.out.println();
        }

        System.out.println("--------------------------------------");
        System.out.println("Foram digitados " + qntPar + " números pares.");
        System.out.println("Foram digitados " + qntImpar + " números ímpares.");
    }
}
