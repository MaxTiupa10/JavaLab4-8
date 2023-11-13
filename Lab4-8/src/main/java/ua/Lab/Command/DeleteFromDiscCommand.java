package ua.Lab.Command;

import org.apache.log4j.Logger;
import  ua.Lab.Disc.Disc;
import ua.Lab.Menu.Menu;

public class DeleteFromDiscCommand implements Command{
    private Disc disc;

    public DeleteFromDiscCommand(Disc disc) {
        this.disc = disc;
    }
    private static final Logger logger = Logger.getLogger(Menu.class);
    @Override
    public void execute() {
        disc.deleteComposition();
        logger.info("Видалення треків з диску!");
    }

}

