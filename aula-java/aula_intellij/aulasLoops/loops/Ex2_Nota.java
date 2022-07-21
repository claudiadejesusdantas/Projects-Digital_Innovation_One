
/*Faça um programa que peça uma nota, entre zero e dez.
* Mostre uma mensagem caso o valor seja inválido e continue pedindo
* até que o usuário informe um valor válido.*/
import java.util.Scanner;


public class Ex2_Nota {
    public static void main(String[] args) {
        int nota;
        Scanner scan = new Scanner(System.in);
        System.out.println("Escreva a nota: ");
        nota = scan.nextInt();

        while (nota < 0 || nota > 10) {
            System.out.println("Nota inválida! Digite a nota novamente.");
            nota = scan.nextInt();

        }

    }
}
