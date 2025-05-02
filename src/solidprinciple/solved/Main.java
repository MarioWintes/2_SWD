package solidprinciple.solved;

import solidprinciple.SmartPhonePre;

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

        SmartPhonePre spp = new SmartPhonePre("Schlecht implementiertes SmartPhone");
        spp.browse();
        spp.call();
        spp.film();
        spp.foto();
        spp.sms();
    }


}
