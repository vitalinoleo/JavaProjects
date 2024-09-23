package com.example;


//para nao fazer os getters and setters e os contrutores eu poderia instalar a dependencia lombok, porem nao gosto de usala
//mas caso use devemos usar da seguinte forma

public class Funcionario {
    //atributos 
    private String nome;
    //private = uma variavel privada 
    private int idade;
    private double salario;

    //construtor vazio 
    public Funcionario(){

    }

    //construtor com argumentos 
    public Funcionario(String nome, int idade, double salario) {
        this.nome = nome;
        this.idade = idade;
        this.salario = salario;
        //this = refere ao atributo da frente
    }

    

    // getters and setters
    // get
    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public double getSalario() {
        return salario;
    }
    
    //set
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    //metodo
    @Override
    public String toString(){
        return "nome" + nome + ", Idade " + idade + ", salario " + salario;
    }
}
