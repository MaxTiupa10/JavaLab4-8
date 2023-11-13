package ua.Lab.Composition;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TrackTest {
    private final Track track = new Track("Life is Good",235,2019,"pop","Dreake");

    @Test
    void toStringTest(){
        String toString = track.toString();
        Assertions.assertEquals("Track: Life is Good | Singer: Dreake             | Genre: pop      | Duration: 235 | Release Date: 2019", toString);
    }

}
