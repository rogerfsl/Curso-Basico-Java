package Aula27;

public class Carro {

    String marca;
    String modelo;
    int numPassageiros;
    double capCumbustivel;
    double consumoCombustivel;

    void exibirAutonomia(){
        System.out.println("A autonomia do carro é: " + capCumbustivel * consumoCombustivel + " km.");
    }

    double obterAutonomia() {
        System.out.println("Método obterAutonomia foi chamado.");
        return capCumbustivel * consumoCombustivel;
    }

    double calcularCombustivel(double km){

        double qtdCombustivel = km/consumoCombustivel;
        return  qtdCombustivel;
    }


} 