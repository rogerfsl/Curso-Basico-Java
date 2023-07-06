import java.util.Scanner;

public class ex06 {
    public static void main(String [] args){

        Scanner scan = new Scanner(System.in);

        char[][] jogoVelha = new char[3][3];
        int jogada = 1;
        char sinal;
        int linha = 0, coluna = 0;

        System.out.println("-=--=--=-JOGO DA VELHA-=--=--=-");
        System.out.println("Jogarodor 1 = X");
        System.out.println("Jogador 2 = X");

        while (true){

            if (jogada % 2 == 1){ //Quem joga.
                System.out.println("Vez do jogador 1. Escolha linha e coluna");
                sinal = 'X';
            }else{
                System.out.println("Vez do jogador 2. Escolha linha e coluna");
                sinal = 'O';
            }
            while (true){ // validação da linha
                System.out.print("Entre com a linha: (1,2 ou 3) ");
                linha = scan.nextInt();
                if (linha >= 1 && linha <= 3){
                    break;
                }else {
                    System.out.println("Jogada inválida, tente novamente!");

                }
            }
            while (true){ // validação da coluna
                System.out.print("Entre com a coluna: (1,2 ou 3) ");
                coluna = scan.nextInt();
                if (coluna >= 1 && coluna <= 3){
                    break;
                }else {
                    System.out.println("Jogada inválida, tente novamente!");
                }
            }
            linha --;
            coluna--;
            // validação da posição
            if (jogoVelha[linha][coluna] == 'X' || jogoVelha[linha][coluna] == 'O'){
                System.out.println("Jogada inválida. Tente novamente!");
            }else{
                jogoVelha[linha][coluna] = sinal;
                jogada++;
            }

            for (int i = 0; i< jogoVelha.length; i++){
                for (int j = 0; j < jogoVelha[i].length; j++){
                    System.out.print("|" + jogoVelha[i][j] + "| ");
                }
                System.out.println();
            }

            if (jogoVelha[0][0] == 'X' && jogoVelha[0][1] == 'X' && jogoVelha[0][2] == 'X' ||
                    jogoVelha[1][0] == 'X' && jogoVelha[1][1] == 'X' && jogoVelha[1][2] == 'X' ||
                    jogoVelha[2][0] == 'X' && jogoVelha[2][1] == 'X' && jogoVelha[2][2] == 'X' ||
                    jogoVelha[0][0] == 'X' && jogoVelha[1][0] == 'X' && jogoVelha[2][0] == 'X' ||
                    jogoVelha[0][1] == 'X' && jogoVelha[1][1] == 'X' && jogoVelha[2][1] == 'X' ||
                    jogoVelha[0][2] == 'X' && jogoVelha[1][2] == 'X' && jogoVelha[2][2] == 'X' ||
                    jogoVelha[0][0] == 'X' && jogoVelha[1][1] == 'X' && jogoVelha[2][2] == 'X' ||
                    jogoVelha[2][0] == 'X' && jogoVelha[1][1] == 'X' && jogoVelha[0][2] == 'X' ){
                System.out.println("Jogo encerrado.");
                System.out.println("Jogador 1 Venceu!");
                break;
            } else if (jogoVelha[0][0] == 'O' && jogoVelha[0][1] == 'O' && jogoVelha[0][2] == 'O' ||
                    jogoVelha[1][0] == 'O' && jogoVelha[1][1] == 'O' && jogoVelha[1][2] == 'O' ||
                    jogoVelha[2][0] == 'O' && jogoVelha[2][1] == 'O' && jogoVelha[2][2] == 'O' ||
                    jogoVelha[0][0] == 'O' && jogoVelha[1][0] == 'O' && jogoVelha[2][0] == 'O' ||
                    jogoVelha[0][1] == 'O' && jogoVelha[1][1] == 'O' && jogoVelha[2][1] == 'O' ||
                    jogoVelha[0][2] == 'O' && jogoVelha[1][2] == 'O' && jogoVelha[2][2] == 'O' ||
                    jogoVelha[0][0] == 'O' && jogoVelha[1][1] == 'O' && jogoVelha[2][2] == 'O' ||
                    jogoVelha[2][0] == 'O' && jogoVelha[1][1] == 'O' && jogoVelha[0][2] == 'O' ) {
                System.out.println("Jogo encerrado.");
                System.out.println("Jogador 1 Venceu!");
                break;

            } else if (jogada > 9) {
                System.out.println("Jogo encerrado.");
                System.out.println("Ninguem venceu!");
                break;
            }
        }
    }
}
