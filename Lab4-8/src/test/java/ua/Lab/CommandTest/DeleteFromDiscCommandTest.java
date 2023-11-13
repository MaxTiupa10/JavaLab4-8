package ua.Lab.CommandTest;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ua.Lab.Composition.Track;
import ua.Lab.Disc.Disc;
import ua.Lab.Disc.DiscTest;

public class DeleteFromDiscCommandTest {
    Disc disc;
    Track track1;


    @BeforeEach
    void setup() {
        disc = new Disc();
        track1 = new Track("Scope", 219, 2012, "pop", "Dreik");
        disc.addTrack(track1);
        disc.addTrack(new Track("Sun", 201, 2014, "rock", "Dreik"));
        disc.addTrack(new Track("Sunset", 215, 2017, "classic", "Dreik"));
        disc.addTrack(new Track("Sunshine", 245, 2022, "jaz", "Dreik"));
        disc.addTrack(new Track("Smile", 256, 2018, "classic", "Dreik"));
    }

    @Test
    void testDeleteOne() {
        disc.deleteTrack(disc.getTracks().indexOf(track1));
        Assertions.assertFalse(disc.getTracks().contains(track1));
    }

    @Test
    void testDeleteALL() {
        for (int i = 0; i < 5; i++) {
            disc.deleteTrack(0);
        }
        Assertions.assertEquals(0, disc.getTracks().size());
    }


}
