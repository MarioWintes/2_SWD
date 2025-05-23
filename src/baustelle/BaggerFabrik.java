package baustelle;

public class BaggerFabrik extends MaschinenFabrik {
    @Override
    public Maschine createMaschine() {
        return new Bagger();
    }
}