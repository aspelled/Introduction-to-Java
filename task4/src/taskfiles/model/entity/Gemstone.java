package taskfiles.model.entity;

import java.util.Objects;

public class Gemstone extends Stone {
    private final static String DEFAULT_MINERAL = "Diamond";
    private String mineral;

    public Gemstone() {
        super();
        mineral = DEFAULT_MINERAL;
    }

    public Gemstone(String name, double price, double weight, double transparency, String color, String mineral) {
        super(name, price, weight, transparency, color);
        if (mineral != null) {
            this.mineral = mineral;
        }
    }

    public Gemstone(Gemstone stone) {
        super(stone);
        if (stone != null) {
            mineral = stone.mineral;
        }
    }

    public String getMineral() {
        return mineral;
    }

    public void setMineral(String mineral) {
        if (mineral != null) {
            this.mineral = mineral;
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Gemstone)) {
            return false;
        }
        if (!super.equals(o)) {
            return false;
        }
        Gemstone gemstone = (Gemstone) o;
        return Objects.equals(getMineral(), gemstone.getMineral());
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), getMineral());
    }

    @Override
    public String toString() {
        return "GemStone{" + "name=" + getName() + ", price=" + getPrice() +
                "$, weight=" + getWeight() + " carat, transparency=" + getTransparency() +
                "%, color=" + getColor() + ", mineral=" + mineral + "}";
    }
}
