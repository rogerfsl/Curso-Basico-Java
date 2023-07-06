import java.util.Scanner;

public class ex05 {
    public static void main(String [] args){
        Scanner scan = new Scanner(System.in);

        int opc;
        int mes;
        int dia;
        int hora;
        String tarefa;

        String[][][] compromissos = new String[12][31][24];

        while (true){
            System.out.println("-=--=--=--=--=--=-AGENDA-=--=--=--=--=--=-");
            System.out.println("Digite 1 para verificar compromissos \n" +
                    "Digite 2 para inserir/modificar compromissos \n" +
                    "Digite 3 para sair");
            opc = scan.nextInt();
            System.out.println("-=--=--=--=--=--=--=--=--=--=--=--=--=--=-");

            if (opc == 1){
                while (true){
                    System.out.print("Digite o mês que deseja acessar: ");
                    mes = scan.nextInt();
                    if (mes > 0 && mes <= 12) {
                        System.out.println("Você escolheu o mês " + mes);
                        break;
                    } else
                        System.out.println("Digite um mês válido!");
                    System.out.println();
                }
                while (true){
                    System.out.print("Digite o dia que deseja acessar: ");
                    dia = scan.nextInt();
                    if (dia > 0 && dia <= 31) {
                        System.out.println("Você escolheu o dia " + dia);
                        break;
                    } else
                        System.out.println("Digite um dia válido");
                    System.out.println();
                }

                while (true){
                    System.out.print("Digite o horário do compromisso: [das 8 ás 19] ");
                    hora = scan.nextInt();

                    if (hora >= 8 && hora <= 19) {
                        System.out.println("Você escolheu " + hora + " horas.");
                        break;
                    } else
                        System.out.println("Digite um horário válido");
                    System.out.println();
                }

                System.out.print("O comprisso agendado para o mês " + mes +
                        " dia " + dia + " às " + hora + " horas é: ");
                System.out.print(compromissos[--mes][--dia][hora]);
                System.out.println();

            } else if (opc ==2 ){

                while (true){
                    System.out.print("Digite o mês que deseja acessar: ");
                    mes = scan.nextInt();
                    if (mes > 0 && mes <= 12) {
                        System.out.println("Você escolheu o mês " + mes);
                        break;
                    } else
                        System.out.println("Digite um mês válido!");
                    System.out.println();
                }

                while (true){
                    System.out.print("Digite o dia que deseja acessar: ");
                    dia = scan.nextInt();
                    if (dia > 0 && dia <= 31) {
                        System.out.println("Você escolheu o dia " + dia);
                        break;
                    } else
                        System.out.println("Digite um dia válido");
                    System.out.println();
                }

                while (true){
                    System.out.print("Digite o horário do compromisso: [das 8 ás 19] ");
                    hora = scan.nextInt();

                    if (hora >= 8 && hora <= 19) {
                        System.out.println("Você escolheu " + hora + " horas.");
                        break;
                    } else
                        System.out.println("Digite um horário válido");
                    System.out.println();
                }

                System.out.print("Digite o comprimisso para ser marcado no dia " + dia + " às " + hora +
                        " horas: ");
                tarefa = scan.next();

                compromissos[--mes][--dia][hora] = tarefa;


            } else if (opc == 3){
                System.out.println("Programa encerrado!");
                break;

            }else
                System.out.println("ENTRADA INVÁLIDA");

        }





    }
}
