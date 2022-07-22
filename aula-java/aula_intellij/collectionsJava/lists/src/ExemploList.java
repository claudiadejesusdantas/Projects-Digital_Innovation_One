import java.util.*;

public class ExemploList {
    public static void main(String[] args) {

        System.out.println("Crie uma lista e adicione as sete notas: ");
        List<Double> notas = new ArrayList<Double>();
        notas.add(7.0);
        notas.add(8.5);
        notas.add(9.3);
        notas.add(5.0);
        notas.add(7.0);
        notas.add(0.0);
        notas.add(3.6);

//        System.out.println(notas);
        System.out.println(notas.toString());

        System.out.println("Exiba a posição da nota 5.0: "+ notas.indexOf(5d));

        System.out.println("Adicione na lista a nota 8.0 na posição 4: ");
        notas.add(4,8d);
        System.out.println(notas);

        System.out.println("Substitua a nota 5.0 pela nota 6.0: ");
        notas.set(notas.indexOf(5d),6.0 );
        System.out.println(notas);

        System.out.println("Confira se a nota 5.0 está na lista: " + notas.contains(5d));

        System.out.println("Exiba todas as notas na ordem em que foram informados: ");
        for (double nota: notas) System.out.print(nota);


        System.out.print("\nExiba a terceira nota adicionada: " + notas.get(2));
        System.out.print("\n"+notas.toString());

        System.out.println("\nExiba a menor nota: "+ Collections.min(notas));

        System.out.println("Exiba a maior nota: " + Collections.max(notas));

        System.out.print("Exiba a soma dos valores: ");
        Iterator<Double> iterator = notas.iterator();
        double soma = 0d;
        while (iterator.hasNext()) {
            Double next = iterator.next();
            soma += next;
        }
        System.out.print(soma);

        System.out.println("\nExiba a média das notas: "+(soma/notas.size()));

        System.out.println("Remova a nota 0: ");
        notas.remove(0d);
        System.out.print(notas);

        System.out.println("\nRemova a nota na posição 0: ");
        notas.remove(0);
        System.out.print(notas);

        System.out.println("\nRemova as notas menores que 7.0 e exiba a lista: ");
        Iterator<Double> iterator1 = notas.iterator();
        while (iterator1.hasNext()) {
            Double next = iterator1.next();
            if (next < 7) iterator1.remove();
        }
        System.out.println(notas);

        System.out.print("Apague toda a lista: ");
        notas.clear();
        System.out.print(notas);

        System.out.print("\nConfira se a lista está vazia: "+notas.isEmpty());
        //isEmpty é um boolean
        System.out.print(notas);





    }
}
