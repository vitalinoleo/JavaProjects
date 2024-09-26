package com.example;

    public class Roupa extends Produto implements Transportavel{
        //erro na classe roupa, precisava dar um implements passando com mouse em cima da classe

        //atributos 
        private double volume; 
        private double peso;

        //ctor 
        public Roupa(String nome, double preco, double produto) {
            super(nome, preco); //atributos que vieram da super classe
            this.volume = volume;  // argumento fora da super 
        }

    @Override
    public double calcularPeso() {
        peso = volume * 10;
        return peso; //se eu nao der o return o meu calcularFrete fica com erro
    }

    @Override
    public double calcularFrete() {
        double valorFrete = peso * 5;
        return valorFrete; //se eu nao der o return o meu calcularFrete fica com erro
        
    }
    }