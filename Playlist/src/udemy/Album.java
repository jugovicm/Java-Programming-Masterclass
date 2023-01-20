package udemy;

import java.util.ArrayList;
import java.util.LinkedList;

public class Album {
    private String name;
    private String artist;
    private ArrayList<Song> songs;

    public Album(String name, String artist) {
        this.name = name;
        this.artist = artist;
        songs = new ArrayList<Song>();
    }

    public boolean addSong(String title, double duration){
        if(findSong(title) == null){
            songs.add(new Song(title,duration));
            return true;
        }
        else
            return false;
    }

    private Song findSong(String title){
        for(int i=0;i<songs.size();i++){
            Song song = songs.get(i);
            if(song.getTitle().equals(title)){
                return song;
            }
        }
        return null;
    }

    public boolean addToPlayList(int track, LinkedList<Song> playlist){
        int count = track - 1;
        if (count >= 0 && count <= songs.size()) {
            playlist.add(songs.get(count));
            return true;
        }
        return false;
    }

    public boolean addToPlayList(String title,LinkedList<Song> playlist){
        Song song = findSong(title);
        if(song != null){
            playlist.add(song);
            return true;
        }
        return false;
    }
}
