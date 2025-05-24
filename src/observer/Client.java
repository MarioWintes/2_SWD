package observer;

public class Client implements Observer {

    private String name;

    public Client(String name) {
        this.name = name;
    }

    @Override
    public void update() {
        System.out.println("Observer update " + name);
    }
}
