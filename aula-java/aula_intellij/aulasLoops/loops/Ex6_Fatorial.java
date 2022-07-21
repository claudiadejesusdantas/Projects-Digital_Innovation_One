/*
Faça um programa que calcule o fatorial de um número
inteiro fornecido pelo usuário.
Ex.: 5! =120 (5x4x3x2x1)
*/

import java.util.Scanner;

public class Ex6_Fatorial {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Fatorial: ");
        int fatorial = scan.nextInt();

//Dica: quando tiver uma situação que precise utilizar o contador, utilize o for
        int multiplicacao = 1;

        System.out.println(fatorial+"! = ");
        for(int i = fatorial; i >= 1; i=i-1) {
            multiplicacao = multiplicacao * i;
        }
        System.out.println(multiplicacao);
    }
}
