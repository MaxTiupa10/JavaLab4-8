package ua.Lab.Command;

import org.apache.log4j.Logger;
import  ua.Lab.Composition.MusicLibrary;
import  ua.Lab.Disc.Disc;
import ua.Lab.Menu.Menu;

public class AddCollectionToDiscCommand implements Command{
    private MusicLibrary musicLibrary;
    private Disc disc;

    private static final Logger logger = Logger.getLogger(Menu.class);
    public AddCollectionToDiscCommand(MusicLibrary musicLibrary, Disc disc) {
        this.musicLibrary = musicLibrary;
        this.disc = disc;
    }

    @Override
    public void execute() {
        disc.addCollection(musicLibrary.getLibrary());
        logger.info("Додавання збірки до диску");
    }
}
