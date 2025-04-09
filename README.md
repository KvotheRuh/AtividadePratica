**MANUAL - PILHA ENCADEADA**

A implementação está estruturada da seguinte maneira:

O programa está estruturado na classe principal PilhaEncadeada.

Em seguida é criada a classe No, nessa classe é armazenado o valor do no e é feita a referencia para o proximo nó.

Em seguida é referenciado o topo da pilha com o valor null.

O metodo insereElemento recebe como valor um elemento de valor inteiro.

Dentro desse metodo é criado o novoNo com o elemento fornecido.

Em seguida é verifacado se o topo possui o valor null, em caso de ser verdadeira essa condição o topo recebe como valor o novo nó.

Caso o topo não seja null, o novo nó se torna o topo da pilha e o ponteiro do topo e apontado para o novo nó.

Seguindo o código, temos o metodo removeElemento, nesse metodo incialmente é verificado se a pilha não esta vazia, caso a ela esteja vazia é retornado o valor -1 que significa falaha e o programa é encerrado. Caso a pilha não esteja vazia é feito a remoção do elemento do topo e o ponteiro é ajustado para o novo valor que esta no topo.

No main, é feito a criação do objeto pilha.

Podemos adionar valores na pilha utilizando pilha.insereElemento(elemento), para excluir elementos da pilha utilizamos pilha.removeElemento(). Por fim, podemos verificar a condição da fila utilizando o metodo exibirFila, pilha.exibirFila().

Exemplos:

PilhaEncadeada pilha = new PilhaEncadeada();

        // Inserindo elementos na pilha
        pilha.insereElemento(10);
        pilha.insereElemento(20);
        pilha.insereElemento(30);
        pilha.insereElemento(40);

        pilha.exibePilha(); // Exibe elementos da pilha (40,30,20,10)

        pilha.removeElemento(); 
        pilha.removeElemento();

        pilha.exibePilha(); // Exibe elementos da pilha após remoção(20,10)

        ![image](https://github.com/user-attachments/assets/9710617a-8c62-43b3-9456-3dfaffffb476)




**MANUAL - FILA ENCADEADA**

A implementação está estruturada da seguinte maneira:

O programa está estruturado na classe principal FilaEncadeada.

Em seguida é criada a classe No, nessa classe é armazenado o valor do no e é feita a referencia para o proximo nó.

Em seguida, é atribuido inicialmente ao "No inicio" e ao "No fim" o valor "null".

O metodo insereElemento, recebe como instancia o elemento que sera inserido na fila.

Caso a fila esteja vazia, é criado um novo nó, como esse novo nó será o unico elemento da fila o ponteiro do inicio e do fim irão apontar para ele.

Quando a fila não esta vazia, o ponteiro do fim irá apontar para o proximo novo nó que foi inserido na fila, indicando que o novo nó é o ultimo elemento da fila.

No método removeElemento, é verificado incialmente se a fila está vazia chamando o método filaVazia, caso a fila esteja vazia é retornado o valor -1 que indica falha e o progrma é encerrado. Caso a fila não esteja vazia, é feito a exclusão do elemento e o ponteiro é ajustado.

No main, é feito a criação do objeto fila.

Ulitilizando os métodos descritos acima podemos inserir um elemento na fila utilizando fila.insereElemento(elemento), em seguida podemos remover um elemento da fila utilizando o fila.removeElemento(), por fim para verificarmos se foi efetuado a inserção e remoção dos elementos podemos utilizar fila.exibirFila().

Exemplos: 

FilaEncadeada fila = new FilaEncadeada();

      // Inserindo elementos na lista
      fila.insereElemento(10);
      fila.insereElemento(20);
      fila.insereElemento(30);
      fila.insereElemento(40);

      fila.exibeFila(); //Exibe Elementos da Lista (10,20,30,40)

      //Remove Elemento
      fila.removeElemento();
      fila.removeElemento();

      // Exibindo os elementos da lista (30,40)
      fila.exibeFila();

      ![image](https://github.com/user-attachments/assets/5803e33a-33af-4ad6-afc2-12115c0f2570)









