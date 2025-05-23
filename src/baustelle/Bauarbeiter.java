package baustelle;

import java.util.List;

public class Bauarbeiter {
    private final String name;
    private final List<Maschine> maschinen;

    public Bauarbeiter(String name, List<Maschine> maschinen) {
        this.name = name;
        this.maschinen = maschinen;
    }

    public void arbeite() {
        System.out.println("Bauarbeiter " + name + " beginnt zu arbeiten.");
        for (Maschine m : maschinen) {
            m.bedienen();
        }
    }
}