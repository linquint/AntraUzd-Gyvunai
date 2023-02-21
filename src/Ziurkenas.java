public class Ziurkenas extends Gyvunas {
    private int uodegosIlgis;
    private String spalva;

    public Ziurkenas(String name) {
        super(name, "Žiurkėnas");
    }

    public int getUodegosIlgis() {
        return uodegosIlgis;
    }

    public void setUodegosIlgis(int uodegosIlgis) {
        this.uodegosIlgis = uodegosIlgis;
    }

    public String getSpalva() {
        return spalva;
    }

    public void setSpalva(String spalva) {
        this.spalva = spalva;
    }

    @Override
    public String toString() {
        return type + ". Vardas: " + name + ", Uodegos ilgis: " + uodegosIlgis + " cm, Spalva: " + spalva;
    }
}
