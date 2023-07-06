package Aula34;

import java.util.Scanner;
import java.util.concurrent.Callable;

public class ex01 {
    static void ImprimirValor(){
        System.out.println(Contador.ObterValor());
    }

    public static void main (String [] args){

       ImprimirValor();

       Contador.Incremento();
       ImprimirValor();
       Contador.Decremento();
       ImprimirValor();
       Contador.Incremento();
       Contador.Incremento();
       Contador.Incremento();
       ImprimirValor();
       Contador.Zerar();
       ImprimirValor();

       Contador c1 = new Contador();
       Contador c2 = new Contador();
       Contador c3 = new Contador();

       ImprimirValor();
    }
}

/*  Scanner scan = new Scanner(System.in);

       int resp;
       int cont = 0;

        while (true){
            System.out.println("Contador");
            System.out.println("Digite 1 para incrementar\n" +
                    "Digite 2 para decrementar\n" +
                    "Digite 3 para zerar\n" +
                    "Digite 0 para sair.");
            resp = scan.nextInt();

            if (resp == 0){
                System.out.println("Programa finalizado!");
                break;
            } else if (resp == 1) {
                System.out.println("Incrementando.");
                cont +=1;
            } else if (resp == 2) {
                System.out.println("Decrementanto");
                cont -= 1;
            }else if(resp == 3){
                cont = 0;
            } else{
                System.out.println("Entrada inválida!");
            }
            System.out.println("-------");
            System.out.println(cont);
            System.out.println("-------");
        }*/
