package atividade04;

import atividade04.interfaces.BST_IF;

public class BST implements BST_IF {
    protected Integer data;
    protected BST left;
    protected BST right;

    public BST(){
        this.data = null;
        this.left = null;
        this.right = null;
    }

    @Override
    public void insert(int element) {
        auxInsert(this, element);
    }
    private void auxInsert(BST tree, int element){
        if(tree.data == null) {
            tree.data = element;
            tree.left = new BST();
            tree.right = new BST();
        }
        else if(element > tree.data) auxInsert(tree.right, element);
        else auxInsert(tree.left, element);
    }

    @Override
    public Integer search(int element) throws Exception {
        return auxSearch(this, element);
    }
    private int auxSearch(BST tree, int element) throws Exception {
        if(tree.data == null) throw new Exception("Element not found");
        else if(element == tree.data) return element;
        else if(element > tree.data) return auxSearch(tree.right, element);
        else return auxSearch(tree.left, element);
    }

    @Override
    public int[] preOrder() {
        int[] result = new int[this.size()];
        auxPreOrder(this, result, 0);
        return result;
    }
    private void auxPreOrder(BST tree, int[] result, int i){
        if(tree.data == null) return;
        result[i++] = tree.data;
        auxPreOrder(tree.left, result, i);
        auxPreOrder(tree.right, result, i + size(tree.left)); //soma-se mais a sizeLeft pois ela ja foi percorrida
    }

    @Override
    public int[] order() {
        int[] result = new int[this.size()];
        auxOrder(this, result, 0);
        return result;
    }
    private void auxOrder(BST tree, int[] result, int i){
        if(tree.data == null) return;
        auxOrder(tree.left, result, i);
        result[i + size(tree.left)] = tree.data;
        auxOrder(tree.right, result, i + size(tree.left) + 1);
    }
    
    @Override
    public int[] postOrder() {
        int[] result = new int[this.size()];
        auxPostOrder(this, result, 0);
        return result;
    }
    private void auxPostOrder(BST tree, int[] result, int i){
        if(tree.data == null) return;
        auxPostOrder(tree.left, result, i);
        auxPostOrder(tree.right, result, i + size(tree.left));
        result[i + size(tree.left) + size(tree.right)] = tree.data;
    }

    /* @Override
    public boolean isComplete() {
        if(this.size() == 1) return true;
        else if(size(this.left) == size(this.right)) return true;
        return false;
    } */

    @Override
    public boolean isComplete() {
        int size = this.size();
        if(size == 0) return false;
        else if(size == 1) return true;
        else if(this.left.size() != this.right.size()) return false;
        return auxIsComplete(this);
    }
    private boolean auxIsComplete(BST tree){
        if(tree.left.data != null && tree.right.data != null){
            return auxIsComplete(tree.left) && auxIsComplete(tree.right);
        }
        else if(tree.left.data == null && tree.right.data == null) return true;
        return false;
    }

    protected int size(){
        return size(this);
    }

    protected int size(BST tree){
        if(tree.data == null) return 0;
        return 1 + size(tree.left) + size(tree.right);
    }
}
