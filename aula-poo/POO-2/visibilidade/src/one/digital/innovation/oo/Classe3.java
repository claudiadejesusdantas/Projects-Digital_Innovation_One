package one.digital.innovation.oo;

public class Classe3 {
    //não tem acesso direto a classe 1
    Classe1 classe1;

    void metodo(){
        // atributo 2 e 3
        //classe1.atributo2
        //classe1.atributo3


        //pode usar o 2 pois está no mesmo pacote, mesmo não sendo uma subclasse.
        //método 2 e 3
        //classe1.metodo2
        //classe1.metodo3



    }
}
