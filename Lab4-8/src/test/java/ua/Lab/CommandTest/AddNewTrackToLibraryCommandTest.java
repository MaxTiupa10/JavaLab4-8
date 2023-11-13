package ua.Lab.CommandTest;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ua.Lab.Composition.MusicLibrary;
import ua.Lab.Composition.Track;

public class AddNewTrackToLibraryCommandTest {
    private MusicLibrary musicLibrary;

    @BeforeEach
    void setup(){
        musicLibrary = new MusicLibrary();
        musicLibrary.addData();
    }

    @Test
    void addTrackTest(){
        Track track = new Track("son",189,2018,"pop","Tom Odell" );
        musicLibrary.newTrack(track);
        Assertions.assertTrue(musicLibrary.getLibrary().contains(track));
    }

}
