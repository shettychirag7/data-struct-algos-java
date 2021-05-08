package com.learning.search.binarysearch;

public class BinarySearchTree {

    TreeNode rootNode;

    public BinarySearchTree() {
    }

    public void insert(int data) {
        if (rootNode == null) {
            rootNode = new TreeNode(data);
        }
        rootNode.insert(data);
    }

    public void traverseInOrder() {
        rootNode.traverseInOrder();
    }


}
