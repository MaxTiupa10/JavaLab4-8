package ua.Lab.CommandTest;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ua.Lab.Composition.MusicLibrary;
import ua.Lab.Composition.Track;

import java.util.List;

public class FindCompositionCommandTest {
    private MusicLibrary musicLibrary;


    @BeforeEach
    void setup() {
        musicLibrary = new MusicLibrary();
        musicLibrary.addData();
    }

    @Test
    void test() {
        Assertions.assertTrue(musicLibrary.format(200, 210));
        List<Track> filtred = musicLibrary.filter(200,210);
        Assertions.assertTrue(musicLibrary.getLibrary().size() > filtred.size());
        Assertions.assertTrue(musicLibrary.getLibrary().containsAll(filtred));
    }


}
