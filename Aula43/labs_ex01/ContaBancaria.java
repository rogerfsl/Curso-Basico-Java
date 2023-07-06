package Aula43.labs_ex01;

public class ContaBancaria {

    private String nomeCliente;
    private String numConta;
    private double saldo;


    @Override
    public String toString() {
        String s ="";
        s += "Nome do cliente: " + nomeCliente;
        s += "\nNúmero da conta: " + numConta;
        s += "\nSaldo: R$ " + saldo;
        return s;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public String getNumConta() {
        return numConta;
    }

    public void setNumConta(String numConta) {
        this.numConta = numConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public boolean podeSacar(double valorSaque){
       if((saldo - valorSaque) >= 0){
           saldo -= valorSaque;
           return true;
       }
       return false;
    }

    public double deposito(double valorDeposito){
        this.saldo += valorDeposito;
        return  this.saldo;
    }

}
