package taskfiles.view.menu;

import taskfiles.model.Necklace;
import taskfiles.view.Printer;

public class NecklacePrint extends MenuEntry {
    public NecklacePrint(String title){
        super(title);
    }
    @Override
    public void run(Necklace necklace) {
        Printer.execute(necklace);
    }
}
