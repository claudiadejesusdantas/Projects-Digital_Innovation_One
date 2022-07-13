package POO.herancaDois;

public class RodarAplicacao {
    public static void main(String[] args) {

        Funcionario funcionario = new Funcionario();
        //upcast é implícito, eu não preciso dizer para quem eu estou fazendo o upcast.
        Funcionario gerente = new Gerente();
        Funcionario vendedor = new Vendedor();
        Funcionario faxineiro = new Faxineiro();

        //downcast é explícito, tem que dizer para quem eu estou fazendo o downcast.
        //downcast deve ser evitado.

//        Gerente gerente_ = new Funcionario();
//        Vendedor vendedor_ = (Vendedor) new Funcionario();
    }
}
