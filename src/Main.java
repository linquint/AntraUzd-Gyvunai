import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void printGyvunai(List<Gyvunas> gyvunai) {
        for (Gyvunas g:gyvunai) {
            System.out.println(g);
        }
    }

    public static void findGyvunas(String name, List<Gyvunas> gyvunai) {
        boolean found = false;
        for (Gyvunas g:gyvunai) {
            if (g.getName().equals(name)) {
                found = true;
                System.out.println(g);
            }
        }
        if (!found) {
            System.out.printf("Nerastas nei vienas gyvūnas vardu '%s'", name);
        }
    }

    public static void main(String[] args) {
        List<Gyvunas> gyvunai = new LinkedList<>();
        Ziurkenas g1 = new Ziurkenas("Antanas");
        Zuvis g2 = new Zuvis("Pranas");
        Zuvis g3 = new Zuvis("Janina");
        Ziurkenas g4 = new Ziurkenas("Petras");
        Ziurkenas g5 = new Ziurkenas("Bronius");
        Zuvis g6 = new Zuvis("Petras");
        g1.setUodegosIlgis(11);
        g1.setSpalva("Balta");
        g2.setPelekuKiekis(12);
        g3.setPelekuKiekis(8);
        g4.setUodegosIlgis(10);
        g4.setSpalva("Ruda");
        g5.setUodegosIlgis(15);
        g5.setSpalva("Juoda");
        g6.setPelekuKiekis(10);

        gyvunai.add(g1);
        gyvunai.add(g2);
        gyvunai.add(g3);
        gyvunai.add(g4);
        gyvunai.add(g5);
        gyvunai.add(g6);

        System.out.println("Pradinis sąrašas:");
        printGyvunai(gyvunai);
        gyvunai.sort(Gyvunas::compareTo);

        System.out.println("\nIšrikiuotas sąrašas:");
        printGyvunai(gyvunai);

        System.out.println("\nIeškomi gyvūnai vardu: 'Petras'");
        findGyvunas("Petras", gyvunai);
    }
}