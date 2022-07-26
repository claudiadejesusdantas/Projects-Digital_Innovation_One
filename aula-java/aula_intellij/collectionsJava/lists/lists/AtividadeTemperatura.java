/*Faça um programa que receba a temperatura média dos 6
primeiros meses do ano e armazene-as em uma lista.
Após isto, calcule a média semestral das temperaturas e
mostre todas as temperaturas acima desta média, e em que
mês elas ocorreram (mostrar o mês por extenso: 1 – Janeiro, 2
– Fevereiro e etc).*/


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AtividadeTemperatura {
    public static void main(String[] args) {

        List<Double> temperaturas = new ArrayList<Double>();

        Scanner scan = new Scanner(System.in);
        int contador = 0;
        while (true){
            if (contador == 6) break;

            System.out.println("Insira a temperatura: ");
            Double temperatura = scan.nextDouble();
            temperaturas.add(temperatura);
            contador++;
        }


        List<String> meses = new ArrayList<String>();
        meses.add("Janeiro");
        meses.add("Fevereiro");
        meses.add("Março");
        meses.add("Abril");
        meses.add("Maio");
        meses.add("Junho");



        Double soma = 0d;
        for (Double temperatura:temperaturas) {
            soma += temperatura;
        }
        Double media = soma/temperaturas.size();
        System.out.println("A média é: "+ media);

        int mesAtual = 0;


        for (Double temperatura:temperaturas){
            if(temperatura>=media){
                System.out.println(temperatura);
                System.out.println(meses.get(mesAtual));
            }
            mesAtual++;
        }
    }
}
