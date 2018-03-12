package com.company;

public class BinaryTree {

    Node root;

    public void addNode(int value, String name) {   //добавление нового узла по его значению

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

    public void addNode(Node newNode) {   //добавление существующего узла

        int value = newNode.value;

        String name = newNode.name;

        addNode(value, name);

    }

    public Node findNode(int value) {      // поиск по значению узла

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

    public Node findNode(Node node) {     //поиск по узлу

        return findNode(node.value);

    }


    public boolean contains(int value) {   //содержание по значению узла

        return findNode(value) != null;

    }

    public boolean contains(Node node) {   //содержание по узлу

        return findNode(node.value) != null;

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

        return name + " " + value;

    }

}
