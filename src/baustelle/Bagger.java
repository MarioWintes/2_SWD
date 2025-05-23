package baustelle;

public class Bagger implements Maschine {
    @Override
    public void bedienen() {
        System.out.println("Bagger schaufelt Erde.");
    }
}