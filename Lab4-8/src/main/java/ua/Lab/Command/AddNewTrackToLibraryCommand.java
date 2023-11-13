package ua.Lab.Command;

import org.apache.log4j.Logger;
import  ua.Lab.Composition.MusicLibrary;
import ua.Lab.Composition.Track;
import ua.Lab.Menu.Menu;

public class AddNewTrackToLibraryCommand implements Command{
    private MusicLibrary musicLibrary;
    private static final Logger logger = Logger.getLogger(Menu.class);
    public AddNewTrackToLibraryCommand(MusicLibrary musicLibrary) {
        this.musicLibrary = musicLibrary;
    }
    @Override
    public void execute() {
        musicLibrary.newTrack(new Track());
        logger.info("Додавання треку до бібліотеки");
    }
}

