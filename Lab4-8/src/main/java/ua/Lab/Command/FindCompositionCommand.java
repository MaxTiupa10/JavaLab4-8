package ua.Lab.Command;

import org.apache.log4j.Logger;
import  ua.Lab.Composition.MusicLibrary;
import ua.Lab.Menu.Menu;

public class FindCompositionCommand implements Command {
    private MusicLibrary musicLibrary;
    private static final Logger logger = Logger.getLogger(Menu.class);
    public FindCompositionCommand(MusicLibrary musicLibrary) {
        this.musicLibrary = musicLibrary;
    }
    public void execute(){
        musicLibrary.durationDiapason();
        logger.info("Пошук треків за діапазоном");
    }
}