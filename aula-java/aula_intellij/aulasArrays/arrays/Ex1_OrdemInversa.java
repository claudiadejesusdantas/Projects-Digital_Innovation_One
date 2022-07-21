/*Crie um vetor de 6 números inteiros e mostre-os na ordem inversa.*/

//array é um vetor, pode ser chamado de uma matriz.
// array unidimensional -> com uma linha e várias colunas
//array multidimensionais -> pode ter várias linhas e várias colunas.
public class Ex1_OrdemInversa {
    public static void main(String[] args) {

        int[] vetor = {-5, -6, 15, 50, 8, 4};

        System.out.print("Vetor Normal: ");
        int count = 0;
        while (count < (vetor.length)) {
            System.out.print(vetor[count]+" ");
            count++;
        }

        System.out.print("\nVetor Inverso: ");
        for(int i = (vetor.length -1);i >= 0;i--){
            System.out.print(vetor[i]+" ");
        }
    }
}