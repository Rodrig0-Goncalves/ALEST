
public class DoubleLinkedListOfInteger {
    // Referencia para o sentinela de inicio da lista encadeada.
    private Node header;
    // Referencia para o sentinela de fim da lista encadeada.
    private Node trailer;
    // Referencia para a posicao corrente.
    private Node current;    
    // Contador do numero de elementos da lista.
    private int count;

     private class Node {
        public Integer element;
        public Node next;
        public Node prev;
        public Node(Integer e) {
            element = e;
            next = null;
            prev = null;
        }
    }

    public DoubleLinkedListOfInteger() {
        header = new Node(null);
        trailer = new Node(null);
        header.next = trailer;
        trailer.prev = header;
        count = 0;
    }

     /**
     * Esvazia a lista
     */
    public void clear() {
        header = new Node(null);
        trailer = new Node(null);
        header.next = trailer;
        trailer.prev = header;
        count = 0;
    } 

    /**
     * Retorna true se a lista não contem elementos
     * @return true se a lista não contem elementos
     */
    public boolean isEmpty() {
        return (count == 0);
    }

    
  
        
    /**
     * Retorna o numero de elementos da lista
     * @return o numero de elementos da lista
     */
    public int size() {
        return count;
    }

    /**
     * Adiciona um elemento ao final da lista
     * @param element elemento a ser adicionado ao final da lista
     */
    public void add(Integer element) {
        // Primeiro cria o nodo - Atualiza ponteiros de um pra depois atualizar do segundo, não perdendo a corrente 
        Node n = new Node(element);

        // Conecta o nodo criado na lista
        n.prev = trailer.prev; // conecta node ao anterior da cauda (header) == n.prev = header.next
        n.next = trailer; // próximo do novo nede ganha cauda

        // Atualiza os encadeamentos
        trailer.prev.next = n; //conecta no póximo do anterior da cuada (header) == header.next = n
        trailer.prev = n; //anterior da cauda ganha n 

        // Atualiza count
        count++;      
    }

    //Verifica se elemento esta presente ou não na lista 
    public boolean existe(Integer element){
        Node inicio = header.next;
        Node aux = new Node(element);

        while(inicio.element != null){
            if(inicio.element == aux.element){
                return true;
             }
            inicio = inicio.next;
        }
        return false;
    }

    public void pontas(Integer element){
        Node cabeca = header.next;
        Node cauda = trailer;
        int conta = 0;
        
        if(existe(element) == true){
            while(conta != size()){

                if(cabeca.element == element){
                    System.out.println("Elemento encontrado após "+element+" é igual a "+cabeca.next.element+"!");
                }
                cabeca = cabeca.next;
            }
                if(cauda.element == element){
                System.out.println("Elemento encontrado anterior a "+element+" é igual a "+cauda.prev.element+"!");
                 }
                cauda = cauda.prev;
            conta++;
         }
        } 


    }


    //Retorna um arranjo com os elementso da lista entre fromIndex (incluso) e toIndex (excluso)
    public Node[] subList(int fromIndex, int toIndex){ 

        Node array[] = new Node[10];
        
        Node inicio = header;
        Node meio = header.next;
        Node fim = inicio;


        for(int i = 0; i<size(); i++){
            inicio = inicio.next; // Começa um elemento depois do header e vai até o 'fromIndex'
            if(inicio.element == fromIndex){
                fim = inicio.next; // começa na mesma posição de 'início' e vai até o 'toIndex'
                if(fim.element == toIndex)
                     meio = inicio; //cemeça pelo elemento de 'início' da lista e vai até 'toIndex'
                    for(int j = fromIndex; j<toIndex; j++){
                        array[j] = meio;
                        meio = meio.next;
                    }
            }
        }
        return array;
    }

    //Inverte o conteúdo da lista
    public void reverse(){

    }

    //Contém o número de ocorrências do elemento passado no parâmetro 
    public int contaOcorrencia(Integer element){
        int cont = 0;

        return cont;
    }


    @Override
    public String toString()
    {
        StringBuilder s = new StringBuilder();
        Node aux = header.next;
        for (int i = 0; i < count; i++) {
            s.append(aux.element.toString());
            s.append("\n");
            aux = aux.next;
        }
        return s.toString();
    } 
        
}
