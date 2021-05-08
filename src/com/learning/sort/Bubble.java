package com.learning.sort;

/**
 * <b>Bubble Sort:</b>
 *
 * Worst Case Time Complexity: O(n^2) - Quadratic
 * Worst Case Space Complexity: O(1)
 * Stable/Unstable: Stable sort. Since original positions are retained
 * Point to note: Performance decreases when size increases.
 *
 **/
public class Bubble extends Sort{

    public Bubble(int[] items) {
        super(items);
    }

    @Override
    public void sort() {
        start();
        for (int i = 0; i < items.length; i++) {
            for (int j = i; j < items.length; j++) {
                if (items[i] > items[j]) {
                    swap(items, i, j);
                }
            }
        }
        end();
    }
}
