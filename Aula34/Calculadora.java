package Aula34;

public class Calculadora {

    public static int Somar(int n1, int n2){
        return n1 + n2;
    }

    public static int Subtrair(int n1, int n2){
        return n1 - n2;
    }

    public static double Multiplicacao(double n1, double n2){
        return n1 * n2;
    }

    public static double divisão(double n1, double n2){
        return n1 / n2;
    }

    public static double potencia(double base, double expoente){
        double resultado = 1  ;
        for (int i = 1; i <= expoente; i++){
            resultado *= base;
        }
        return resultado;
    }

    public static int fatorial (int num){

        if (num == 0){
            return 1;
        }
        int fatorial = 1;
        for (int i = num; i >= 1; i--){
            fatorial *= i;
        }
        return fatorial;
    }

}
