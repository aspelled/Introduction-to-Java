package taskfiles.view.menu;

import taskfiles.model.Necklace;
import taskfiles.model.entity.Stone;
import taskfiles.model.logic.Manager;

public class NecklaceSort extends MenuEntry {
    public NecklaceSort(String title) {
        super(title);
    }

    @Override
    public void run(Necklace necklace) {
        Manager.qSort(necklace, Stone.comparatorOfWeight);
    }
}
