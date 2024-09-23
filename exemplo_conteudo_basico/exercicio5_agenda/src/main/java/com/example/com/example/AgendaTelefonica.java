package com.example.com.example;

public class AgendaTelefonica {

    //atributos 
    private Contato[] contatos;
    private int contador;

    public AgendaTelefonica(int maxContato) {
        contatos = new Contato[maxContato];
        contador = 0;
    }

    //metodo adicionar 
    public void addContato(Contato contato) {
        if (contador >= contatos.length) { //o .lenght calcula quantos objetos tem dentro da lista 
            throw new AgendaCheiaException("Agenda cheia ");
        }
        contato[contador] = contato;
        contador++;
        System.out.println("Contato adicionado com sucesso");

    }

//listando 
    public void listarContatos() {
        if (contador == 0) {
            System.out.println("Agenda vazia");
        } else {
            for (int i = 0; i < contador; i++) {
                System.out.println(contatos[i].toString());
            }
        }
    }
}
