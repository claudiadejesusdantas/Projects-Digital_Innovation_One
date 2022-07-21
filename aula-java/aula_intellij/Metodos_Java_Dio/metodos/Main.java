public class Main {
    //aqui que o exercício será executado
    //A classe Main é onde chamamos nossos exercícios.

    public static void main(String[] args) {
        //Calculadora
        System.out.println("Exercício 1");
        Exercicio1.soma(3, 6);

        System.out.println("Exercício Calculadora");
        Exercicio1.subtracao(9,1.8);

        System.out.println("Exercício Calculadora");
        Exercicio1.multiplicacao(7,8);

        System.out.println("Exercício Calculadora");
        Exercicio1.divisao(5,2.5);


        // Mensagem
        System.out.println("Exercício 2");
        Exercicio2.obterMensagem(9);
        Exercicio2.obterMensagem(14);
        Exercicio2.obterMensagem(1);

        //Empréstimo
        System.out.println("Exercício 3");
        Exercicio3.calcular(1000,Exercicio3.getDuasParcelas());
        Exercicio3.calcular(1000,Exercicio3.getTresParcelas());
        Exercicio3.calcular(1000,5);
        Exercicio3.calcular(1000,2);
        Exercicio3.calcular(1000,3);


    }


}
