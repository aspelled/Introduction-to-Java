package taskfiles.view.menu;

import taskfiles.model.Necklace;
import taskfiles.model.logic.Manager;
import taskfiles.view.Printer;

public class NecklaceWeight extends MenuEntry {
    public NecklaceWeight(String title) {
        super(title);
    }

    @Override
    public void run(Necklace necklace) {
        Printer.execute("Weight:");
        Printer.execute(Manager.calculateWeight(necklace));
    }
}
