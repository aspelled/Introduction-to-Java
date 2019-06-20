package taskfiles.controller;

import org.apache.log4j.Logger;
import taskfiles.view.menu.*;
import taskfiles.model.Necklace;
import taskfiles.util.FileWorker;
import taskfiles.view.Printer;

public class App {
    private static final Logger LOG = Logger.getLogger(App.class);
    public static void main(String[] args) {
        Printer.execute("Necklace\n");
        LOG.info("Start");
        Menu menu = new Menu();
        Necklace necklace = FileWorker.createNecklaceFromFile("src\\resources\\stones.txt");
        menu.addEntry(new NecklacePrint("Print"));
        menu.addEntry(new FunctionMenu("Functional"));
        menu.run(necklace);
    }
}
