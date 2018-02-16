package com.company;

public class Main {

    public static void main(String[] args) {

        BinaryTree newTree = new BinaryTree();

        newTree.addNode(50,"parent");
        newTree.addNode(45,"leftChild");
        newTree.addNode(55,"rightChild");

        System.out.println(newTree.findNode(45));
    }

}
