package ua.Lab.CommandTest;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ua.Lab.Composition.Track;
import ua.Lab.Disc.Disc;


public class SumDurationCommandTest {
    Disc disc;
    Track track1;
    Track track2;
    Track track3;
    Track track4;
    Track track5;

    @BeforeEach
    void setup() {
        disc = new Disc();
        track1 = new Track("Scope", 219, 2012, "pop", "Dreik");
        track2 = new Track("Sun", 201, 2014, "rock", "Dreik");
        track3 = new Track("Sunset", 215, 2017, "classic", "Dreik");
        track4 = new Track("Sunshine", 245, 2022, "jaz", "Dreik");
        track5 = new Track("Smile", 256, 2018, "classic", "Dreik");
    }

    @Test
    void testDurationDiscCommand() {
        Assertions.assertEquals(0, disc.sumDuration());
        disc.addTrack(track1);
        Assertions.assertEquals(219, disc.sumDuration());
    }

    @Test
    void testSumDurationFiveTracks() {
        disc.addTrack(track1);
        disc.addTrack(track2);
        disc.addTrack(track3);
        disc.addTrack(track4);
        disc.addTrack(track5);
        Assertions.assertEquals(1136,disc.sumDuration());

    }


}
