package generics;

public class Bike implements Driveable{

    public Bike() {
    }

    @Override
    public void drive() {
        System.out.println("bike drived");
    }
}
