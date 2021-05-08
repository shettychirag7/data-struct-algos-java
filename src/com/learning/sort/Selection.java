package com.learning.sort;

/**
 * <b>Selection Sort:</b>
 *
 * Worst Case Time Complexity: O(n^2) - Quadratic
 * Worst Case Space Complexity: O(1)
 * Stable/Unstable: Unstable sort. Since original positions are not retained
 * Point to note: Doesn't require as much swapping as BubbleSort. We swap only
 *                once per traversal.
 *
* */
public class Selection extends Sort {

    public Selection(int[] items) {
        super(items);
    }

    @Override
    public void sort() {
        start();
        if (items != null) {
            for (int lastIndex = items.length - 1; lastIndex  >= 0; lastIndex--) {
                int largest = 0;
                for (int j = 0; j <= lastIndex; j++) {
                    if (items[largest] < items[j]) {
                        largest = j;
                    }
                }
                if (lastIndex != largest) swap(items, lastIndex, largest);
            }
        }
        end();
    }
}
