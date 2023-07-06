package Aula27;

import java.util.Scanner;

public class ex02 {
    public static void main(String[] args){
        //canner scan = new Scanner(System.in);
        ContaCorrente conta1 = new ContaCorrente();

        conta1.numero = "123456";
        conta1.saldo = -10;
        conta1.especial = true;
        conta1.limiteEspecial = 500;
        conta1.valorEspecialUsado = 0;


        System.out.println("Número da conta: " + conta1.numero);
        conta1.consultarSaldo();

        boolean saqueEfetuado = conta1.realizarSaque(10);
        if(saqueEfetuado){
            System.out.println("Saque efetuado com sucesso.");
            conta1.consultarSaldo();
        }else{
            System.out.println("Saque não efetuado. Limite indisponivel.");
        }
        /*System.out.println("Tentativa de saque de 490 reais");
        saqueEfetuado = conta1.realizarSaque(490);
        if(saqueEfetuado){
            System.out.println("Saque efetuado com sucesso.");
            System.out.println("Saldo da conta R$ " + conta1.saldo);
        }else{
            System.out.println("Saque não efetuado. Limite indisponivel.");
        }*/

       System.out.println("Depósito de 500 reais");
       conta1.depositarDinheiro(500);
       conta1.consultarSaldo();

       if (conta1.verificaChequeEspecial()){
           System.out.println("Está usando o cheque especial");
       }else{
           System.out.println("Não está usando o cheque especial");
       }






    }
}
