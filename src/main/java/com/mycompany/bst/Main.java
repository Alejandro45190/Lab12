package com.mycompany.bst;

import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        
        BST tree = new BST();
        tree.insert(50);
        tree.insert(30);
        tree.insert(20);
        tree.insert(40);
        tree.insert(70);
        tree.insert(60);
        tree.insert(80);
 
        Iterator<Integer> test = tree.iterator();
        while (test.hasNext()){
            System.out.println(test.next());
        }
        // print inorder traversal of the BST
        
    }
}
