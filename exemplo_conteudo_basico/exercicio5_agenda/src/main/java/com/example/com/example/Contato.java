package com.example.com.example;
//estva dando erro por que estava sem esse packege

//instalandando o lombok, ives de escrever o get e set eu so faco esse @ e ele ja faz para mim
//instalei o lombok mas eu prefiro fazer manualmente os gatters and setters 

public class Contato {
    //aatributos
    private String nome;
    private String telefone;

    //metodos
    //construtor 

    public Contato(){ }
    public Contato(String nome, String telefone){
        this.nome = nome;
        this.telefone = telefone;
    }

    // get
    public String getNome() {
        return nome;
    }

    public String getTelefone() {
        return telefone;
    }

    // set
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
    

    @Override
    public String toString(){
        return "nome:" + nome + ", telefone:" + telefone;

    }





}
