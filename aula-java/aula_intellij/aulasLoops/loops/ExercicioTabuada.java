/*Desenvolva um gerador de tabuada, capaz de gerar a tabuada de
 * qualquer número inteiro entre 1 a 10. O usuário deve informar de qual número
 * ele deseja ver a tabuada. A saída deve ser conforme o exemplo abaixo:
 * Tabuada de 5:
 * 5 x 1 = 5
 * 5 x 2 = 10
 * ...
 * 5 x 10 = 50*/

import java.util.Scanner;

public class ExercicioTabuada {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int numero;
        int count = 0;

        System.out.println("Insira o número: ");
        numero = scan.nextInt();
        System.out.println("Tabuada de "+numero+ ": ");

        do {
            count++;
            System.out.println(numero+" x "+count+" = "+(numero*count));

        }while (count < 10);
    }
}
