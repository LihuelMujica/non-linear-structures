package binarytrees;

public class Tree {
    private static class Node {
        private int value;
        private Node leftChild;
        private Node rightChild;

        public Node(int value) {
            this.value = value;
        }

        @Override
        public String toString() {
            return "Node=" + this.value;
        }
    }

    private Node root;

    public void insert(int value) {
        if ( root == null ) {
            root = new Node(value);
            return;
        }

        Node current = root;

        while (true) {
            if (value < current.value ) {
                if ( current.leftChild == null ) {
                    current.leftChild = new Node(value);
                    break;
                }
                current = current.leftChild;
            }

            if (value > current.value ) {
                if ( current.rightChild == null ) {
                    current.rightChild = new Node(value);
                    break;
                }
                current = current.rightChild;
            }
        }


    }

    public boolean find(int value) {
        if ( root == null ) {
            return false;
        }

        Node current = root;

        while ( current != null ) {
            if ( current.value == value ) {
                return true;
            }
            if ( value > current.value ) {
                current = current.rightChild;
            }
            else {
                current = current.leftChild;
            }
        }

        return false;
    }
}
