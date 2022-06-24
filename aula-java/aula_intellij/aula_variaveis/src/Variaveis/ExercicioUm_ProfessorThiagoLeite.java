package Variaveis;

public class ExercicioUm_ProfessorThiagoLeite {
    public static void main(String[] args) {
        int i;
        //int i;
        int I;
        //int 1a;
        // não é uma boa prática ->
        int _1a;
        // não é uma boa prática ->
        int $1a;

        //variáveis dentro de método, devem ser inicializada,
        //deve ser provido seu valor inicial
        i = 5;
        I = 10;
        _1a = 20;
        $1a = 7;

        final int j = 10;
        //final = constante
        //não pode mudar mais, pois é uma constante
        // j = 15;
        //essa variável é permitida com letras e números ->
        int asrn24688nd;
        //essa variável não é permitida, pois contém espaço ->
        //int asrn24 688nd;
         //não é uma boa prática o underline, apenas nas constantes.
        int asrn24688_nd = 1;
        //essa variável não é permitida, pois contém caracter especial ->
        //int asrn24688%nd = 10;

        asrn24688nd = 100;
        asrn24688_nd = 10;

        //variável com Cammel Case, aceitável ->
        int quantidadeProduto = 50;
        //não segue a boa prática ->
        //int QuantidadeProduto = 50;
        //variável constante com underline aceitável ->
        final int NUMERO_TENTATIVAS = 5;
        //variável constante com underline não aceitável ->
        //final int numero_TENTATIVAS = 5;
        //essa variável não é permitida, pois seu nome está definido como final ->
        //int QUANTIDADE_OPCOES = 25;
        // segue as boas práticas, porém a variável não tem especificidade ->
        //int tpdProd;

        System.out.println(i);
        System.out.println(I);
        System.out.println(_1a);
        System.out.println($1a);

        System.out.println(j);
        System.out.println(asrn24688nd);
        System.out.println(asrn24688_nd);

        System.out.println(quantidadeProduto);
        System.out.println(NUMERO_TENTATIVAS);

    }
}
