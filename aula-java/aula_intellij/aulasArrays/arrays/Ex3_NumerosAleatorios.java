/*Faça um programa que leia 20 números inteiros aleatórios
(entre 0 e 100) armazene-os num vetor.
Ao final mosre os números e seus sucessores. */

import java.util.Random;

public class Ex3_NumerosAleatorios {
    public static void main(String[] args) {
        //Random -> serve para gerar números aleatórios
        Random random = new Random();

        int numerosAleatorios[] = new int[20];

        for(int i = 0; i< numerosAleatorios.length;i++) {
            int numero = random.nextInt(100);
            numerosAleatorios[i] = numero;

        }

        System.out.println("Antecessor dos Números aleatórios: ");
        for (int numero: numerosAleatorios) {
            System.out.print(numero-1 + " ");
        }

        System.out.println("\nNúmeros aleatórios: ");
        for (int numero: numerosAleatorios) {
            System.out.print(numero + " ");
        }

        System.out.println("\nSucessores dos Números aleatórios: ");
        for (int numero: numerosAleatorios) {
            System.out.print(numero+1 + " ");
        }

    }

}
