package com.learning.chirag;

import com.learning.chirag.search.binarysearch.BinarySearchTree;
import com.learning.chirag.sort.*;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        int[] unsorted = new int[] { 20, 22, 23, -4, 3, 1, 6, 5};
        System.out.println("Binary Tree Example:");
        runBinaryTreeExample(unsorted);
        System.out.println();
        System.out.println("Sorting Example:");
        runSortingExample(unsorted);
    }

    private static void runSortingExample(int[] unsorted) {
        List<Sort> sorters = new ArrayList<>(
                Arrays.asList(
                        new Bubble(unsorted.clone()),
                        new Selection(unsorted.clone()),
                        new Insertion(unsorted.clone()),
                        new Shell(unsorted.clone()),
                        new Merge(unsorted.clone()),
                        new Merge(unsorted.clone(), Sort.Order.DESCENDING),
                        new Quick(unsorted.clone()),
                        new Counting(new int[] {2,3,8,2,4,6,7,8}, 2, 8)
                )
        );
        for (Sort sorter: sorters) {
            sorter.sort();
            sorter.print();
        }
        System.out.println();
    }

    private static void runBinaryTreeExample(int[] unsorted) {
        BinarySearchTree tree = new BinarySearchTree();
        for (int j : unsorted) {
            tree.insert(j);
        }
        tree.traverseInOrder();
    }
}
