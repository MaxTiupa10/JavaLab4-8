package ua.Lab.Collection;



import  ua.Lab.Composition.Track;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Collection {
    protected List<Track> tracks;
    private  int sumDuration;

    public List<Track> getTracks() {
        return tracks;
    }
    public void styleSort() {
        Comparator<Track> styleComparator = Comparator.comparing(Track::getGenre);
        // Сортуємо список за стилем
        Collections.sort(tracks, styleComparator);

    }

    public void newTrack(Track track){
        tracks.add(track);
        System.out.println("Трек успішно додано до бібліотеки!");
    }
    public  void select(){
        System.out.println(tracks);
    }
    public int sumDuration() {
        for (Track track: tracks) {
            sumDuration += track.getDuration();
        }
        return sumDuration;
    }
}

