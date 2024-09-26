package com.example;

public class Livro extends Produto implements Transportavel {

    @Override
    public double calcularPeso() {
        return 0.5; //peso do livro sempre vai ser 500 gramas
    }

    @Override
    public double calcularFrete() {
        return 2; //frete do livro é dois reais, preco fixo !!!!
    }
    
}
