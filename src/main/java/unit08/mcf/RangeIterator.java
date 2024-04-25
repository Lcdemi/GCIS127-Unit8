package unit08.mcf;

import java.util.Iterator;

public class RangeIterator implements Iterator<Integer> {
    private Range range;
    private int index;

    public RangeIterator(Range range) {
        this.range = range;
        this.index = 0;
    }

    @Override
    public boolean hasNext() {
        return index < range.getSize();
    }

    @Override
    public Integer next() {
        int value = range.get(index);
        index++;
        return value;
    }
    
}
