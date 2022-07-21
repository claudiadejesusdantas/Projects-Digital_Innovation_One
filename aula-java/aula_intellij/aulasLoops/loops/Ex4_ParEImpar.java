/*Faça um programa que peça N números inteiros,
* calcule e mostre a quantidade de números pares e a
* quantidade de números ímpares.*/
import java.util.Scanner;

public class Ex4_ParEImpar {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int quantNumeros;
        int numero;
        int quantPares = 0, quantImpares = 0;

        System.out.println("Quantidade de números: ");
        quantNumeros = scan.nextInt();

        //count == contador
        int count = 0;

//Dica: quando tiver uma situação que precise executar o programa pelo menos uma vez,
//antes de conferir a sentença (while) se é true ou false
        do {
            System.out.println("Número: ");
            numero = scan.nextInt();

            if (numero % 2 == 0) quantPares++;
            else quantImpares++;

            //count = count + 1;
            count++;

        } while (count < quantNumeros);

        System.out.println("Quantidade Par: " + quantPares);
        System.out.println("Quantidade Ímpar: " + quantImpares);
    }

}
