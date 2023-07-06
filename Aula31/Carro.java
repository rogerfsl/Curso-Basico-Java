package Aula31;

public class Carro {

    String marca;
    String modelo;
    int numPassageiros;
    double capCombustivel;
    double consumoCombustivel;

    void exibirAutonomia(){
        System.out.println("A auitonomia do carro é de: " + this.capCombustivel * this.consumoCombustivel+ " km.");
    }

    double obterAutonomia(){
        System.out.println("Método obterAutonomia foi chamado.");

        return this.capCombustivel * this.consumoCombustivel;
    }

    private double divideKMPorCombustivel(double km){
       return km/this.consumoCombustivel;
    }

    double calcularCombustivel(double km){

        return this.divideKMPorCombustivel(km);
    }
}
