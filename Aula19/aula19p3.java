import java.util.Arrays;
public class aula19p3 {

    public static void main(String[] args){

        int vet[] = {3, 7, 1, 6, 9, 4, 2};

        for (int i: vet)
            System.out.print(i + " ");
        System.out.println();

        int p = Arrays.binarySearch(vet, 2);
        System.out.println("Encontrei o valor na posição " + p);
    }
}
