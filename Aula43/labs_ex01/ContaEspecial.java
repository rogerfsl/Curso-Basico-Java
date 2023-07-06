package Aula43.labs_ex01;

public class ContaEspecial extends ContaBancaria{

    private double limite;

    public double getLimite() {
        return limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }

    @Override
    public String toString() {
        String s ="Conta Especial ";
        s += "\nLimite: " + limite;
        s += "\n" + super.toString();
        return s;
    }

    @Override
    public boolean podeSacar(double valorSaque) {
        double saldoComLimite = this.getSaldo() + limite;
        if((saldoComLimite - valorSaque) >= 0){
            this.setSaldo(this.getSaldo() - valorSaque);
            return true;
        }

        return false;
    }
}
