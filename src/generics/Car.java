package generics;

public class Car implements Driveable{

    public Car() {
    }

    @Override
    public void drive() {
        System.out.println("car drived");
    }
}
