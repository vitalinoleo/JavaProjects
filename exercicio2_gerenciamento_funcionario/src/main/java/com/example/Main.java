package com.example;

import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
        FuncionarioController gerencia = new FuncionarioController();
        int operacao = 0;
            do {
                try{
            operacao = Integer.parseInt(JOptionPane.showInputDialog("/n"
            + "Gerenciamento de funcionarios /n"
            + "1 Cadastrar funcionario /n"
            + "2 listar funcionario /n"
            + "3 remover funcionario /n"
            + "4 calcular media salarial /n"
            + "5 sair /n"));
                } catch (Exception e){
                    System.err.println(e);
                    operacao=0;
                }
                switch (operacao) {
                    case 1:
                        String nome = JOptionPane.showInputDialog("Digite o nome");
                        int idade = Integer.parseInt(JOptionPane.showInputDialog("Digite a idade"));
                        double salario = Double.parseDouble(JOptionPane.showInputDialog("Digite o salario"));
                        gerencia.addFuncionario(new Funcionario(nome, idade, salario));
                        break;
                    case 2 :
                        gerencia.listarFuncionario();
                        break;
                    case 3 :
                        String nomef = JOptionPane.showInputDialog("informe o nome a ser removido");
                        gerencia.removerFuncionario(nomef);
                        break;
                    case 4 :
                        gerencia.mediaSal();
                    case 5 :
                        System.out.println("saindo...");
                
                    default:
                        System.out.println("Digite uma opcao valida!!");
                        break;
                }

        } while (operacao!=5);
    }
}