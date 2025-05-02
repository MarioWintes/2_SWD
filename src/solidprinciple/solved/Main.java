package solidprinciple.solved;

public class Main {


    public static void main(String[] args) {
        SmartPhone sp = new SmartPhone("Nothing Phone 3a");
        sp.foto();
        sp.film();
        sp.browse();
        sp.call();
        sp.sms();

        Handy h = new Handy("Nokia 3310");
        h.call();
        h.foto();
        h.sms();
    }


}
