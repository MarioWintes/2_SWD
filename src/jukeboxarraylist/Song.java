package jukeboxarraylist;

public class Song implements Comparable<Song> {

    protected String title;

    public Song(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    @Override
    public String toString() {
        return this.title;
    }

    @Override
    public int compareTo(Song o) {
        return 0;
    }
}

