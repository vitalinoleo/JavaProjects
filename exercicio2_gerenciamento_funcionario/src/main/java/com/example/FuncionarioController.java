package com.example;
//aqui vamos fazer as alterações: deletar, alterar etc

import java.util.ArrayList;
import java.util.List;


public class FuncionarioController {
    //atributos 
    private List<Funcionario> funcionarios;
    public FuncionarioController(){
        funcionarios = new ArrayList<>(); //vetor
    }

    //metodos 
    //add funcionario 
    public void addFuncionario(Funcionario funcionario){
        funcionarios.add(funcionario);
    }

    //listar 
    public void listarFuncionario(){
        if (funcionarios.size()==0) {
            System.out.println("lista vazia");
        }else {
            for (Funcionario funcionario : funcionarios) {
                System.out.println(funcionario.toString());
            }
        }
    }

    //metodo de remocao pelo nome do funcionario
    public void removerFuncionario(String nome){
        try{
        boolean encontrado = false;
        for (Funcionario funcionario : funcionarios) {
            if (funcionario.getNome().equalsIgnoreCase(nome)) {
                funcionarios.remove(funcionario);
                encontrado = true;
            }
        }
        if (!encontrado) {
            throw new Exception("deu errado");
        }
        }catch(Exception e){
            System.err.println(e);
        }
    }

    //media salarial
    public double mediaSal(){
        double mediaSal = 0;
        if (funcionarios.size()==0) {
            return mediaSal;
        }else{
            for (Funcionario funcionario : funcionarios) {
                mediaSal += funcionario.getSalario();
            }
            return mediaSal / funcionarios.size();
        }
    }
}
