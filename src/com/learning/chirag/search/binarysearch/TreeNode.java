package com.learning.chirag.search.binarysearch;

public class TreeNode {

    private TreeNode leftNode;
    private TreeNode rightNode;
    private int data;

    public TreeNode(int data) {
        this.setData(data);
    }

    public void insert(int data) {
        // We don't support duplicate values
        if (this.data == data) return;

        if (data < this.data) {
           if (leftNode != null) {
               leftNode.insert(data);
           } else {
               leftNode = new TreeNode(data);
           }
        } else {
            if (rightNode != null) {
                rightNode.insert(data);
            } else {
                rightNode = new TreeNode(data);
            }
        }
    }

    public void traverseInOrder() {
        if (leftNode != null) leftNode.traverseInOrder();
        System.out.printf("\t%d -->", data);

        if (rightNode != null) rightNode.traverseInOrder();
    }


    public TreeNode getLeftNode() {
        return leftNode;
    }

    public void setLeftNode(TreeNode leftNode) {
        this.leftNode = leftNode;
    }

    public TreeNode getRightNode() {
        return rightNode;
    }

    public void setRightNode(TreeNode rightNode) {
        this.rightNode = rightNode;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }
}
