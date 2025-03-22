package jukeboxmap;

public class JukeBoxDemo {

    public static void main(String[] args) {

        Song s1 = new Song("Helene Fischer");
        Song s2 = new Song("Numb");
        Song s3 = new Song("Fliaga");

        JukeBox jb = new JukeBox();

        jb.add(s1);
        jb.add(s2);
        jb.add(s2);
        jb.add(s3);
        jb.add(new Song("Amadeus"));

        jb.play();

        System.out.println(jb.findSong(3));
    }
}
