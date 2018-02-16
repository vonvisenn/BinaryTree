package com.company;

public class BinaryTree {

    Node root;

    public void addNode(int value, String name) {

        Node newNode = new Node(value, name);

        if (root == null) {

            root = newNode;

        } else {

            Node additionalNode = root;

            Node parentNode;

            while (true) {

                parentNode = additionalNode;

                if (value < additionalNode.value) {

                    additionalNode = additionalNode.leftChild;

                    if (additionalNode == null) {

                        parentNode.leftChild = newNode;

                        parentNode.leftChild.parent = parentNode;

                        return;

                    }

                } else {

                    additionalNode = additionalNode.rightChild;

                    if (additionalNode == null) {

                        parentNode.rightChild = newNode;

                        parentNode.rightChild.parent = parentNode;

                        return;

                    }

                }

            }

        }

    }

    public Node findNode(int value) {

        Node additionalNode = root;

        while (additionalNode.value != value) {

            if (value < additionalNode.value) {

                additionalNode = additionalNode.leftChild;

            } else {

                additionalNode = additionalNode.rightChild;

            }

            if (additionalNode == null) {

                return null;

            }

        }

        return additionalNode;

    }

    public boolean contains(int value) {

        return findNode(value) != null;

    }

    public void deleteNode(int value) {

        //coming soon

    }

}

class Node {

    int value;

    String name;

    Node parent;

    Node rightChild;

    Node leftChild;

    Node (int value, String name) {

        this.value = value;

        this.name = name;

    }

    public String toString() {

        return name + " has a value of " + value;

    }

}
