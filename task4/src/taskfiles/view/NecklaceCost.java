package taskfiles.view.menu;

import taskfiles.model.Necklace;
import taskfiles.model.logic.Manager;
import taskfiles.view.Printer;

public class NecklaceCost extends MenuEntry {
    public NecklaceCost(String title) {
        super(title);
    }

    @Override
    public void run(Necklace necklace) {
        Printer.execute("Cost:");
        Printer.execute(Manager.calculateCost(necklace));
    }
}
