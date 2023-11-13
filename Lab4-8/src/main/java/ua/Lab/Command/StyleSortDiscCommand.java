package ua.Lab.Command;

import org.apache.log4j.Logger;
import ua.Lab.Disc.Disc;
import ua.Lab.Menu.Menu;

public class StyleSortDiscCommand implements Command {

    private Disc disc;
    private static final Logger logger = Logger.getLogger(Menu.class);

    public StyleSortDiscCommand(Disc disc) {
        this.disc = disc;
    }

    @Override
    public void execute() {
        disc.Sort();
        logger.info("Сортування за жанрами");
    }
}
