package com.example;

import java.util.HashSet;
import java.util.Set;

public class SetExemplo {
    private Set<String> nomes;
    
    public SetExemplo(){
        nomes = new HashSet<>();
    }

    //metodo adicionar
    public void addList(String nome){
        nomes.add(nome);
        System.out.println(nomes.hashCode());
    }

    //metodo listar 
    public void listarNomes(String nome){

    }

    
}
