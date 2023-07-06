package Aula43.labs_ex02;

public class Teste {
    public static void main(String[] args){

        PessoaFisica pessoaFisica1 = new PessoaFisica();
        pessoaFisica1.setNome("Contribuinte 01");
        pessoaFisica1.setCpf("462.405.040-17");
        pessoaFisica1.setRendaBruta(1000);


        PessoaJuridica pessoaJuridica1 = new PessoaJuridica();
        pessoaJuridica1.setNome("Contribuinte 02");
        pessoaJuridica1.setCnpj("57.203.203/0001-00");
        pessoaJuridica1.setRendaBruta(5000);

        PessoaFisica pessoaFisica2 = new PessoaFisica();
        pessoaFisica2.setNome("Contribuinte 03");
        pessoaFisica2.setCpf("594.267.320-98");
        pessoaFisica2.setRendaBruta(2000);

        PessoaJuridica pessoaJuridica2 = new PessoaJuridica();
        pessoaJuridica2.setNome("Contribuinte 04");
        pessoaJuridica2.setCnpj("09.902.225/0001-08");
        pessoaJuridica2.setRendaBruta(3000);

        PessoaFisica pessoaFisica3 = new PessoaFisica();
        pessoaFisica3.setNome("Contribuinte 05");
        pessoaFisica3.setCpf("712.505.690-36");
        pessoaFisica3.setRendaBruta(3700);

        PessoaJuridica pessoaJuridica3 = new PessoaJuridica();
        pessoaJuridica3.setNome("Contribuinte 06");
        pessoaJuridica3.setCnpj("77.390.197/0001-47");
        pessoaJuridica3.setRendaBruta(4000);

        Contribuinte[] contribuintes = new Contribuinte[6];
        contribuintes[0] = pessoaFisica1;
        contribuintes[1] = pessoaFisica2;
        contribuintes[2] = pessoaFisica3;
        contribuintes[3] = pessoaJuridica1;
        contribuintes[4] = pessoaJuridica2;
        contribuintes[5] = pessoaJuridica3;

        for (Contribuinte c : contribuintes){
            System.out.println(c.toString());
        }


    }
}
