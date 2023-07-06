package Aula43.labs_ex01;

import java.util.Calendar;

public class ContaPoupanca extends ContaBancaria{

    private int diaRendimento;

    @Override
    public String toString() {
        String s ="Conta Poupança ";
        s += "\nDia rendimento: " + diaRendimento;
        s += "\n" + super.toString();
        return s;
    }

    public int getDiaRendimento() {
        return diaRendimento;
    }

    public void setDiaRendimento(int diaRendimento) {
        this.diaRendimento = diaRendimento;
    }

    public boolean calcularNovoSaldo(double taxaRendimento){
        Calendar hoje = Calendar.getInstance();

        if (diaRendimento == hoje.get(Calendar.DAY_OF_MONTH) ){
            this.setSaldo(this.getSaldo() + (this.getSaldo() * taxaRendimento));
            return  true;
        }
        return false;
    }
}
