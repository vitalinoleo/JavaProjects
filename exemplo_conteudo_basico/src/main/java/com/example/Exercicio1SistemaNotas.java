package com.example;

import java.io.NotSerializableException;
import java.util.Scanner;

public class Exercicio1SistemaNotas {
    //atributos 
    double[] notas = new double[4];
    double mediaNotas = 0;
    boolean bonus = true;

    Scanner sc = new Scanner(System.in);

    public void calculoNotas(){
        // pegar todas as notas dos alunos
        for (int i = 0; i < notas.length; i++) {
            System.out.println("Digite a nota" +i+":"); //esse +i+ e pra ele saber a posicao da minha nota
            notas[i]=sc.nextDouble(); //esse nextdouble esta aqui para a seguinte parada: ele vai ficar rodando esse fpr ate chegar na nota 4, apenas depois disso ele vai seguir em frente
            // somar as notas na variavel media
            mediaNotas+=notas[i];
            if (notas[i]<9) {
                bonus = false;
            }
        }
        mediaNotas/=notas.length;
        //aplicar o bonus 
        if(bonus){
            mediaNotas = (mediaNotas * 1.1 > 10 ? mediaNotas = 10 : mediaNotas * 1.1);

        }
        // se a media nota do aluno for maior que 7, ele esta aprovado
        if (mediaNotas >= 7) {
            System.out.println("Aprovado!");
        } else if (mediaNotas >=5 && mediaNotas <7){
            System.err.println("Recuperação!");
        } else {
            System.out.println("Reprovado!");
        }
    }
 
}
