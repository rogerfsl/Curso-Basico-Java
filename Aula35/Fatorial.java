package Aula35;

public class Fatorial {

    public  static int Fatorial(int num){
        int fat = 1;
        for (int i = num; i >= 1; i--){
            fat *= i;
        }
        return fat;
    }

    public static int fatorialRecursivo(int num){
        if (num == 0){
            return 1;
        }
        return num * fatorialRecursivo(num -1);
    }
}
