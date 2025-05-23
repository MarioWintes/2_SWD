package bridge;

public abstract class MotherShape implements Color {

    protected Color color;

    public MotherShape(Color color) {
        this.color = color;
    }

    @Override
    public void applyColor() {
    }


    public abstract void draw();
}
