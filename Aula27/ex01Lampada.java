package Aula27;

import java.util.Scanner;

public class ex01Lampada {
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        Lampada led = new Lampada();
        led.marca = "Avant";
        led.cor = "Braca";
        led.tipo = "Led";
        led.potencia = 12;

        led.ligar();
        //System.out.println("A lâmpada está: " + led.ligada);
        led.mostrarEstado();
        System.out.println("--------------------");

        led.desligar();
        //System.out.println("A lâmpada está: " + led.ligada);
        led.mostrarEstado();
        System.out.println("--------------------");

        led.mudarEstado();
        led.mostrarEstado();

    }
}
