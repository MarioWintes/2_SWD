package baustelle;

public class KranFabrik extends MaschinenFabrik {
    @Override
    public Maschine createMaschine() {
        return new Kran();
}}
