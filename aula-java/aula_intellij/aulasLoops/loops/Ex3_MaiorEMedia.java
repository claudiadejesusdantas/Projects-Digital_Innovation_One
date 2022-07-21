/*Faça um programa que leia cinco números
* e informe o maior número e a média desses números.*/
import  java.util.Scanner;

public class Ex3_MaiorEMedia {
    public static void main(String[] args) {

        int numero;
        Scanner scan = new Scanner(System.in);

        //count == contador
        int count = 0;
        int maior = 0;
        int soma = 0;


        do {
            System.out.println("Digite o número: ");
            numero = scan.nextInt();

            soma = soma + numero;

            if(numero > maior) maior = numero;

            count = count + 1;
        } while(count < 5);

        System.out.println("Maior é " + maior);
        System.out.println("A média é: " + (soma/5));


    }
}
