public class ex01 {
    public static void main(String[] args){

        Lampada led = new Lampada();
        led.modelo = "Led";
        led.potencia = 9;
        led.tensao = "Bivolt";
        led.cor = "Branca";
        led.tipo = "Luminária";
        led.preco = 7.90;

        System.out.println(led.modelo);

    }
}
