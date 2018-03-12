package com.company;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class Tests {

    BinaryTree testTree = new BinaryTree();

    @Test
    public void addNode() {
        testTree.addNode(5,"root");
        testTree.addNode(3,"leftChild");
        testTree.addNode(7,"rightChild");
        assertEquals("root 5", testTree.root.toString());
        assertEquals("leftChild 3", testTree.root.leftChild.toString());
        assertEquals("rightChild 7", testTree.root.rightChild.toString());
    }

    @Test
    public void contains() {
        testTree.addNode(1,"testName");
        assertEquals(true, testTree.contains(1));
        assertEquals(false, testTree.contains(999));
    }
}
