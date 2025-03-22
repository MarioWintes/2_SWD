package jukeboxarraylist;


import java.util.ArrayList;

public class JukeBoxList {

    //private Set<Song> songs = new HashSet<>();
    private ArrayList<Song> songs = new ArrayList<Song>();
    private int counter;

    public JukeBoxList() {
    }

    public void play(){
        for (Song song : songs) {
            System.out.println(song);
        }

    }

    public void add(Song s){
        this.songs.add(s);
    }

    public Song findSong(int index){
        return this.songs.get(index);
    }

    public ArrayList<Song> getSongs() {
        return songs;
    }
}


