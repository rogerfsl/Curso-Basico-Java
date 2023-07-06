package Aula43.labs_ex03;

public class Peixe extends Animal{

    private String caracteristicas;

    @Override
    public String toString() {
        String s = "";
        s += super.toString();
        s += "\nCaracterísticas: " + caracteristicas;

        return s;
    }

    public Peixe() {
        super();
        this.setAmbiente("Mar");
        this.setNumPatas(0);
        this.setCor("Cinza");
        this.caracteristicas = "Barbatanas e Cauda";

    }
    public String getCaracteristicas() {
        return caracteristicas;
    }

    public void setCaracteristicas(String caracteristicas) {
        this.caracteristicas = caracteristicas;
    }


}
