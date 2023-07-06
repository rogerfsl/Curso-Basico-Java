public class aula20Parte2 {

    public static void main(String [] args){

     int[][][] matrizTri = new int[3][3][3];

     for (int i = 0; i < matrizTri.length; i++){
         for (int j =0; j < matrizTri[i].length; j++){
             for (int k = 0; k < matrizTri[i][j].length; k++){
                 System.out.println("i = " + i + " - j = " + j +" - k = " + k);
                 matrizTri[i][j][k] = i + j + k;
             }
         }
         System.out.println();
     }
     int soma = 0;
     int somaPar = 0;
     int somaImpar = 0;
     for (int i = 0; i < matrizTri.length; i++){
         for (int j =0; j < matrizTri[i].length; j++){
             for (int k = 0; k < matrizTri[i][j].length; k++){
                 soma += matrizTri[i][j][k];

                 if(matrizTri[i][j][k] %2 ==0){
                     somaPar += matrizTri[i][j][k];
                 }else{
                     somaImpar += matrizTri[i][j][k];
                 }
             }
         }
     }
     System.out.println("Soma dos pares: " + somaPar);
     System.out.println("Soma dos ímpares: " + somaImpar);
     System.out.println("Soma total: " + soma);

    }
}
