public class LinkedListOfInteger {

    // Classe interna Node
    private class Node {
        public Integer element;
        public Node next;

        public Node(Integer element) {
            this.element = element;
            next = null;
        }

        public Node(Integer element, Node next) {
            this.element = element;
            this.next = next;
        }
    }


    // Referência para o primeiro elemento da lista encadeada.
    private Node head;
    // Referência para o último elemento da lista encadeada.
    private Node tail;
    // Contador para a quantidade de elementos que a lista contem.
    private int count;


    /**
     * Construtor da lista.
     */
    public LinkedListOfInteger() {
        head = null;
        tail = null;
        count = 0;
    }

    /**
     * Esvazia a lista
     */
    public void clear() {
        head = null;
        tail = null;
        count = 0;
    }

    /**
     * Adiciona um elemento ao final da lista.
     *
     * @param element elemento a ser adicionado ao final da lista
     */
    public void add(Integer element) {
        Node n = new Node(element);
        if (head == null) {
            head = n;
        } else {
            tail.next = n;
        }
        tail = n;
        count++;
    }

   
    // public String toString() {
    //     StringBuilder s = new StringBuilder();

    //     Node aux = head;

    //     while (aux != null) {
    //         s.append(aux.element.toString());
    //         s.append("\n");
    //         aux = aux.next;
    //     }

    //     return s.toString();
    // }

    public String imprime(){
            StringBuilder novo = new StringBuilder(); 
            Node aux = head;
           for(int i = 0; i<size(); i++){ // percorre do ínico ao final da lista
                novo.append(aux.element.toString()); //anexa o próximo elemento em novo (contrutor de palavras) em formato de palavra, converte um Node para String
                aux = aux.next; // cominha com o node auxiliar
            }
            return novo.toString(); //retorna 'novo' em formato de palavra
    }

    ///////////////////////////////////////////////////
    //// EXERCICIOS - VEJA SLIDES E ENUNACIADO
    ///////////////////////////////////////////////////

    // 1 - implemente o método isEmpty
    /*
     * Retorna true se a lista nao contem elementos.
     *
     * @return true se a lista nao contem elementos
     */
    //assinatura do metodo
    public boolean isEmpty(){
        if(head == null){
            return true;
        } else{
            return false;
        }

    }


    // 2 - implemente o método size
    /*
     * Retorna o numero de elementos da lista.
     *
     * @return o numero de elementos da lista
     */
    ////assinatura do metodo
    public int size(){
        return count;
    }


    // 3 - implemente o método get
    /*
     * Retorna o elemento de uma determinada posicao da lista.
     * @param index a posição da lista
     * @return o elemento da posicao especificada
     * @throws IndexOutOfBoundsException se (index < 0 || index >= size())
     */

    /* Exemplo - veja o main
    Lista:
        2
        4
        8
        lista.get(1)
        Elemento na segunda posicao da lista: 4
     */

    //assinatura do metodo
    public Integer get(int index){
        Node aux = head;
            if(index < 0 || index >size()){
                return -1;
            }
        while(aux.element != index){
             aux = head.next;

          }
            return aux.element;
    
    }

    //Adiciona de acordo com o index
    public void addIndex(int index, int element){
            if(index<0 || index >size()){
              throw new IndexOutOfBoundsException();
            }
             Node n = new Node(element);
             if(head == null){
                 head = n;
             }else if(index == size()){
                tail.next = n; //Torna próximo elemento igual ao novo nodo criado
             }else{
                Node aux = new Node(index-1);
                while(aux.element != index+1){
                        aux = head.next;
                }
                aux.next = n;
                count++;

             }
    }

    //Remove element big O(n)
    public boolean remove(Integer element){
            Node percorre = head;

            if(head == null){
                return false;
            }
            while(percorre.element != element){
                percorre = percorre.next;
            }
            Node del = percorre.next, aft = del.next;
            percorre.next = aft;

            count++;
        return true;
    }
}
