package com.learning.sort;

/**
 * <b>Shell Sort:</b>
 *
 * Worst Case Time Complexity: O(n^2) - Quadratic but can still perform better based on Gap
 * Worst Case Space Complexity: O(1)
 * Stable/Unstable: Unstable sort. Since it doesn't consider elements in between intervals
 * Point to note: Doesn't require as much shifting as insertion sort. Basically based
 *                on the idea that if we pre sort the array, then the performance will
 *                be better when we perform insertion sort when interval becomes 1.
 *
 * */
public class Shell extends Sort {

    public Shell(int[] items) {
        super(items);
    }

    @Override
    public void sort() {
        start();
        for (int gap = items.length/2; gap > 0; gap /= 2) {
            for (int i = gap; i < items.length; i++) {
                int temp = items[i];
                int pointer = i;
                for (int j = i - gap; j >=0; j -= gap) {
                    if (items[j] > temp) {
                        items[pointer] = items[j];
                        pointer = j;
                    } else {
                        break;
                    }
                    items[pointer] = temp;
                }
            }
        }
        end();
    }
}
