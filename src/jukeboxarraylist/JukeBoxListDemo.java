package jukeboxarraylist;


public class JukeBoxListDemo {

    public static void main(String[] args) {
        Song s1 = new Song("Helene Fischer");
        Song s2 = new Song("Numb");
        Song s3 = new Song("Fliaga");

        JukeBoxList jbl = new JukeBoxList();

        jbl.add(s1);
        jbl.add(s2);
        jbl.add(s3);

        jbl.play();

        System.out.println(jbl.findSong(1));
    }
}
