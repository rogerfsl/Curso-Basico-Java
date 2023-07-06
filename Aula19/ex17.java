import java.util.Scanner;

public class ex17 {
    public static void main(String [] args){
        Scanner scan = new Scanner(System.in);

        int [] vetorIdade = new int[10];
        int cont = 0;

        for (int i =0; i< vetorIdade.length; i++){
            System.out.print("Digite a idade da " + (i+1) + "ª Pessoa: ");
            vetorIdade[i] = scan.nextInt();
        }
        for (int i = 0; i < vetorIdade.length; i ++){
            if(vetorIdade[i] > 35){
                cont++;
            }
        }
        System.out.println();

        System.out.print("Idades registradas: ");
        for(int i: vetorIdade){
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println("Pessoas registradas com idade superior a 35 anos: " + cont);
    }
}
