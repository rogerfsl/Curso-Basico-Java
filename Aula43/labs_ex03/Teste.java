package Aula43.labs_ex03;

public class Teste {

    public static void main (String[] args){

        Animal camelo = new Animal();

        camelo.setNome("Camelo");
        camelo.setComprimento(150);
        //camelo.setNumPatas(4);
        camelo.setAmbiente("Terra");
        camelo.setCor("Amarelo");
        camelo.setVelocidade(2);

        Animal tubarao = new Peixe();
        tubarao.setNome("Tubarão");
        tubarao.setComprimento(300);
        tubarao.setVelocidade(1.5);

        Animal ursoDoCanada = new Mamifero();
        ursoDoCanada.setNome("Urso do Canadá");
        ursoDoCanada.setComprimento(180);
        ursoDoCanada.setCor("Vermelho");
        ursoDoCanada.setAmbiente("Terra");
        ursoDoCanada.setVelocidade(0.5);

        Animal[] animais = new Animal[3];
        animais[0] = camelo;
        animais[1] = tubarao;
        animais[2] = ursoDoCanada;

        System.out.println("ZOO:");
        System.out.println("---------------------------");
        for(Animal animal: animais){
            System.out.println(animal.toString());
            System.out.println("---------------------------");
        }


    }
}
