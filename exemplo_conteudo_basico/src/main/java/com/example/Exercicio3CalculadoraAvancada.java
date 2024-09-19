package com.example;
import java.util.Scanner;

public class Exercicio3CalculadoraAvancada {
    //atributos 
    double a;
    double b;
    double resultado;
    int escolha; //apenas para a escolha da operação 

    //para usar o meu scanner eu preciso importar ele 
    Scanner sc = new Scanner(System.in);

    //criar os metodos da operacao
    //soma
    public double somar(double a, double b){
        resultado = a+b;
        return resultado;
    }
    //subtracao
    public double subtracao(double a, double b){
        resultado = a-b;
        return resultado;
    }
    // mult
    public double multiplicacao (double a, double b){
        resultado = a*b;
        return resultado;
    }
    //div
    public double divisao (double a, double b) {
        try {
            resultado = a/b;

        } catch (Exception e) {
            System.err.println(e);

        }
        return resultado;
    }
    //raiz 
    public double raiz (double a) throws Exception {
        if (a<0) {
            throw new Exception("Nao existe raiz de numero negativo");
        }
        try {
            resultado = Math.sqrt(a);
        } catch (Exception e) {
            System.err.println(e);
        }
        return resultado;
    }

    //criar metodo para lancar o menu

    public void menu(){
        System.err.println("Calculadora");
        System.err.println("1. soma");
        System.err.println("2. Subtracao");
        System.err.println("3. Multiplicacao");
        System.err.println("4. Divisao");
        System.err.println("5. Raiz Quadrada");
        System.err.println("6 Sair");
    }
    //entrada de dados

    public void entradaDeDados(){
        if(escolha >= 1 && escolha < 5){
            System.err.println("Digite o calor a:");
            a = sc.nextDouble();
            System.err.println("Digite o valor b:");
            b = sc.nextDouble();
        }else if (escolha ==5) {
            System.out.println("Digite o valor a:");
            a = sc.nextDouble();
        }else if(escolha ==6){
            System.out.println("saaindo.....");
        }
    }

 //preciso trocar os system err, pelo system out
 //calculadora
 
    public void calculadora(){
        do {
            menu();
            try {
                escolha = sc.nextInt();
                switch (escolha) {
                    case 1:
                    entradaDeDados();
                    somar(a, b);
                    break;

                    case 2:
                    entradaDeDados();
                    subtracao(a, b);
                    break;

                    case 3:
                    entradaDeDados();
                    multiplicacao(a, b);
                    break;

                    case 4:
                    entradaDeDados();
                    divisao(a, b);
                    break;

                    case 5:
                    entradaDeDados();
                    raiz(a);
                    break;

                    case 6:
                    entradaDeDados();
                    break;
                    default:
                    entradaDeDados();
                        break;
                }
        } catch(Exception e) {
            System.err.println(e);
        }      
    } while (escolha !=6);
}
}

