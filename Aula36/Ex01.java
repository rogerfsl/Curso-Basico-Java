package Aula36;

import java.util.Scanner;
import java.util.Set;

public class Ex01 {

    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        Agenda agenda = new Agenda();

        System.out.print("Digite o nome da agenda: ");
        agenda.setNome(scan.nextLine());


        Contato2[] contatos = new Contato2[3];

        for(int i = 0; i < contatos.length; i++){
            System.out.println("Entre com as informações do " +(i+1) + "º contato: " );
            Contato2 c = new Contato2();

            System.out.print("Entre com o nome: ");
            String nome = scan.nextLine();
            c.setNome(nome);

            System.out.print("Entre com o telefone: ");
            String tel = scan.nextLine();
            c.setTelefone(tel);

            System.out.print("Entre com o email: ");
            String email = scan.nextLine();
            c.setEmail(email);

            contatos[i] = c;
        }
        agenda.setContatos(contatos);

        if (agenda != null){
            System.out.println(agenda.obterInfo());
        }

    }
}
