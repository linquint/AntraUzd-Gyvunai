public class Zuvis extends Gyvunas {
    private int pelekuKiekis;

    public Zuvis(String name) {
        super(name, "Žuvis");
    }

    public int getPelekuKiekis() {
        return pelekuKiekis;
    }

    public void setPelekuKiekis(int pelekuKiekis) {
        this.pelekuKiekis = pelekuKiekis;
    }

    @Override
    public String toString() {
        return type + ". Vardas: " + name + ", Pelekų kiekis: " + pelekuKiekis;
    }
}
