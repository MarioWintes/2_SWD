package bridge;

public class Square extends MotherShape {
    public Square(Color color) {
        super(color);
    }

    @Override
    public void draw() {
        System.out.println("draw square");
        color.applyColor();
    }

}
