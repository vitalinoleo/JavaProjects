package com.example;

public class Eletronico extends Produto implements Transportavel{
// erro em Eletronico: precido implemenatr o metodo abstrato que declaramos na classe chamada Produto
//apos colocar o implements deu erro no Eletronico novamente: preciso implementar o metodo da interface

//atributo 
    private double volume;
    
    public Eletronico( String nome, double preco, double volume) {
        super(nome, preco);
        this.volume = volume;
        
    }

    //calcular peso
    @Override
    public double calcularPeso(){ //metodo declarado em Produto
        double peso = volume * 150;
        return peso;
    }

    //calcular frete
    @Override
    public double calcularFrete(){  //metodo declarado em Transportavel
        double valorFrete = calcularPeso() * 1;
        return valorFrete;
    }
}
