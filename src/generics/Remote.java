package generics;

public class Remote<T extends Driveable> {

    private T model;

    public Remote(T model) {
        this.model = model;
    }

    public void setModel(T model) {
        this.model = model;
    }

    public void drive() {
        this.model.drive();
    }
}
