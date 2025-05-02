package solidprinciple.solved;

public class SmartPhone implements Foto, Film, Call, Sms, Browse {

    private String marke;

    public SmartPhone(String marke) {
        this.marke = marke;
    }

    @Override
    public void foto() {
        System.out.println(marke + " macht Foto..");
    }

    @Override
    public void film() {
        System.out.println(marke + " Filmt..");
    }

    @Override
    public void browse() {
        System.out.println(marke + " browsed..");
    }

    @Override
    public void call() {
        System.out.println(marke + " macht einen Anruf..");
    }

    @Override
    public void sms() {
        System.out.println(marke + " schickt eine SMS..");
    }
}
