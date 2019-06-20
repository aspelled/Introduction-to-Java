package taskfiles.view.menu;

import org.apache.log4j.Logger;
import taskfiles.model.Necklace;
import taskfiles.model.logic.Manager;
import taskfiles.view.Printer;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class NecklaceFindStone extends MenuEntry {
    private static final Logger LOG = Logger.getLogger(NecklaceFindStone.class);

    public NecklaceFindStone(String title) {
        super(title);
    }

    @Override
    public void run(Necklace necklace) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        double start = 0;
        double end = 0;
        try {
            Printer.execute("Enter low limit of transparency:");
            start = Double.parseDouble(reader.readLine());
            Printer.execute("Enter high limit of transparency:");
            end = Double.parseDouble(reader.readLine());
        } catch (IOException e) {
            LOG.warn(e);
        }
        Printer.execute(Manager.searchByTransparency(necklace, start, end));
    }
}
