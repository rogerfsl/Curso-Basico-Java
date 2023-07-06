package Aula43.labs_ex02;

public class PessoaJuridica extends Contribuinte{
    private String cnpj;

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    @Override
    public double calcularImposto() {
        return (this.getRendaBruta() * 10) / 100;
    }

    @Override
    public String toString() {
        return super.toString() +
                " Pessoa Jurídica{" +
                "cnpj: '" + cnpj + '\'' +
                "Imposto a ser pago R$ " + calcularImposto() +
                "} " ;
    }
}
