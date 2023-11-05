package atividade04;

import atividade04.interfaces.BST_IF;

public class BST implements BST_IF {
    private int data;
    private BST left;
    private BST right;
    
    public int getData() {
        return data;
    }

    @Override
    public void insert(int element) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'insert'");
    }
    @Override
    public int search(int element) throws Exception {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'search'");
    }
    @Override
    public int[] preOrder() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'preOrder'");
    }
    @Override
    public int[] order() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'order'");
    }
    @Override
    public int[] postOrder() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'postOrder'");
    }
    @Override
    public boolean isComplete() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'isComplete'");
    }

    
}
