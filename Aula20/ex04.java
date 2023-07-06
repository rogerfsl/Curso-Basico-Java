
import java.util.Scanner;

public class ex04 {
    public static void main(String [] args){

        Scanner scan = new Scanner(System.in);

        int opc;
        int diaMes;
        int hora;
        String tarefa;
        String[][] compromissos = new String[31][24];



       while (true){
           System.out.println("-=--=--=--=--=--=-AGENDA-=--=--=--=--=--=-");
           System.out.println("Digite 1 para verificar compromissos \n" +
                   "Digite 2 para inserir/modificar compromissos \n" +
                   "Digite 3 para sair");
           opc = scan.nextInt();
           System.out.println("-=--=--=--=--=--=--=--=--=--=--=--=--=--=-");

           if (opc == 1){

               while (true){
                   System.out.print("Digite o dia do mês: ");
                   diaMes = scan.nextInt();
                   if (diaMes >0 && diaMes <=31){
                       break;
                   }else
                       System.out.println("Digite uma data válida!");
               }

               while (true){
                   System.out.print("Digite o horário do compromisso: ");
                   hora = scan.nextInt();
                   if (hora >=0 && hora <=24){
                       break;
                   }else
                       System.out.println("Digite uma hora válida!");
               }

               System.out.print("No dia " + diaMes + " às " + hora + " horas, está marcado ");
               System.out.print(compromissos[--diaMes] [hora]);
               System.out.println();
               System.out.println("-=--=--=--=--=--=--=--=--=--=--=--=--=--=-");


           } else if (opc == 2) {
               while (true){
                   System.out.print("Digite o dia do mês: ");
                   diaMes = scan.nextInt();
                   if (diaMes >0 && diaMes <=31){
                       break;
                   }else
                       System.out.println("Digite uma data válida!");
               }

               while (true){
                   System.out.print("Digite o horário do compromisso: ");
                   hora = scan.nextInt();
                   if (hora >=0 && hora <=24){
                       break;
                   }else
                       System.out.println("Digite uma hora válida!");
               }

               System.out.print("Digite o compromisso para o dia " + diaMes + " às " + hora + " horas: ");
               tarefa = scan.next();

               compromissos[--diaMes][hora] = tarefa;


           } else if (opc ==3) {
               System.out.println("Programa encerrado");
                break;
           }else
               System.out.println("Opção inválida!");
       }


    }
}

    /*while (true){
            System.out.println("***  AGENDA  ***");
            System.out.println("DIGITE 1 PARA CONSULTAR SEUS COMPROMISSOS\n" +
                    "DIGITE 2 PARA MODIFICAR COMPROMISSOS\n" +
                    "DIGITE 3 PARA SAIR");
            opc = scan.nextInt();


            if (opc == 1){

                while (true){
                    System.out.print("Digite o dia do mês que deseja Verificar: ");
                    diaMes = scan.nextInt();

                    if (diaMes > 0 && diaMes <=31){
                        System.out.println("Verificando compromissos do dia " + diaMes);
                        break;
                    }else {
                        System.out.println("Dia iválido!");
                    }
                }
                while (true){
                    System.out.print("Digite a horário do tarefa: ");
                    hora = scan.nextInt();
                    if (hora >=0 && hora <= 24 ){
                        break;
                    }else{
                        System.out.println("Horário inválido.");
                    }
                }
                System.out.println("O compromisso agendado é: ");
                System.out.print(compromissos[--diaMes][hora]);

            } else if (opc == 2) {

                while (true){
                    System.out.print("Digite o dia do mês que deseja modificar: ");
                    diaMes = scan.nextInt();

                    if (diaMes > 0 && diaMes <=31){
                        System.out.println("Modificar compromissos do dia " + diaMes);
                        break;
                    }else {
                        System.out.println("Dia iválido!");

                    }
                }

                while (true){
                    System.out.print("Digite a horário do tarefa: ");
                    hora = scan.nextInt();
                    if (hora >=0 && hora <= 24 ){
                        break;
                    }else{
                        System.out.println("Horário inválido.");
                    }
                }

                System.out.print("Digite o comprmisso: ");
                tarefa = scan.next();

                compromissos[--diaMes][hora] = tarefa;



            } else if (opc == 3) {
                System.out.println("Programa encerrado.");
                break;

            }else
                System.out.print("Entrada inválida!");
        }*/