package ua.Lab.Menu;

import org.apache.log4j.Logger;
import  ua.Lab.Admin.Admin;
import  ua.Lab.Command.*;
import  ua.Lab.Composition.MusicLibrary;
import  ua.Lab.Disc.Disc;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;



public class Menu {
    MusicLibrary musicLibrary = new MusicLibrary();
    Disc disc = new Disc();
    Scanner scanner = new Scanner(System.in);

    private static  final Logger logger = Logger.getLogger(Menu.class);
    public void start() {
        logger.info("Програма запустилась!");
        musicLibrary.addData();
        Map<String, Command> commands = new HashMap<>();
        commands.put("add-collection", new AddCollectionToDiscCommand(musicLibrary, disc));
        commands.put("new-track", new AddNewTrackToLibraryCommand(musicLibrary));
        commands.put("sort-data", new StyleSortDiscCommand(disc));
        commands.put("find-data", new FindCompositionCommand(musicLibrary));
        commands.put("delete-from-disc", new DeleteFromDiscCommand(disc));
        commands.put("disc-duration-data", new SumDurationCommand(disc));
        commands.put("exit", new ExitCommand());

        Admin admin = new Admin(musicLibrary, disc, commands);
        while (true) {
            admin.getAndApplyCommand(scanner.nextLine());
        }
    }
}
