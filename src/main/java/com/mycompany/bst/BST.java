package com.mycompany.bst;

import java.util.Iterator;

public class BST {

    class Node
    {
        int key;
        Node left, right, parent;
 
        public Node(int item, Node parent)
        {
            key = item;
            left = right = null;
            this.parent = parent;
        }
    }
 
    // Root of BST
    Node root;
 
    // Constructor
    BST()
    {
         root = null;
    }
 
    // This method mainly calls insertRec()
    void insert(int key)
    {
         root = insertRec(root, key);
    }
 
    /* A recursive function to insert a new key in BST */
    Node insertRec(Node root, int key)
    {
        /* If the tree is empty, return a new node */
        if (root == null)
        {
            root = new Node(key, null);
            return root;
        }
        /* Otherwise, recur down the tree */
        if (key < root.key){
            root.left = insertRec(root.left, key);
            root.left.parent = root;
        } else if (key > root.key) {
            root.right = insertRec(root.right, key);
            root.right.parent = root;
        }
        /* return the (unchanged) node pointer */
        return root;
    }
    
    public void add (Integer value) {
        insert(value);
    }
    
    public Iterator<Integer> iterator() {
        return new TreeIterator();
    }
    
    public class TreeIterator implements Iterator<Integer> {
        Node next = root;
        
        TreeIterator(){
            next = root;
            while (next.left != null){
                next = next.left;
            }
            
        }
        
        @Override
        public boolean hasNext() {
            return (next != null);
        }
        
        @Override
        public Integer next() {
            Integer key = next.key;
            if (next.right != null) {
                next = next.right;
                while (next.left != null) {
                    next = next.left;
                }
                return key;
            }
            Node r = next;
            next = next.parent;
            while (next != null && r == next.right) {
                r = next;
                next = next.parent;
            }
            return key;
        }
    }
}
