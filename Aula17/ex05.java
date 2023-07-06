import java.util.Scanner;

public class ex05 {
    public static void main(String [] args){
        Scanner scan = new Scanner(System.in);


        double popA ;
        double popB ;
        double taxaPopA;
        double taxaPopB;
        int cont = 0;

        boolean validade = false;

        do {
            System.out.print("Digite a população ta cidade A: ");
            popA = scan.nextDouble();
            if (popA > 0){
                validade = true;
            } else {
                System.out.println("A população precisa ser mair que 0.");
            }
        }while (!validade);

        validade = false;

        do {
            System.out.print("Digite a população da cidade B: ");
            popB = scan.nextDouble();
            if (popB > 0){
                validade = true;
            } else {
                System.out.println("A população precisa ser mair que 0.");
            }
        }while (!validade);


        validade = false;

        do {
            System.out.print("Digite taxa de crescimento da cidade A: ");
            taxaPopA = scan.nextDouble();
            if (taxaPopA > 0){
                validade = true;
            } else {
                System.out.println("A taxa de crescimento precisa ser mair que 0.");
            }
        }while (!validade);

        validade = false;

        do {
            System.out.print("Digite taxa de crescimento da cidade B: ");
            taxaPopB = scan.nextDouble();
            if (taxaPopB > 0){
                validade = true;
            } else {
                System.out.println("A taxa de crescimento precisa ser mair que 0.");
            }
        }while (!validade);

        while (popA < popB){
            popA += (popA * taxaPopA)/ 100;
            popB += (popB * taxaPopB) /100;
            cont += 1;
        }

        System.out.println(popA);
        System.out.println(popB);
        System.out.println(cont);

    }
}
