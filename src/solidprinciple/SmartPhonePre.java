package solidprinciple;

public class SmartPhonePre {

    private String marke;

    public SmartPhonePre(String marke) {
        this.marke = marke;
    }

    public void film(){
        System.out.println("Starte Video..");
    }

    public void foto(){
        System.out.println("Mache Foto..");
    }

    public void call(){
        System.out.println("Rufe an..");
    }

    public void sms(){
        System.out.println("Sende SMS..");
    }

    public void browse(){
        System.out.println("Gehe ins Internet..");
    }
}
