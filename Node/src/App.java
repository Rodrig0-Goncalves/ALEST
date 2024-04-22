public class App {
    public static void main(String[] args) {
        LinkedListOfInteger lista = new LinkedListOfInteger();

      //  System.out.println("Tamanho da lista: " + lista.size());
   //     System.out.println("Lista Vaiza? " + lista.isEmpty());

        System.out.println("Adicionando elementos no final da lista...");

        lista.add(2);
        lista.add(4);
        lista.add(6);
        lista.add(8);
        lista.add(10);
        lista.add(12);
        System.out.println(lista);
        System.out.println("--> Elementos adicionados com sucesso!");
        lista.addIndex(lista.size(), 5);

      System.out.println("Tamanho da lista: " + lista.size());
       System.out.println("Lista Vaiza? " + lista.isEmpty());


        //System.out.println("Lista Vaiza? " + lista.isEmpty());

     System.out.println("Elemento armazenado na " + "segunda posicao da lista: " +lista.get(1));

//        System.out.println("Elemento armazenado na "
//                + "ultima posicao da lista: " +lista.get(lista.size()-1));

      System.out.println("Removendo indice "+lista.remove(8));

      System.out.println("Imprimindo a lista "+lista.imprime());
    }
}
