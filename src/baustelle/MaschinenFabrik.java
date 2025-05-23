package baustelle;

public abstract class MaschinenFabrik {
    public abstract Maschine createMaschine();

    // Gemeinsame Logik für Maschinenbedienung - Single Responsibility Principle
    public void maschineBedienen() {
        Maschine maschine = createMaschine();
        maschine.bedienen();
}}
