package solidprinciple.solved;

public class Handy implements Call, Foto, Sms{

    private String marke;

    public Handy(String marke) {
        this.marke = marke;
    }

    @Override
    public void call() {
        System.out.println(marke + " macht Anruf..");
    }

    @Override
    public void foto() {
        System.out.println(marke + " macht ein Foto..");
    }

    @Override
    public void sms() {
        System.out.println(marke + " schickt eine SMS");
    }
}
