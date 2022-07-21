/*Faça um programa que leia conjuntos de dois valores,
* o primeiro representando o nome do aluno e o segundo
* representando a sua idade.
* (Pare o programa inserindo o valor 0 no campo nome)*/

import java.util.Scanner;

public class Ex1_NomeEIdade {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String nome;
        int idade;

 //Dica: quando tiver uma situação que precise utilizar laço infinito,
 // precise de um break no meio, utilize o while true.
        while (true){
            System.out.println("Nome: ");
            nome = scan.next();
            if (nome.equals("0")) break;

            System.out.println("Idade: ");
            idade = scan.nextInt();
        }

        System.out.println("Continua aqui...");

    }

}
