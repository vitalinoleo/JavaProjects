//abstract class
package com.example;

public abstract class Produto {
    //atributos
    private String nome;
    private double preco;
  
    //construtor vazio
    public Produto() {
    }
    
    //construtor cheio
    public Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    //get


    //set 

    //calcular peso 
    public abstract double calcularPeso(); // metodo abstrato calcular peso declarada
}
