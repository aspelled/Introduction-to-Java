package taskfiles.view.menu;

import taskfiles.model.Necklace;

public abstract class MenuEntry {
    private String title;

    public MenuEntry(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        if (title != null)
            this.title = title;
    }

    public abstract void run(Necklace necklace);
}
