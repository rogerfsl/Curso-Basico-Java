package Aula43.labs_ex02;

public class PessoaFisica extends Contribuinte{
    private String cpf;

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    @Override
    public String toString() {
        return super.toString() +
                " Pessoa Física {" +
                "cpf: '" + cpf + '\'' +
                "Imposto a ser pago R$ " + calcularImposto() +
                '}';
    }

    @Override
    public double calcularImposto() {

        double renda = this.getRendaBruta();

        if (renda <= 1400){
            return 0;
        }
        if (renda > 1400 && renda <= 2100){
            return ((renda * 10) / 100 ) - 100;
        }
        if (renda > 2100 && renda <= 2800){
            return ((renda * 15) / 100 ) - 270;
        }
        if (renda > 2800 && renda <= 3600){
            return ((renda * 25) / 100 ) - 500;
        }
        // mair que 3600
        return ((renda * 30) / 100 ) - 700;



    }
}
