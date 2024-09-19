package com.example;

public class ExemploConteudoBasico {

    // operacoes e tipos de variaveis
    //fazendo minhas variaveis primitivas
    public void operacoes() {
        int a = 20, b = 30;
        double c = 7.8;
        char letra = 'D';
        boolean teste = false;

        //operadores relacionais
        teste = (a > b) && (c < 8);

        System.out.println("reasultado de a+b =" + (a + b));
        System.out.println("resultado para teste:" + teste);
    }

    // controles de fluxo
    public void ControleDeFluxo() {
        // If-Else

        // dando um valor para a int idade
        int idade = 18;
        // se a idade for maior que 18 anos significa que ele(a) é maior de idade 
        if (idade >= 18) {
            System.out.println("Maior de idade");
        } else {
            System.out.println("Menor de idade");
        }

// Switch
        int dia = 2;
        switch (dia) {
            case 1:
                System.out.println("Segunda-feira");
                break;
            case 2:
                System.out.println("Terça-feira");
                break;
            default:
                System.out.println("Outro dia");
        }

        // lacos de repeticoes 
        for (int i = 0; i < 10; i++) { //ele primeiro deu o valor de i, que é = 0, ou seja o inicio dele e zero e depois ele me informa 
            //que p maximo dele é 10, ou seja, ele pode percorrer ate 10 (1,2,3,4....10)
            System.err.println(i);
        }
        int i = 10;
        while (i>0) {
            //faltando coisa
            
        }

    }
}
