package com.example;

public class Main {
    public static void main(String[] args) {
        ListExemplo list = new ListExemplo();
        list.addNome("Maria");
        list.addNome("Joao");
        list.addNome("Pedro");
        list.listarNomes();
        list.modificarNome("Pedro", "Maria");
        list.listarNomes();
        list.removerNomes("Maria");
        list.listarNomes();

        Set.addNome("Maria");
        Set.addNome("Joao");
        Set.addNome("Pedro");
        Set.listarNomes();
        Set.removerNomes("Maria");
        Set.listarNomes();
    }
}