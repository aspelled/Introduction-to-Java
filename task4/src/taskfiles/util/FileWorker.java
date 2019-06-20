package taskfiles.util;

import org.apache.log4j.Logger;
import taskfiles.model.Necklace;
import taskfiles.model.entity.Gemstone;
import taskfiles.model.entity.OrganicStone;
import taskfiles.model.entity.Stone;
import taskfiles.model.entity.TypesOfStones;
import taskfiles.model.exception.ValueException ;
import java.io.*;

public class FileWorker {
    private static final Logger LOG = Logger.getLogger(FileWorker.class);

    private FileWorker() {
    }

    public static Necklace createNecklaceFromFile(String fileName) {
        Necklace necklace = new Necklace();
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] arr = line.split("\\|");
                necklace.addStone(StoneFactory.getStoneFromString(arr));
            }
        } catch (ValueException  | NumberFormatException | IOException ex) {
            LOG.warn(ex);
        }
        return necklace;
    }

}
