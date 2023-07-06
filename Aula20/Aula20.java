public class Aula20 {
    public static void main(String[] args) {

        //Scanner scan = new Scanner(System.in);

        double [] [] notasAlunos = new double[3][4];

        notasAlunos [0][0] = 10;
        notasAlunos [0][1] = 7;
        notasAlunos [0][2] = 9;
        notasAlunos [0][3] = 9.5;

        notasAlunos [1][0] = 9;
        notasAlunos [1][1] = 8;
        notasAlunos [1][2] = 7;
        notasAlunos [1][3] = 9;

        notasAlunos [2][0] = 8;
        notasAlunos [2][1] = 9;
        notasAlunos [2][2] = 10;
        notasAlunos [2][3] = 7;

        for(int i =0; i < notasAlunos.length; i++){
            System.out.print("Notas do " + (i+1) + "º Aluno: ");
            for (int j = 0; j < notasAlunos[i].length; j++){
                System.out.print(notasAlunos[i][j] + " ");
            }
            System.out.println();
        }


        System.out.println();
        System.out.println("Calculando a média de cada aluno.");
        double soma;


        for(int i =0; i < notasAlunos.length; i++){
            soma = 0;
            for (int j = 0; j < notasAlunos[i].length; j++){
                soma += notasAlunos[i][j];
            }
            System.out.println("Média do aluno " + (i+1) +" é = " + (soma/4));
        }
        System.out.println();

       //double[] notasAluno1 = {7, 8 ,9 ,10};
        double[][] notasAlunos2 = {{7, 8, 9, 10}, {8,6,7,10}, {8, 3, 5, 6}};
        System.out.println("Output da matriz notasAlunos2");

        for (int i =0; i < notasAlunos2.length; i++){
            System.out.print("Notas do aluno " + (i+1) + ": ");
            for (int j = 0; j < notasAlunos2[i].length; j++){
                System.out.print(notasAlunos2[i][j] + " ");
            }
            System.out.println();
        }
    }
}

/*System.out.print("Quantos alunos tem na classe? ");
        int qntAlunos = scan.nextInt();

        int [] coluna = new int[qntAlunos];
        double [] linha = new double[4];
        System.out.println();

        for (int i =1; i <= coluna.length; i++){
            for(int j = 0; j< linha.length; j++){
                System.out.print("Digite a " + (j+1) + "ª nota do " + i + "º Aluno: ");
                linha[j] = scan.nextDouble();
            }
        }
        System.out.println();

        for (int i =1; i <= coluna.length; i++){
            System.out.println("Notas do " + i + "º aluno.");
            for(int j = 0; j< linha.length; j++){
                System.out.println(linha[j]);
            }
            System.out.println();
        } */