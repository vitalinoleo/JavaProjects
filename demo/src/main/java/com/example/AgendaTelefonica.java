package com.example;


public class AgendaTelefonica {

    //atributos 
    private Contato[] contatos;
    private int contador;

    public AgendaTelefonica(int maxContato) {
        contatos = new Contato[maxContato];
        contador = 0;
    }

    //metodo adicionar 
    public void addContato(Contato contato) throws AgendaCheiaException {
        if (contador >= contatos.length) { //o .lenght calcula quantos objetos tem dentro da lista 
            throw new AgendaCheiaException("Agenda cheia ");
        }
        contatos[contador] = contato;
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

    //buscar contato 
    public buscarContato(String nome) throws  ContatoNaoEncontradoException{
        for (int i = 0; i < contador; i++) {
            if(contatos[i].getNome().equalsIgnoreCase(nome)){
                return contatos[i];
            }
        }
        //se ele percorrer o meu for e nao encontrar nada, ele vai me retornar essa mensagem a baixo
        throw new ContatoNaoEncontradoException("Contato não encontrado");
    }

    //remover um contato
    public void removerContato(){
        boolean encontrado = false;
        for (int i = 0; i < contador; i++) {
            if(contatos[i].getNome().equalsIgnoreCase(nome));
            encontrado = true;
            contatos[i]=contatos[contador-1];
            contatos [contador-1] = null;
            contador--;
            System.out.println("Contato removido com sucesso"); 
        }
    }
    if (!encontrado){
        throw new ContatoNaoEncontradoException("Contato não encontrado");
    }
}
