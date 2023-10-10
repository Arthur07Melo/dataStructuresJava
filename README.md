# Estrutura de Dados

## Dependências

- [Junit](https://junit.org/junit5/)
    - Caso deseje utilizar os [testes](src/atividade03/tests/)
- [Java](https://www.java.com/pt-BR/)
    - JDK
    - JVM

## Estruturas implementadas

### [Lista Encadeada](src/atividade03/ListaEncadeada.java)

Implementa interface [ListaEncadeada_IF](src/atividade03/interfaces/ListaEncadeada_IF.java). Trata-se de uma lista encadeada convencional utilizando métodos recursivos:

- `isEmpty()`:        boolean
- `size()`:           int
- `search(Integer)`:  int
- `insert(Integer)`:  void
- `remove(Integer)`:  void
- `toArray()`:        int[]


### [Pilha Com Lista](src/atividade03/PilhaComLista.java)

implementa interface [Pilha_IF](src/atividade03/interfaces/Pilha_IF.java). Trata-se de uma pilha feita utilizando a [Lista Encadeada](#lista-encadeada) como base. Tem-se os seguintes métodos:

- `push(Integer)`:  void
- `pop()`:          int
- `top()`:          int
- `isEmpty()`:      boolean
- `isFull()`:       boolean

### [Fila Com Pilhas](src/atividade03/FilaComPilhas.java)

Implementa interface [Fila_IF](src/atividade03/interfaces/Fila_IF.java). Trata-se de uma fila feita utilizando duas [Pilha Com Lista](#pilha-com-lista), onde o custo do método dequeue() é O(1). Métodos implementados:

- `enqueue(Integer)`:   void
- `dequeue()`:          int
- `head()`:             int
- `isEmpty()`:          boolean
- `isFull()`:           boolean


## Colaboradores

- [Arthur Ian](https://github.com/Arthur07Melo)
- [José Matheus](https://github.com/JoseMatheusR) 
- [Júlio César](https://github.com/juliocesar710) 
- [Sávio Sayke](https://github.com/SavioSayke)
