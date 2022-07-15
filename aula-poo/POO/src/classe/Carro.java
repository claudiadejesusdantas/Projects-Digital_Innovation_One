package POO.classe;
//Exercício Classe: Crie uma classe chamada "Carro".
public class Carro {
    String cor;
    String modelo;
    int capacidadeTanque;

    //sobrecarga
    //this -  é o atributo que vai pertencer ao objeto.
    Carro(){

    }

    Carro(String cor, String modelo, int capacidadeTanque){
        this.cor = cor;
        this.modelo = modelo;
        this.capacidadeTanque = capacidadeTanque;
    }


    //Construtor aqui
    //set serve para colocar um valor no atributo.
    //é void pois a ideia não é retornar nada, só guardar o valor.
    void setCor(String cor){
        this.cor = cor;
    }
    // get, pegue - é para retornar algo.
    //o return deve ser compatível com a linha de dado que o método retorna.
    String getCor(){
    return cor;
    }

    //set serve para colocar um valor no atributo.
    //é void pois a ideia não é retornar nada, só guardar o valor.
    void setModelo(String modelo) {
        this.modelo = modelo;
    }

    // get, pegue - é para retornar algo.
    //o return deve ser compatível com a linha de dado que o método retorna.
    String getModelo(){
        return modelo;
    }
    //tomar cuidado para o get e o set não ferir o encapsulamento dos dados.

    void setCapacidadeTanque(int capacidadeTanque){
        this.capacidadeTanque = capacidadeTanque;
    }

    int getCapacidadeTanque() {
        return capacidadeTanque;
    }

     //método do total para encher o tanque

    double totalValorTanque(double valorCombustivel){
        return capacidadeTanque * valorCombustivel;
    }
}
