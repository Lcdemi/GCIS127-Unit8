package unit08.mcf;

import java.util.Iterator;

public class FibonacciRange implements Range {
    private int size;

    public FibonacciRange(int size) {
        this.size = size;
    }

    @Override
    public int getSize() {
        return this.size;
    }

    @Override
    public int get(int index) {
        if(index < 0 || index >= getSize()) {
            throw new IndexOutOfBoundsException();
        } else {
            if(index == 0) {
                return 0;
            }
            if(index == 1) {
                return 1;
            }

            int num1 = 1; int num2 = 0;
            int temporary;
            while(index > 1) {
                temporary = num1;
                num1 = num2 + num1;
                num2 = temporary;
                index--;
            }
            return num1;
        }
    }

    @Override
    public Iterator<Integer> iterator() { 
        return new RangeIterator(new FibonacciRange(this.size));
    }

    public static void main(String[] args) {
        FibonacciRange fibonacciRange = new FibonacciRange(46);
        System.out.print("Fibonacci Sequence: ");
        for (int num : fibonacciRange) {
            System.out.print(num + " ");
        }
    }
    
}
