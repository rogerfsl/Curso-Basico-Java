import java.util.Scanner;

public class ex18 {
    public static void main(String [] args){
        Scanner scan = new Scanner(System.in);

        int [] Idades = new int[10];
        int maior = 0;
        int indexMaior = 0;
        int menor = 0;
        int indexMenor = 0;

        for (int i =0; i< Idades.length; i++){
            System.out.print("Digite a idade da " + (i+1) + "ª Pessoa: ");
            Idades[i] = scan.nextInt();
        }
        for (int i = 0; i < Idades.length; i ++){
            if (i == 0){
                maior = Idades[i];
                menor = Idades[i];
            }else{
                if (Idades[i] > maior){
                  maior = Idades[i];
                  indexMaior = i;
                } else if (Idades[i] < menor) {
                    menor = Idades[i];
                    indexMenor = i;
                }
            }
        }
        System.out.println();
        System.out.print("Idades Registradas: ");
        for(int i: Idades){
            System.out.print(i + " ");
        }
        System.out.println("-------------------------------------------------");
        System.out.println("Maior idade registrada foi: " + maior);
        System.out.println("Maior idade apareceu na posição: " + indexMaior);
        System.out.println("-------------------------------------------------");
        System.out.println("Menor idade registrada foi: " + menor);
        System.out.println("Menor idade apareceu na posição: " + indexMenor);
    }
}
