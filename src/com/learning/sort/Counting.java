package com.learning.sort;

/**
 * <b>Counting Sort:</b>
 *
 * Worst Case Time Complexity: O(nk) - Assuming that you are already familiar with the data
 * Worst Case Space Complexity: O(n) - Since we are using a duplicate array to store occurance
 * Stable/Unstable: Unstable sort. Since original positions are not retained
 * Point to note: Good if you know data and much faster than other sorting algorithms
 *
 * */

public class Counting extends Sort {
    private final int min;
    private final int max;


  /**
   * @param items input array
   * @param min the minimum value in input array
   * @param max the maximum value in input array
   *
  * */
    public Counting(int[] items, int min, int max) {
        super(items);
        this.min = min;
        this.max = max;
    }

    @Override
    public void sort() {
        countingSort(items, min, max);
    }

    private void countingSort(int[] inputs, int min, int max) {
        int[] countArray = new int[(max-min) + 1];

        for (int i = 0; i < inputs.length; i++) {
            countArray[inputs[i] - min]++;
        }

        int j = 0;

        for (int i = min; i <= max; i++) {
            // Until count at location is not 0, keep on adding the number
            while (countArray[i - min] > 0) {
                inputs[j++] = i;
                countArray[i - min]--;
            }
        }



    }

}
