package com.example;
import java.util.Scanner;

public class Exercicio4Recurso {
    //atributos 
    int numero = -1;

    Scanner sc = new Scanner(System.in);

    //calculo do fatorial
    public long calculoFatorial(int n){
        if (n==0 || n==1) {
            return 1;
        }else{
            return n*calculoFatorial(n-1);
        }
    }
    //calcular o fatorial 
    public void calculadora() throws Exception{
        System.out.println("Digite um numero para calcular fatorial");
        numero = sc.nextInt();
        if(numero<0){
            //aqui estava dando erro porque nao tinha colocado o "throws Exception quando eu chamei o public void"
            throw new Exception("o numero deve ser positivo");
        }
        try {
            System.out.println(calculoFatorial(numero));
        } catch (Exception e) {
            System.err.println(e);
        }
    }

    
}
