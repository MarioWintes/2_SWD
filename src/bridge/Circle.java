package bridge;

public class Circle extends MotherShape{
    public Circle(Color color) {
        super(color);
    }

    @Override
    public void draw() {
        System.out.println("drawing circle" );
        color.applyColor();
    }
}
