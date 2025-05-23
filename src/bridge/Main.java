package bridge;

public class Main {

    public static void main(String[] args) {

        Square sq = new Square(new Red());

        sq.applyColor();
        sq.draw();

    }
}
