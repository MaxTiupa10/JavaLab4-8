package ua.Lab.Composition;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class MusicLibraryTest {
    private MusicLibrary musicLibrary;

    @BeforeEach
    void setup(){
        musicLibrary = new MusicLibrary();
        musicLibrary.addData();

    }
    @Test
    void addDataTest(){
        Assertions.assertEquals(50,musicLibrary.getLibrary().size());
    }
    @Test
    void formatTest(){
        Assertions.assertTrue(musicLibrary.format(200,210));
        Assertions.assertTrue(musicLibrary.format(200,200));
        Assertions.assertFalse(musicLibrary.format(200,190));
    }
    @Test
    void findByDiapason(){
        Assertions.assertEquals(18,musicLibrary.filter(190,200).size());
    }
    @Test
    void newTrackTest(){
        Track track = new Track("Rokstar",238,2020,"pop","Blease");
        ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStreamCaptor));
        musicLibrary.newTrack(track);
        System.setOut(System.out);
        Assertions.assertEquals("Трек успішно додано до бібліотеки!" , outputStreamCaptor.toString().trim());
        Assertions.assertTrue(musicLibrary.getLibrary().contains(track));
        Assertions.assertEquals(51,musicLibrary.getLibrary().size());
    }

    @Test
    void sumDurationTest(){
        Assertions.assertEquals(9780, musicLibrary.sumDuration());
    }

}
