package Aula43.labs_ex03;

public class Mamifero extends Animal{

    private String alimento;

    @Override
    public String toString() {
        String s = super.toString();
        s += "\nAlimento: " + alimento;

        return s;
    }

    public String getAlimento() {
        return alimento;
    }

    public void setAlimento(String alimento) {
        this.alimento = alimento;
    }

    public Mamifero() {
        super();
        this.setCor("Castanho");
        this.alimento = "Mel";
    }
}
