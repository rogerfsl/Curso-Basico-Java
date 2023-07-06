package Aula34;

import java.util.Scanner;

public class ex03 {

    public static void main(String[] args ){
        Scanner scan = new Scanner(System.in);
        int num;
        do{
            System.out.print("Entre com um número inteiro: ");
            num = scan.nextInt();

            if (num < 0){
                System.out.println("Número inválido! Tente novamente.");
            }
        }while (num < 0);
        System.out.println(Calculadora.fatorial(num));


    }
}
