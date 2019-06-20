package taskfiles.model.logic;

import taskfiles.model.entity.*;
import taskfiles.model.Necklace;
import java.util.Comparator;

public class Manager {

    private Manager() {
    }

    public static double calculateCost(Necklace necklace) {
        if (necklace != null) {
            double sum = 0;
            for (Stone stone : necklace) {
                sum += stone.getPrice();
            }
            return sum;
        } else {
            return -1;
        }
    }

    public static double calculateWeight(Necklace necklace) {
        if (necklace != null) {
            double sum = 0;
            for (Stone stone : necklace) {
                sum += stone.getWeight();
            }
            return sum;
        } else {
            return -1;
        }
    }

    public static Necklace searchByTransparency(Necklace necklace, double start, double end) {
        Necklace list = new Necklace();
        for (Stone stone : necklace) {
            if (stone.getTransparency() >= start && stone.getTransparency() <= end) {
                list.addStone(stone);
            }
        }
        return list;
    }

    public static void qSort(Necklace necklace, Comparator<Stone> comparator) {
        doSort(necklace, 0, necklace.getStonesCount() - 1, comparator);
    }

    private static void doSort(Necklace necklace, int start, int end, Comparator<Stone> comparator) {
        if (start >= end)
            return;
        int a = start, b = end;
        int cur = a - (a - b) / 2;
        while (a < b) {
            while (a < cur && (comparator.compare(necklace.getStone(a), necklace.getStone(cur)) <= 0)) {
                a++;
            }
            while (b > cur && (comparator.compare(necklace.getStone(cur), necklace.getStone(b)) <= 0)) {
                b--;
            }
            if (a < b) {
                Stone temp = necklace.getStone(a);
                necklace.setStone(necklace.getStone(b), a);
                necklace.setStone(temp, b);
                if (a == cur)
                    cur = b;
                else if (b == cur)
                    cur = a;
            }
        }
        doSort(necklace, start, cur, comparator);
        doSort(necklace, cur + 1, end, comparator);
    }

}
