package taskfiles.view.menu;

import taskfiles.model.Necklace;

public class MenuFunction extends MenuEntry {
    public MenuFunction(String title) {
        super(title);
    }

    @Override
    public void run(Necklace necklace) {
        Menu menu = new Menu();
        menu.addEntry(new NecklaceSort("Sort"));
        menu.addEntry(new NecklaceFindStone("Transparency"));
        menu.addEntry(new NecklaceCost("Cost"));
        menu.addEntry(new NecklaceWeight("Weight"));
        menu.run(necklace);
    }
}
