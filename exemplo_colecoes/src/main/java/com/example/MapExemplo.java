package com.example;

import java.util.HashMap;
import java.util.Map;

public class MapExemplo {
    private Map<String.Integer> nomesIdade;
     
    public MapExemplo(){
        nomesIdades = new HashMap<>();

    }

    //adicionar
    public void addNomeIdade(String nome, int idade){
        nomesIdades.put(nome, idade);
        System.out.println(nomesIdades);
    }
}
