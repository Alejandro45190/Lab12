package com.mycompany.bst;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class BSTTest {
    
    @Test
    public void testIterator() {
        BST tree = new BST();
        List<Integer> list = Arrays.asList(2,3,5,6,45);
        List<Integer> result = new ArrayList<>();
        tree.insert(2);
        tree.insert(3);
        tree.insert(6);
        tree.insert(45);
        tree.insert(5);
        Iterator<Integer> testing = tree.iterator();
        while(testing.hasNext()) {
            result.add(testing.next());
        }
        assertEquals(result, list);
    }    
    
    @Test
    public void testIterator2() {
        BST tree = new BST();
        List<Integer> list = Arrays.asList(2,3,4,6,45,48);
        List<Integer> result = new ArrayList<>();
        tree.insert(2);
        tree.insert(3);
        tree.insert(6);
        tree.insert(45);
        tree.insert(4);
        tree.insert(48);
        Iterator<Integer> testing = tree.iterator();
        while(testing.hasNext()) {
            result.add(testing.next());
        }
        assertEquals(result, list);
    }
    
    @Test
    public void testIterator3() {
        BST tree = new BST();
        List<Integer> list = Arrays.asList(0,1,5,8,12,14,28);
        List<Integer> result = new ArrayList<>();
        tree.insert(0);
        tree.insert(1);
        tree.insert(5);
        tree.insert(8);
        tree.insert(12);
        tree.insert(14);
        tree.insert(28);
        Iterator<Integer> testing = tree.iterator();
        while(testing.hasNext()) {
            result.add(testing.next());
        }
        assertEquals(result, list);
    }
}