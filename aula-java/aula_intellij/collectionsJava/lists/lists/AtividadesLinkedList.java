import java.util.LinkedList;

public class AtividadesLinkedList {
    public static void main(String[] args) {
        System.out.println("Cria uma lista chamada notas2 e " +
                "coloque todos os elementos da list ArrayList nessa nova lista.");
//[7,8.5,9.3,5,7,0,3.6]
        LinkedList<Double> notas2 = new LinkedList<Double>();

        notas2.addFirst(7.0);
        notas2.addFirst(5.0);
        notas2.addFirst(9.3);
        notas2.addFirst(8.5);
        notas2.addFirst(7d);

        notas2.addLast(0.0);
        notas2.add(3.6);

        System.out.println(notas2);

//        notas2.clear(); //limpar a lista inteira
//        System.out.println(notas2);

//        notas2.remove(3); //remove o elemento pelo índice
//        System.out.println(notas2);
////
//        notas2.remove(0.0);//remove o elemento pelo valor
//        System.out.println(notas2);


        System.out.println("Mostre a primeira nota da nova lista sem removê-lo: ");
        System.out.println(notas2.getFirst());

        System.out.println("Mostre a primeira nota da nova lista removendo-o: ");
        notas2.set(0,10d);
        System.out.println(notas2);
        System.out.println(notas2.getFirst());


    }
}
