package com.learning.chirag.sort;

/**
 * <b>Quick Sort:</b>
 *
 * Worst Case Time Complexity: O(n^2) - Quadratic but usually performs
 *                              O(nlogn) in average cases.
 * Worst Case Space Complexity: O(1) It is an in place algorithm
 * Stable/Unstable: Unstable sort. Since original positions are retained
 * Point to note: Java internally used Merge Sort in Java 1.6 but now uses
 *                Tim Sort (Derived from Merge & Insertion) in Java 1.8
 *
 *
 * */
public class Quick extends Sort {
    public Quick(int[] items) {
        super(items);
    }

    @Override
    public void sort() {
        start();
        quickSort(items, 0, items.length);
        end();
    }

    private void quickSort(int[] inputs, int startIndex, int endIndex) {
        if (endIndex - startIndex < 2) return;

        int pivotIndex = partition(inputs, startIndex, endIndex);

        quickSort(inputs, startIndex, pivotIndex);
        quickSort(inputs, pivotIndex + 1, endIndex);
    }

    private int partition(int[] inputs, int startIndex, int endIndex) {
        int pivot = inputs[startIndex];
        int i = startIndex;
        int j = endIndex;

        while (j > i) {
           // Find index from behind which is less than i
            while (j > i && inputs[--j] >= pivot);
            if ( j > i) {
                inputs[i] = inputs[j];
            }
            while (j > i && inputs[++i] <= pivot);
            if (j > i) {
                inputs[j] = inputs[i];
            }
        }

        inputs[j] = pivot;
        return j;
    }
}
