package Aula43.labs_ex01;

public class teste {
    public static void main(String[] args){

        ContaBancaria conta1 = new ContaBancaria();

        System.out.println("*** Teste Conta ***");
        conta1.setNomeCliente("Welson");
        conta1.setNumConta("123");
        System.out.println(conta1);
        System.out.println("---------------------------");

        conta1.deposito(100);

        realizarSaque(conta1, 50);
        realizarSaque(conta1, 70);

        System.out.println("---------------------------");
        System.out.println(conta1);
        System.out.println("---------------------------");

        System.out.println("*** Teste ContaPoupança ***");

        ContaPoupanca contaPoupanca = new ContaPoupanca();
        contaPoupanca.setNomeCliente("Welson - Conta Poupança");
        contaPoupanca.setNumConta("22222");
        contaPoupanca.setDiaRendimento(3);

        contaPoupanca.deposito(100);
        realizarSaque(contaPoupanca, 50);
        realizarSaque(contaPoupanca, 70);

        if (contaPoupanca.calcularNovoSaldo(0.5)){
            System.out.println("Rendimento aplicado, novo saldo é de R$ " + contaPoupanca.getSaldo());
        }else {
            System.out.println("Hoje não é dia de rendimento, novo saldo não realizado.");
        }
        System.out.println("---------------------------");
        System.out.println(contaPoupanca);
        System.out.println("---------------------------");


        System.out.println("*** Teste Conta Especial ***");

        ContaEspecial contaEspecial = new ContaEspecial();

        contaEspecial.setNomeCliente("Welson - Conta Especial");
        contaEspecial.setNumConta("33333");
        contaEspecial.setLimite(50);

        contaEspecial.deposito(100);
        realizarSaque(contaEspecial, 50);
        realizarSaque(contaEspecial, 70);
        realizarSaque(contaEspecial, 80);

        System.out.println("---------------------------");
        System.out.println(contaEspecial);



    }
    private static void realizarSaque(ContaBancaria conta, double valor){
        if (conta.podeSacar(valor)){
            System.out.println("Saque efetuado com sucesso.");
            System.out.println("Novo saldo R$ " + conta.getSaldo());

        }else{
            System.out.println("Saldo insuficiente para realizar saque no valor de R$ " + valor);
            System.out.println("Saldo de R$ " + conta.getSaldo());
        }
    }
}
