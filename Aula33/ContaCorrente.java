package Aula33;

public class ContaCorrente {

    private String numero;
    private double saldo;
    private boolean especial;
    private double limiteEspecial;
    private double valorEspecialUsado;


    public ContaCorrente() {
    }

    public ContaCorrente(String numero, double saldo, boolean especial,
                         double limiteEspecial, double valorEspecialUsado) {
        this.numero = numero;
        this.saldo = saldo;
        this.especial = especial;
        this.limiteEspecial = limiteEspecial;
        this.valorEspecialUsado = valorEspecialUsado;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public boolean isEspecial() {
        return especial;
    }

    public void setEspecial(boolean especial) {
        this.especial = especial;
    }

    public double getLimiteEspecial() {
        return limiteEspecial;
    }

    public void setLimiteEspecial(double limiteEspecial) {
        this.limiteEspecial = limiteEspecial;
    }

    public double getValorEspecialUsado() {
        return valorEspecialUsado;
    }

    public void setValorEspecialUsado(double valorEspecialUsado) {
        this.valorEspecialUsado = valorEspecialUsado;
    }

    public boolean realizarSaque(double valorSaque){
        if (saldo >= valorSaque){
            saldo -= valorSaque;
            return true;
        }else {
            if (especial){
                double limite = limiteEspecial + saldo;
                if(limite >= valorSaque){
                    saldo -= valorSaque;
                    return true;
                }else {
                    return false;
                }
            }else {
                return false;
            }
        }
    }

    public void depositarDinheiro(double valorDeposito){
        saldo += valorDeposito;
    }

    public void consultarSaldo(){

        System.out.println("Saldo atual da conta R$ " + saldo);
    }

    public boolean verificaChequeEspecial(){
        if (saldo <0){
            return true;
        }else {
            return false;
        }
    }
}
