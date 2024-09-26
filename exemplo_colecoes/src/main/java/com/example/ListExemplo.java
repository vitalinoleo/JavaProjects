package com.example;

import java.util.ArrayList;
import java.util.List;

public class ListExemplo {
    private List<String>nomes;
    
    //ctor 
    public ListExemplo() {
        nomes = new ArrayList<>();
    }

    //metodo adicionar 
    public void addNome(String nome){
        nomes.add(nome);
        System.out.println(nomes.lastIndexOf(nome));//printando a posicao e nome exemplo "0 - nome , 1 - nome, 2 - nome " assim em diante

    }

    //metodo listar 
    public void listarNomes(){
        System.out.println(nomes);//printando minha lista

    }

    //metodo remover 

    public void removerNomes(String nome){

        try {
            nomes.remove(nome);
            System.out.println("nome removido com sucesso!!!");
        } catch (Exception e) {
            System.out.println(e);//se der erro ele me printa o erro da Exception
        }
    }

    //metodo atualizar/modificar 

    public void modificarNome(String nomeAntigo, String nomeNovo){
        try {
            int index = nomes.indexOf(nomeAntigo);
            nomes.set(index, nomeNovo);
            System.out.println("nome alterado com sucesso!!!");
        } catch (Exception e) {
            System.out.println(e);
        }

    }

}
