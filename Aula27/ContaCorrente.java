package Aula27;

public class ContaCorrente {

    String numero;
    double saldo;
    boolean especial;
    double limiteEspecial;
    double valorEspecialUsado;

    boolean realizarSaque(double valorSaque){
        if(saldo >= valorSaque){
            saldo -= valorSaque;
            return true;
        }else {
            if(especial){
                double limite = limiteEspecial + saldo;
                if(limite >= valorSaque){
                    saldo -=valorSaque;
                    return true;
                }else{
                    return false;
                }
            }else{
                return false;
            }
        }
    }

    void depositarDinheiro(double valorDeposito){
        saldo += valorDeposito;
    }

    void consultarSaldo(){

        System.out.println("Saldo atual da conta R$ " + saldo);
    }

    boolean verificaChequeEspecial(){
        if (saldo <0){
            return true;
        }else {
            return false;
        }
    }


}
