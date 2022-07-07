package operadoresLogicos;

public class MinhaResposta {
    public static void main(String[] args) {
        boolean b1=true;
        boolean b2=false;
        boolean b3=true;
        boolean b4=false;

        boolean exemploUm = b1 && b2;
        boolean exemploDois = b1 && b3;
        boolean exemploTres = b2 || b3;
        boolean exemploQuatro = b2 || b4;
        boolean exemploCinco = b1 ^ b3;
        boolean exemploSeis = b4 ^ b1;
        boolean exemploSete = !b1;
        boolean exemploOito = !b2;

        System.out.println(exemploUm);
        System.out.println(exemploDois);
        System.out.println(exemploTres);
        System.out.println(exemploQuatro);
        System.out.println(exemploCinco);
        System.out.println(exemploSeis);
        System.out.println(exemploSete);
        System.out.println(exemploOito);

    }
}
