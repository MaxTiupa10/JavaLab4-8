package ua.Lab.CommandTest;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ua.Lab.Composition.MusicLibrary;
import ua.Lab.Composition.Track;
import ua.Lab.Disc.Disc;
import ua.Lab.Disc.DiscTest;

import java.util.Scanner;

public class AddCollectionToDiscCommandTest {

    Scanner scanner = new Scanner(System.in);
    private MusicLibrary musicLibrary;
    private Disc disc;

    @BeforeEach
    void setup() {
        musicLibrary = new MusicLibrary();
        musicLibrary.addData();
        disc = new Disc();
    }

    @Test
    void TestExecuteAdd() {
        Track track1 = new Track("Scope",219,2012,"pop","Dreik");
        disc.addTrack(track1);
        Assertions.assertEquals(1,disc.getTracks().size());
        Assertions.assertTrue(disc.getTracks().contains(track1));
    }

    @Test
    void testAddFromLibrary(){
        disc.addTrack(musicLibrary.getLibrary().get(0));
        disc.addTrack(musicLibrary.getLibrary().get(1));
        disc.addTrack(musicLibrary.getLibrary().get(2));
        Assertions.assertTrue(disc.getTracks().contains(musicLibrary.getLibrary().get(0)));
        Assertions.assertTrue(disc.getTracks().contains(musicLibrary.getLibrary().get(1)));
        Assertions.assertTrue(disc.getTracks().contains(musicLibrary.getLibrary().get(2)));
    }
}
