package Aula27;

import java.sql.Struct;

public class Lampada {

    String marca;
    String tipo;
    String cor;
    int potencia;
    boolean ligada;

    void ligar(){
        ligada = true;
    }
    void desligar(){
        ligada = false;

    }
    void mostrarEstado(){
        if(ligada){
            System.out.println("Lâmpada ligada");
        }else{
            System.out.println("Lâmpada desligada");
        }
    }

    void mudarEstado(){
        if(ligada){
            desligar();
        }else {
            ligar();
        }
    }
}

