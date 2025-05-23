package baustelle;


public class Kran implements Maschine {
    @Override
    public void bedienen() {
        System.out.println("Kran hebt Materialien.");
    }
}
