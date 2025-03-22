package jukeboxmap;

import java.util.*;

public class JukeBox {

    //private Set<Song> songs = new HashSet<>();
    //private ArrayList<Song> songs = new ArrayList<>();
    private HashMap<Integer, Song> songs = new HashMap<>();
    private int counter;

    public JukeBox() {
    }

    public void play(){
        for (Song value : songs.values()) {
            System.out.println(value);
        }
        for (Map.Entry<Integer, Song> integerSongEntry : songs.entrySet()) {
            System.out.println("key: " + integerSongEntry.getKey() + ", Song: " + integerSongEntry.getValue());
        }
    }

    public void add(Song s){
        this.songs.put(counter, s);
        counter++;
    }

    public Song findSong(int index){
        return this.songs.get(index);
    }

    public HashMap<Integer, Song> getSongs() {
        return songs;
    }
}

