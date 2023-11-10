package atividade04;

import java.util.LinkedList;

import atividade04.interfaces.TabelaHash_IF;

public class TabelaHash implements TabelaHash_IF {
    private LinkedList<Integer>[] table;
    private int size;

    public TabelaHash(int capacity){
        //te vira campeão, criei essa mímica (mock) de tabelaHash pra fazer os testes :)
        this.table = new LinkedList[capacity];
        this.size = 0;
    }

    @Override
    public void insert(int element) {
        int key = hash_function(element);

        if (table[key] == null){
            table[key] = new LinkedList<>();
        }

        table[key].add(element);
        size++;
    }


    @Override
    public void remove(int element) throws Exception {
        // Te vira pra implementar champ
        int key = hash_function(element);

        if(table[key] != null){
            if(table[key].remove(Integer.valueOf(element))){
                size--;
            }
            else{
                throw new Exception("Element not found");
            }
        }
        else{
            throw new Exception("Element not found");
        }
    }

    @Override
    public Integer search(int element) throws Exception {
        // Te vira pra implementar champ
        int key = hash_function(element);

        if(table[key] != null){
            if(table[key].contains(element)){
                return element;
            }
            else{
                throw new Exception("Element not found");
            }
        }
        else{
            throw new Exception("Element not found");
        }
        
    }

    @Override
    public String print() {
        // Te vira pra implementar champ
        StringBuilder result = new StringBuilder();
        for(int i = 0; i < table.length; i++){
            result.append(i).append(": ");
        
            if(table[i] != null){
                for(int j = 0; j < table[i].size(); j++){
                    result.append(table[i].get(j));
                    if (j < table[i].size() - 1) {
                        result.append(", ");
                    }
                }
            }
            result.append("\n");
        }
        
        return result.toString();
    }

    private int hash_function(int element){
        return Math.abs(element % table.length);
    }

    
}
