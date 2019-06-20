package taskfiles.view.menu;

import org.apache.log4j.Logger;
import taskfiles.model.Necklace;
import taskfiles.view.Printer;
import taskfiles.io.BufferedReader;
import taskfiles.io.IOException;
import taskfiles.io.InputStreamReader;
import taskfiles.util.ArrayList;
import taskfiles.util.List;

public class Menu {
    private static final Logger LOG = Logger.getLogger(Menu.class);
    private List<MenuEntry> menu = new ArrayList<>();
    private boolean isExit = false;

    public Menu() {
        menu.add(new MenuEntry("Exit") {
            @Override
            public void run(Necklace necklace) {
                isExit = true;
            }
        });
    }

    public void run(Necklace necklace) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        while (!isExit) {
            Printer.execute(toString());
            try {
                int chosenVal = Integer.parseInt(reader.readLine());
                MenuEntry entry = menu.get(chosenVal);
                entry.run(necklace);
            }
            catch (IOException e) {
                LOG.warn("Menu: ", e);
            }
        }

    }

    public void addEntry(MenuEntry entry) {
        if (entry != null)
            menu.add(entry);
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("Menu:");
        for (int i = 0; i < menu.size(); i++) {
            builder.append(String.format("\n%s - %s;", i, menu.get(i).getTitle()));
        }
        return builder.toString();
    }
}
