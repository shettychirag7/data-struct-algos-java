package com.learning.chirag.sort;

public abstract class Sort {

    protected final int[] items;

    protected final Order order;

    private long startTime;
    private long endTime;

    public Sort(int[] items, Order order) {
        this.items = items;
        this.order = order;
    }

    public Sort(int[] items) {
        this(items, Order.ASCENDING);
    }

    public abstract void sort();

    protected void swap(int[] items, int fromIndex, int toIndex) {
        int temp = items[fromIndex];
        items[fromIndex] = items[toIndex];
        items[toIndex] = temp;
    }

    protected void start() {
        startTime = System.nanoTime();
    }

    protected void end() {
        endTime = System.nanoTime();
    }


    public void print() {
        if (items != null) {
            System.out.printf("%s Sort Result in %s Order (%d ms):",this.getClass().getSimpleName(), order.toString(), endTime - startTime);
            for (int i: items) {
                System.out.printf("\t%d", i);
            }
            System.out.println();
        }
    }

    public enum Order {
        ASCENDING, DESCENDING;
    }
}
