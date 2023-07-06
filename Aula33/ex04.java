package Aula33;

import java.util.Scanner;

public class ex04 {

    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        JogoDaVelha jogoDaVelha = new JogoDaVelha();

        System.out.println("-=--=--=-JOGO DA VELHA-=--=--=-");
        System.out.println("Jogador 1 = X");
        System.out.println("Jogador 2 = O");
        char sinal;
        int linha , coluna ;

        while (true){
            if(jogoDaVelha.vezJogador1()){
                System.out.println("Vez do jogador 1. Escolha linha e coluna (1-3): ");
                sinal = 'X';
            }else{
                System.out.println("Vez do jogador 2. Escolha linha e coluna (1-3): ");
                sinal = 'O';
            }
            linha = valor("Linha", scan);
            coluna = valor("coluna", scan);

            if (!jogoDaVelha.validarJogada(linha, coluna, sinal)){
                System.out.println("Posição já usada. Tente novamente!");
            }

            jogoDaVelha.imprimirTabuleiro();

            if(jogoDaVelha.verificarGanhador('X')){
                System.out.println("Jogo encerrado.");
                System.out.println("Jogador 1 Venceu!");
                break;
            }else if(jogoDaVelha.verificarGanhador('O')){
                System.out.println("Jogo encerrado.");
                System.out.println("Jogador 2 Venceu!");
                break;
            } else if(jogoDaVelha.getJogada() > 9){
                System.out.println("Jogo encerrado.");
                System.out.println("Ninguem venceu!");
                break;
            }
        }
    }
    static int valor(String tipoValor, Scanner scan) {
        int valor ;
        while (true) { // validação da linha
            System.out.print("Entre com a "+ tipoValor +": (1,2 ou 3) ");
            valor = scan.nextInt();
            if (valor >= 1 && valor <= 3) {
                break;
            } else {
                System.out.println("Jogada inválida, tente novamente!");
            }
        }
        valor --;
        return valor;
    }
}
