package com.mycompany;

// Import the BinaryTree class
import com.mycompany.BinaryTree;
import java.util.*;

// Main class to demonstrate BinaryTree usage
public class Main {
    public static void main(String[] args) {
        // Create a new BinaryTree instance
        BinaryTree tree = new BinaryTree();

        // Insert nodes into the binary tree
        tree.insert(50);
        tree.insert(30);
        tree.insert(20);
        tree.insert(40);
        tree.insert(70);
        tree.insert(60);
        tree.insert(80);

        // Print the inorder traversal of the tree
        System.out.println("Inorder traversal:");
        tree.inorder();
    }
}