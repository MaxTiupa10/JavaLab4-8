package ua.Lab.Disc;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ua.Lab.Composition.MusicLibrary;
import ua.Lab.Composition.Track;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DiscTest {
    private Disc disc;
    private MusicLibrary musicLibrary;

    @BeforeEach
    void setup() {
        disc = new Disc();
        musicLibrary = new MusicLibrary();
        musicLibrary.addData();
    }

    @Test
    void addToDiscTest() {
        Track track1 = new Track("Scope", 219, 2012, "pop", "Dreik");
        disc.addTrack(track1);
        Assertions.assertEquals(1, disc.getTracks().size());
        Assertions.assertTrue(disc.getTracks().contains(track1));
    }

    @Test
    void testAddFromLibrary() {
        disc.addTrack(musicLibrary.getLibrary().get(0));
        disc.addTrack(musicLibrary.getLibrary().get(1));
        disc.addTrack(musicLibrary.getLibrary().get(2));
        Assertions.assertTrue(disc.getTracks().contains(musicLibrary.getLibrary().get(0)));
        Assertions.assertTrue(disc.getTracks().contains(musicLibrary.getLibrary().get(1)));
        Assertions.assertTrue(disc.getTracks().contains(musicLibrary.getLibrary().get(2)));
    }
    @Test
    void testDeleteOne() {
        disc.addTrack(musicLibrary.getLibrary().get(1));
        disc.deleteTrack(0);
        Assertions.assertFalse(disc.getTracks().contains(musicLibrary.getLibrary().get(1)));
        disc.addTrack(new Track("Sun", 201, 2014, "rock", "Dreik"));
        disc.addTrack(new Track("Sunset", 215, 2017, "classic", "Dreik"));
        disc.addTrack(new Track("Sunshine", 245, 2022, "jaz", "Dreik"));
        disc.addTrack(new Track("Smile", 256, 2018, "classic", "Dreik"));
        disc.deleteTrack(1);
        disc.deleteTrack(2);
        Assertions.assertEquals(2,disc.getTracks().size());
    }
    @Test
    void styleSortTest(){
        List<Track> expectedArray = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            disc.addTrack(musicLibrary.getLibrary().get(i));
        }
        List<Integer> index = Arrays.asList(1, 8, 5, 3, 7, 10, 4, 9, 2, 6);
        for (int i: index) {
            expectedArray.add(musicLibrary.getLibrary().get(i-1));
        }
        disc.styleSort();
        Assertions.assertEquals(expectedArray,disc.getTracks());
    }
    @Test
    void sumDuration(){
        disc.addTrack(new Track("Sun", 291, 2014, "rock", "Dreik"));
        disc.addTrack(new Track("Sun", 399, 2014, "rock", "Dreik"));
        Assertions.assertEquals(690,disc.sumDuration());
    }



}
