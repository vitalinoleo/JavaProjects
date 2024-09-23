package com.example;

public class Pessoa {
    //atributos 
    private String nome;
    private String cpf;
   

    // contrutor cheio 
    public Pessoa(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }

    // construtor vazio
    public Pessoa(){
    }

    //GETTERS and setters 
    // get 
    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    //set
    
    //exeibir informacao 
    
    public String exibirInfo(){
    return "nome" + nome +", cpf" + cpf;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    
    
}
