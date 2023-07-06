import java.util.Scanner;

public class ex02 {
    public static void main(String [] args){
        Scanner scan = new Scanner(System.in);

        boolean validade = false;

        do{
            System.out.print("Digite seu usuário: ");
            String usuario = scan.next();

            System.out.print("Digite a sua senha: ");
            String senha = scan.next();

            if (senha.equalsIgnoreCase(usuario)){
                System.out.println("Erro. Login e senha não podem ser iguais. ");
            }else {
                System.out.println("Login efetuado com sucesso.");
                validade = true;
            }
        }while (!validade);




    }
}
