package Aula29;

public class Carro {

    String marca;
    String modelo;
    int numPassageiros;
    double capCombustivel;
    double consumoCombustivel;

    Carro(){
        System.out.println("Classe carro foi instanciada.");
        numPassageiros = 4;
    }
    public Carro(String marca_, String modelo_, int numPassageiros_, double capCombustivel_, double consumoCombustivel_){

        marca = marca_;
        modelo = modelo_;
        numPassageiros = numPassageiros_;
        capCombustivel = capCombustivel_;
        consumoCombustivel = consumoCombustivel_;
    }

    void exibirAutonomia(){
        System.out.println("A autonomia do carro é: " + capCombustivel * consumoCombustivel);
    }

    double obterAutonomia(){
        System.out.println("Método para obter a autonomia.");
        return capCombustivel * consumoCombustivel;
    }
    double calcularCombustivel(double km){
        double qtdCombustivel = km/consumoCombustivel;
        return qtdCombustivel;
    }
}
