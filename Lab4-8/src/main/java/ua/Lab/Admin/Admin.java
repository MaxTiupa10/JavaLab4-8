package ua.Lab.Admin;


import org.apache.log4j.Logger;
import ua.Lab.Command.*;
import ua.Lab.Composition.MusicLibrary;
import ua.Lab.Disc.Disc;
import ua.Lab.Menu.Menu;

import java.util.*;

public class Admin {

    private MusicLibrary musicLibrary;

    private Disc disc;
    private final Map<String, Command> adminCommands;

    private static final Logger logger = Logger.getLogger(Menu.class);

    public Admin(MusicLibrary musicLibrary, Disc disc, Map<String, Command> adminCommands) {
        this.musicLibrary = musicLibrary;
        this.disc = disc;
        this.adminCommands = adminCommands;
    }

    public void getAndApplyCommand(String consoleCommand) {
        if (consoleCommand.isEmpty()) {
            logger.error("Пуста стрічка!");
            System.out.println("Ви ввели пусту стрічку!");
            return;
        }

        if (!isValidCommand(consoleCommand)) {
            System.out.println("Невірна команда: " + consoleCommand);
            logger.error("Невірна команда: " + consoleCommand);
            return;
        }

        adminCommands.get(consoleCommand).execute();
    }

    private boolean isValidCommand(String command) {
        return adminCommands.containsKey(command);
    }
}

