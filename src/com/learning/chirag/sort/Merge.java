package com.learning.chirag.sort;

/**
 * <b>Merge Sort:</b>
 *
 * Worst Case Time Complexity: O(nlogn) since splitting of arrays are
 *                             logarithmic and merging them is linear
 * Worst Case Space Complexity: O(n) since we take a temp array to sort
 *                              and copy back to original
 * Stable/Unstable: Stable sort. Since original positions are retained
 * Point to note: Java internally used Merge Sort in Java 1.6 but now uses
 *                Tim Sort (Derived from Merge & Insertion) in Java 1.8
 *
 *
 * */
public class Merge extends Sort {

    public Merge(int[] items) {
        super(items);
    }

    public Merge(int[] items, Order order) {
        super(items, order);
    }

    @Override
    public void sort() {
        start();
        mergeSort(items, 0, items.length);
        end();
    }

    private void mergeSort(int[] input, int start, int end) {
        if (end - start < 2) return;
        int mid = (start + end)/2;
        mergeSort(input, start, mid);
        mergeSort(input, mid, end);
        merge(input, start, mid, end);
    }

    private void merge(int[] inputs, int start, int mid, int end) {
        if (order == Order.ASCENDING && inputs[mid - 1] <= inputs[mid]) return;
        if (order == Order.DESCENDING && inputs[mid - 1] >= inputs[mid]) return;
        int i = start;
        int j = mid;
        int tempIndex = 0;
        int[] temp = new int[end-start];
        while (i < mid && j < end) {
            if (order == Order.ASCENDING)
                temp[tempIndex++] = (inputs[i] <= inputs[j]) ? inputs[i++] : inputs[j++];
            if (order == Order.DESCENDING)
                temp[tempIndex++] = (inputs[i] >= inputs[j]) ? inputs[i++] : inputs[j++];
        }
        // Handling cases wherein if the item in i is not completely copied over to temp
        System.arraycopy(inputs, i, inputs, start + tempIndex, mid - i);
        // Copy back temp to original
        System.arraycopy(temp, 0, inputs, start, tempIndex);
    }
}
