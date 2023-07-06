package Aula24;

public class ex05 {

    public static void main (String [] args){
        ContaCorrente conta = new ContaCorrente();

        conta.numeroConta = "123456";
        conta.agencia = "25";
        conta.contaEspecial = true;
        conta.limiteConta = 500;
        conta.saldoConta = 1000;

        System.out.println("Saldo da conta " + conta.numeroConta + ": R$" + conta.saldoConta);
    }



}
