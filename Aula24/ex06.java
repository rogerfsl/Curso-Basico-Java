package Aula24;

public class ex06 {

    public static void main (String [] args){

        AgendaCelular contato1 = new AgendaCelular();

        contato1.nome = "Welson";
        contato1.email = "welsonboladao@gmai.com";
        contato1.endereco = "Rua do beijo gelado";

        contato1.telefones = new String[2];
        contato1.telefones[0] = "98789-8789";
        contato1.telefones[1] = "97856-8789";
    }
}
