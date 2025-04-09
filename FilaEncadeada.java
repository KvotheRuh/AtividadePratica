
// Aluno:Carlos Eduardo Nogueira Morciani
// Curso:Ciência da Computação
// 2.Implemente a estrutura de fila utilizando ESTRUTURA de Lista encadeada com os métodos insere,
// remove e imprime para listar todos os elementos da fila.

public class FilaEncadeada {
    class No {
        int dado; // Valor armazenado no nó
        No proximo; // Referência para o próximo nó

        // Construtor do nó
        No(int elemento) {
            this.dado = elemento;
            this.proximo = null;
        }
    }

    No inicio = null; // Referência para o primeiro nó da fila
    No fim = null; //Referencia para o ultimo elemento da fila


    public boolean filaVazia(){

        return inicio == null;
    }

    // Método para inserir um elemento na fila
    public void insereElemento(int elemento) {
        No novoNo = new No(elemento); // Cria um novo nó com o elemento fornecido

        if (inicio == null) {
            // Caso a fila esteja vazia, o início  e o fim apontam para o novo nó
            inicio = novoNo;
            fim = novoNo;
        } else {
            fim.proximo = novoNo;
            fim = novoNo;

        }
    }

    // Método para remover elementos da fila
    public int removeElemento() {
        if (filaVazia()) {
            System.out.println("Erro: Lista Vazia!!");
            return -1;
        }
        int elemento = inicio.dado;
        inicio = inicio.proximo;
        if (inicio == null) {
            fim = null;
        }
        System.out.println("Removido: " + elemento);
        return elemento;
    }

    // Método para exibir os elementos da fila
    public void exibeFila() {
        if (filaVazia()) {
            System.out.println("Fila vazia!");
            return;
        }
        No atual = inicio; // Começa do início da fila
        System.out.print("Fila: ");
        while (atual != null) {
            System.out.print(atual.dado + " ");
            atual = atual.proximo; // Avança para o próximo nó
        }
        System.out.println();
    }


    public static void main(String[] args) {
        FilaEncadeada fila = new FilaEncadeada();

        // Inserindo elementos na fila
        fila.insereElemento(10);
        fila.insereElemento(20);
        fila.insereElemento(30);
        fila.insereElemento(40);

        fila.exibeFila(); //Exibe Elementos da fila

        //Remove Elemento
        fila.removeElemento();
        fila.removeElemento();

        // Exibindo os elementos da fila
        fila.exibeFila();
    }
}

