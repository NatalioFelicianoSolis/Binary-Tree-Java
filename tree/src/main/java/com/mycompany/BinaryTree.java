package com.mycompany;

/**
 * BinaryTree class implements a simple binary search tree (BST).
 * It supports insertion of nodes and inorder traversal.
 */
public class BinaryTree {
    // Root node of the binary tree
    Node root;

    /**
     * Inserts a new value into the binary tree.
     * @param value The value to insert.
     */
    public void insert(int value) {
        root = insertRec(root, value);
    }

    /**
     * Helper method to recursively insert a new value into the tree.
     * @param root The current node in the recursion.
     * @param value The value to insert.
     * @return The updated node after insertion.
     */
    private Node insertRec(Node root, int value) {
        // If the tree/subtree is empty, create a new node
        if (root == null) {
            return new Node(value);
        }

        // Recur down the tree to find the correct spot for the new value
        if (value < root.value) {
            root.left = insertRec(root.left, value);
        } else if (value > root.value) {
            root.right = insertRec(root.right, value);
        }
        // Return the unchanged node pointer
        return root;
    }

    /**
     * Performs an inorder traversal of the binary tree and prints node values.
     */
    public void inorder(){
        inorderRec(root);
    };

    /**
     * Helper method to recursively perform inorder traversal.
     * @param root The current node in the recursion.
     */
    private void inorderRec(Node root) {
        if (root != null) {
            inorderRec(root.left);              // Visit left subtree
            System.out.print(root.value + " "); // Print current node
            inorderRec(root.right);             // Visit right subtree
        }
    }

}
