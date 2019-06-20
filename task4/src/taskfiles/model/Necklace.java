package taskfiles.model;

import taskfiles.model.entity.Stone;
import java.util.*;

public class Necklace implements Iterable<Stone> {
    private List<Stone> necklace;
    private int count;

    public Necklace() {
        necklace = new ArrayList<>();
    }

    public Necklace(List<Stone> necklace) {
        this.necklace = new ArrayList<>(necklace);
    }

    public Necklace(Necklace necklace) {
        this.necklace = new ArrayList<>(necklace.necklace);
    }

    public void addStone(Stone stone) {
        if (stone != null) {
            count++;
            necklace.add(stone);
        }
    }

    public void addAll(Collection<? extends Stone> necklace) {
        if (necklace != null) {
            count++;
            this.necklace.addAll(necklace);
        }
    }

    public void removeAll() {
        necklace.clear();
    }

    public void removeStone(int index) {
        if ((index >= 0) && (index < necklace.size())) {
            count++;
            necklace.remove(index);
        }
    }

    public void removeStone(Stone stone) {
        if (stone != null) {
            count++;
            necklace.remove(stone);
        }
    }

    public Stone getStone(int index) {
        return necklace.get(index);
    }

    public void setStone(Stone stone, int index) {
        if ((stone != null) && (index >= 0) || (index < getStonesCount())) {
            necklace.set(index, stone);
        }
    }

    public int getStonesCount() {
        return necklace.size();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Necklace)) {
            return false;
        }
        Necklace necklace1 = (Necklace) o;
        boolean result = true;
        if (necklace1.getStonesCount() == getStonesCount()) {
            for (int i = 0; i < getStonesCount(); i++) {
                result &= necklace1.getStone(i).equals(necklace.get(i));
            }
        } else {
            result = false;
        }
        return result;
    }

    @Override
    public int hashCode() {
        return Objects.hash(necklace);
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        for (Stone stone : necklace) {
            builder.append(stone + "\n");
        }
        return builder.toString();
    }

    @Override
    public Iterator<Stone> iterator() {
        return new Iterator<Stone>() {
            int index;
            int expCount = count;
            int last = -1;

            @Override
            public boolean hasNext() {
                return index != getStonesCount();
            }

            @Override
            public Stone next() {
                checkForComodification();
                int i = index;
                if (i >= getStonesCount())
                    throw new ConcurrentModificationException();
                index = i + 1;
                return necklace.get(last = i);
            }

            @Override
            public void remove() {
                if (last < 0)
                    throw new IllegalStateException();
                checkForComodification();
                try {
                    Necklace.this.removeStone(last);
                    index = last;
                    last = -1;
                    expCount  = count;
                } catch (IndexOutOfBoundsException ex) {
                    throw new ConcurrentModificationException();
                }
            }
            final void checkForComodification() {
                if (count != count)
                    throw new ConcurrentModificationException();
            }
        };
    }
}
