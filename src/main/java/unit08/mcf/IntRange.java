package unit08.mcf;

import java.util.Iterator;

public class IntRange implements Range {
    private int start;
    private int stop;
    private int step;

    public IntRange(int start, int stop, int step) {
        this.start = start;
        this.stop = stop;
        this.step = step;
    }

    public IntRange(int start, int stop) { //default step = 1
        this.start = start;
        this.stop = stop;
        this.step = 1;
    }

    public IntRange(int stop) { //default step = 1, start = 0
        this.start = 0;
        this.stop = stop;
        this.step = 1;
    }

    @Override
    public int getSize() {
        int size = (stop - start) / step;
        if((stop - start) % step != 0) {
            size++;
        }
        return size;
    }

    @Override
    public int get(int index) {
        if(index < 0 || index >= getSize()) {
            throw new IndexOutOfBoundsException();
        } else {
            return start + (step * index);
        }
    }

    @Override
    public Iterator<Integer> iterator() { 
        return new RangeIterator(new IntRange(start, stop, step));
    }

    public static void main(String[] args) {
        IntRange range1 = new IntRange(5, 10, 2);
        IntRange range2 = new IntRange(5);
        IntRange range3 = new IntRange(5, 10);

        System.out.print("Range 1: ");
        for(int num : range1) {
            System.out.print(num + " ");
        }
        System.out.println();

        System.out.print("Range 2: ");
        for(int num : range2) {
            System.out.print(num + " ");
        }
        System.out.println();

        System.out.print("Range 3: ");
        for(int num : range3) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
    
}
