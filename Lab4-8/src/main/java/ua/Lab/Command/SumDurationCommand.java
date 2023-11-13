package ua.Lab.Command;

import org.apache.log4j.Logger;
import  ua.Lab.Collection.Collection;
import ua.Lab.Menu.Menu;

public class SumDurationCommand implements Command {

    private Collection collection;
    private static final Logger logger = Logger.getLogger(Menu.class);
    public SumDurationCommand(Collection collection) {
        this.collection = collection;
    }
    @Override
    public void execute() {
        logger.info("Cумарна тривалість");
        System.out.println("Сумарна тривалість дорівнює "+collection.sumDuration()+" секунд ");
    }
}
