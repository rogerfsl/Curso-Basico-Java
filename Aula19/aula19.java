public class aula19 {
    public static void main(String[] args) {

        System.out.println("");
        double[] temperaturas = new double[365];

        temperaturas[0] = 31.3;
        temperaturas[1] = 32;
        temperaturas[2] = 33.8;
        temperaturas[3] = 34;
        temperaturas[4] = 31;

        System.out.println("Temperatura do dia 3 é: " + temperaturas[2]);

        System.out.println("O tamando do array é: " + temperaturas.length);

        System.out.println("Valores do array: " + temperaturas);

        for (int i =0; i <= temperaturas.length; i++){
            System.out.println(temperaturas[i]);
        }
    }
}