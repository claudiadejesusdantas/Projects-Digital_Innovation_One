package Exercicios_Variaveis;
/*Exercício: Criar um simples projeto no IntelliJ e criar variáveis de
* vários tipos diferentes para assim realizar o casting(conversões).*/

public class ExercicioQuatro_ProfessorThiagoLeite {
    public static void main(String[] args) {
        //downcast: deve sempre colocar o tipo que será convertido.
        byte b1;
        short s1 = 1000;
        b1 = (byte) s1;


        //upcast: como sobrará espaço na memória, não precisa colocar o tipo que será convertido.
        long l1;
        int i1 = 10;
        l1 = i1;

        //downcast: houve perda de informação.
        int i2;
        long l2 = 1000000000000000000L;
        i2 = (int) l2;

        //downcast: esse não teve perda de informação, pois cabe no outro tipo.
        int i3;
        long l3 = 1000L;
        i3 = (int) l3;

        //upcast: é sempre implícito.
        double d1;
        float f1 = 10.5f;
        d1 = f1;

        //downcast: deve sempre colocar o tipo que será convertido.
        float f2;
        float f3;
        double d2 = 10000.58d;
        f2 = (float) d2;
        double d3 = 10000.5888888888888888888888888888888888888888888888888888888888888d;
        f3 = (float) d3;

        //downcast: deve sempre colocar o tipo que será convertido.
        int i4;
        float f4 = 11.5697f;
        i4 = (int) f4;

        System.out.println("b1: "+ b1);
        System.out.println("l1: "+l1);
        System.out.println("i2: "+i2);
        System.out.println("i3: "+i3);
        System.out.println("d1: "+d1);
        System.out.println("f2: "+f2);
        System.out.println("f3: "+f3);
        System.out.println("i4: "+i4);

        //downcast: qualquer tipo de dado pode ser convertido, mas pode ocorrer perda de informação.
        b1 = (byte) d3;
        System.out.println("b1:"+ b1);

    }
}
