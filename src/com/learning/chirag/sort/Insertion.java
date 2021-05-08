package com.learning.chirag.sort;

/**
 * <b>Insertion Sort:</b>
 *
 * Worst Case Time Complexity: O(n^2) - Quadratic
 * Worst Case Space Complexity: O(1)
 * Stable/Unstable: Stable sort. Since original positions are retained
 * Point to note: Optimal solution for already sorted array since number
 *                of shifting required is less. Can perform in almost linear time
 *                if elements are almost sorted
 *
 * */
public class Insertion extends Sort {
    public Insertion(int[] items) {
        super(items);
    }

    @Override
    public void sort() {
        start();
        int sortedIndex = 0;
        for (int i = 1; i < items.length; i++) {
            if (items[sortedIndex] > items[i]) {
                int temp = items[i];
                int pointer = i;
                for (int j = sortedIndex; j >= 0; j--) {
                    if (temp < items[j]) {
                        items[pointer--] = items[j];
                    } else {
                        break;
                    }
                }
                items[pointer] = temp;
            }
            sortedIndex++;
        }
        end();
    }
}
