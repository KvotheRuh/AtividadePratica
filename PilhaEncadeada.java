
// Aluno:Carlos Eduardo Nogueira Morciani
// Curso:Ciência da Computação
// 1.Implemente a estrutura de pilha utilizando ESTRUTURA de Lista encadeada com os métodos insere,
// remove e imprime para listar todos os elementos da pilha.

package listaencadeada;

public class PilhaEncadeada {
    class No {
        int dado; // Valor armazenado no nó
        No proximo; // Referência para o próximo nó

        // Construtor do nó
        No(int elemento) {
            this.dado = elemento;
            this.proximo = null;
        }
    }

    No topo = null; // Referência para o topo da pilha

    public boolean pilhaVazia(){

        return (topo == null);
    }

    // Método para inserir um elemento no topo da pilha
    public void insereElemento(int elemento) {
        No novoNo = new No(elemento); // Cria um novo nó com o elemento fornecido

        if (topo == null) {
            topo = novoNo;
        } else {
            novoNo.proximo = topo;
            topo = novoNo;
        }
    }

    // Método para remover um elemento no topo da pilha
    public int removeElemento(){
        if (pilhaVazia()){
            System.out.println("Erro: Pilha Vazia!!");
            return -1;
        }
        int elemento = topo.dado;
        topo = topo.proximo;
        System.out.println("Removido: " + elemento);
        return elemento;
    }


    // Método para exibir os elementos da pilha
    public void exibePilha() {
        No atual = topo;
        System.out.print("Pilha: ");
        while (atual != null) {
            System.out.print(atual.dado + " ");
            atual = atual.proximo; // Move para o próximo nó
        }
        System.out.println();
    }



    public static void main(String[] args) {
        PilhaEncadeada pilha = new PilhaEncadeada();

        // Inserindo elementos na pilha
        pilha.insereElemento(10);
        pilha.insereElemento(20);
        pilha.insereElemento(30);
        pilha.insereElemento(40);

        pilha.exibePilha(); // Exibe elementos da pilha

        pilha.removeElemento();
        pilha.removeElemento();

        pilha.exibePilha(); // Exibe elementos da pilha após remoção
    }
}




