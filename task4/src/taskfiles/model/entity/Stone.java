package taskfiles.model.entity;

import java.util.Comparator;
import java.util.Objects;

public class Stone {
    private final static String DEFAULT_NAME = "None";
    private final static double DEFAULT_PRICE = 0;
    private final static double DEFAULT_WEIGHT = 0;
    private final static double DEFAULT_TRANSPARENCY = 0;
    private final static String DEFAULT_COLOR = "Grey";
    private String name;
    private double price;
    private double weight;
    private double transparency;
    private String color;
    public static Comparator<Stone> comparatorOfPrice = (Stone o1, Stone o2) -> (int) (o1.price - o2.price);
    public static Comparator<Stone> comparatorOfWeight = (Stone o1, Stone o2) -> (int) (o1.weight - o2.weight);
    public static Comparator<Stone> comparatorOfTransparency = (Stone o1, Stone o2)
            -> (int) (o1.transparency - o2.transparency);
    public static Comparator<Stone> comparatorOfColor = (Stone o1, Stone o2) -> (int) (o1.color.compareTo(o2.color));

    public Stone() {
        name = DEFAULT_NAME;
        price = DEFAULT_PRICE;
        weight = DEFAULT_WEIGHT;
        transparency = DEFAULT_TRANSPARENCY;
        color = DEFAULT_COLOR;
    }

    public Stone(String name, double price, double weight, double transparency, String color) {
        if (price >= 0 && weight > 0 && transparency >= 0 && transparency < 100 && color != null && name != null) {
            this.name = name;
            this.price = price;
            this.weight = weight;
            this.transparency = transparency;
            this.color = color;
        }
    }

    public Stone(Stone stone) {
        if (stone != null) {
            name = stone.name;
            price = stone.price;
            weight = stone.weight;
            transparency = stone.transparency;
            color = stone.color;
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name != null) {
            this.name = name;
        }
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if (price >= 0)
            this.price = price;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        if (weight > 0)
            this.weight = weight;
    }

    public double getTransparency() {
        return transparency;
    }

    public void setTransparency(double transparency) {
        if (transparency >= 0 && transparency <= 100) {
            this.transparency = transparency;
        }
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        if (color != null) {
            this.color = color;
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Stone)) {
            return false;
        }
        Stone stone = (Stone) o;
        return getName().equals(stone.getName()) && getPrice() == stone.getPrice() &&
                getWeight() == stone.getWeight() && getTransparency() == stone.getTransparency() &&
                getColor().equals(stone.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getPrice(), getWeight(), getTransparency(), getColor());
    }

    @Override
    public String toString() {
        return "Stone{" + "name=" + name + ", price=" + price + "$, weight=" + weight +
                " carat, transparency=" + transparency + "%, color=" + color + "}";
    }
}
