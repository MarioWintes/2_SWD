package generics;

public class RemoteDemo {

    public static void main(String[] args) {

        Car c = new Car();
        Bike b = new Bike();

        Remote<Driveable> rc = new Remote<>(c);

        rc.drive();

        Remote<Driveable> rb = new Remote<>(b);

        rb.drive();
        rb.setModel(c);
        rb.drive();
    }
}
