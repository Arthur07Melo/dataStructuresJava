package atividade04;

public class PV1 extends BST {

    private static final boolean RED = false;
    private static final boolean BLACK = true;

    private boolean color;
    private PV1 parent;
    private PV1 left;
    private PV1 right;

    public PV1() {
        super();
        this.color = BLACK;
        this.parent = null;
        this.left = null;
        this.right = null;
    }

    @Override
    public void insert(int element) {
        PV1 newNode = new PV1();
        newNode.data = element;
        newNode.color = RED;

        auxInsert(this, newNode);

        fixInsertion(newNode);
    }

    private void auxInsert(PV1 tree, PV1 newNode) {
        if (tree.data == null) {
            tree.data = newNode.data;
            tree.left = new PV1();
            tree.right = new PV1();
            newNode.parent = tree;
        } else if (newNode.data > tree.data) {
            auxInsert(tree.right, newNode);
        } else {
            auxInsert(tree.left, newNode);
        }
    }

    private void fixInsertion(PV1 node) {
        while (node != null && node.parent != null && node.parent.color == RED) {
            if (node.parent == node.parent.parent.left) {
                PV1 uncle = node.parent.parent.right;

                if (uncle != null && uncle.color == RED) {
                    node.parent.color = BLACK;
                    uncle.color = BLACK;
                    node.parent.parent.color = RED;
                    node = node.parent.parent;
                } else {
                    if (node == node.parent.right) {
                        node = node.parent;
                        rotateLeft(node);
                    }

                    node.parent.color = BLACK;
                    node.parent.parent.color = RED;
                    rotateRight(node.parent.parent);
                }
            } else {
                PV1 uncle = node.parent.parent.left;

                if (uncle != null && uncle.color == RED) {
                    node.parent.color = BLACK;
                    uncle.color = BLACK;
                    node.parent.parent.color = RED;
                    node = node.parent.parent;
                } else {
                    if (node == node.parent.left) {
                        node = node.parent;
                        rotateRight(node);
                    }

                    node.parent.color = BLACK;
                    node.parent.parent.color = RED;
                    rotateLeft(node.parent.parent);
                }
            }
        }
        this.color = BLACK;
    }

    private void rotateLeft(PV1 node) {
        PV1 rightChild = node.right;
        node.right = rightChild.left;

        if (rightChild.left != null) {
            rightChild.left.parent = node;
        }

        rightChild.parent = node.parent;

        if (node.parent == null) {
            this.left = rightChild;
        } else if (node == node.parent.left) {
            node.parent.left = rightChild;
        } else {
            node.parent.right = rightChild;
        }

        rightChild.left = node;
        node.parent = rightChild;
    }

    private void rotateRight(PV1 node) {
        PV1 leftChild = node.left;
        node.left = leftChild.right;

        if (leftChild.right != null) {
            leftChild.right.parent = node;
        }

        leftChild.parent = node.parent;

        if (node.parent == null) {
            this.left = leftChild;
        } else if (node == node.parent.right) {
            node.parent.right = leftChild;
        } else {
            node.parent.left = leftChild;
        }

        leftChild.right = node;
        node.parent = leftChild;
    }
}

