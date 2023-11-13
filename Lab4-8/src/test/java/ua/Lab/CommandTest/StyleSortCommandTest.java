package ua.Lab.CommandTest;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ua.Lab.Composition.MusicLibrary;
import ua.Lab.Composition.Track;
import ua.Lab.Disc.Disc;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StyleSortCommandTest {

    private Disc disc;

    private List<Track> expectedArray = new ArrayList<>();

    @BeforeEach
    void setup() {
        disc = new Disc();
        MusicLibrary musicLibrary = new MusicLibrary();
        musicLibrary.addData();
        for (int i = 0; i < 10; i++) {
            disc.addTrack(musicLibrary.getLibrary().get(i));
        }
        List<Integer> index = Arrays.asList(1, 8, 5, 3, 7, 10, 4, 9, 2, 6);
        for (int i: index) {
            expectedArray.add(musicLibrary.getLibrary().get(i-1));
        }
    }

    @Test
    void testSorting() {
        disc.styleSort();
        for (int i = 0; i < 10; i++)
        Assertions.assertEquals(expectedArray.get(i),disc.getTracks().get(i));
    }


}
