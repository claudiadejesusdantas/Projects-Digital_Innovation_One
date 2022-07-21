/*Crie um vetor de 6 números inteiros e mostre-os na ordem inversa.*/

//array é um vetor, pode ser chamado de uma matriz.
// array unidimensional -> com uma linha e várias colunas
//array multidimensionais -> pode ter várias linhas e várias colunas.
public class Ex1_OrdemInversa {
    public static void main(String[] args) {

        int[] vetor = {-5, -6, 15, 50, 8, 4};

        System.out.println("Vetor: ");
        int count = 0;
        while (count < (vetor.length)) {
            System.out.println(vetor[count]+ " ");
            count++;
        }
    }