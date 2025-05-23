package baustelle;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // Demo: Factory Method
        Baustelle kranBaustelle = new Baustelle(new KranFabrik());
        kranBaustelle.arbeite();

        Baustelle baggerBaustelle = new Baustelle(new BaggerFabrik());
        baggerBaustelle.arbeite();

        // Demo: Bauarbeiter
        Bauarbeiter hans = new Bauarbeiter("Hans", Arrays.asList(new Kran(), new Bagger()));
        hans.arbeite();


        Bauarbeiter peter = new Bauarbeiter("Peter", Arrays.asList(new Bagger()));
        peter.arbeite();
    }
}