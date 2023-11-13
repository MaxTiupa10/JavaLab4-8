package ua.Lab.Command;

import org.apache.log4j.Logger;
import ua.Lab.Menu.Menu;

public class ExitCommand implements Command {

    private static final Logger logger = Logger.getLogger(Menu.class);
    @Override
    public void execute() {
        logger.info("Завершення програми!");
        System.exit(0);
    }
}