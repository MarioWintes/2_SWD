package observer;

public class Main {

    public static void main(String[] args) {

        Shop mediamarkt = new Shop();

        mediamarkt.addObserver(new Client("hons"));
        mediamarkt.addObserver(new Client("sus"));


        mediamarkt.notifyObservers();
    }
}
