package com.example;

import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
        //chamar a agenda telofinca 
        AgendaTelefonica agenda = new AgendaTelefonica(5);
        int operador = 0;
        try{
        do {
            System.out.println("\n---Agenda telefonica---");
            System.out.println("1-adicionar contato");
            System.out.println("2-listar contato");
            System.out.println("3-buscar contato(nome)");
            System.out.println("4-remover contato(nome)");
            System.out.println("5-sair...");
            try{
            operador = Integer.parseInt(JOptionPane.showInputDialog("Digite a operacao"));
            }catch(Exception e){
                System.err.println(e);
                operador = 0;
            }
            switch (operador) {
                case 1:
                    try {  String nome = JOptionPane.showInputDialog("digite o nome");
                    String telefone = JOptionPane.showInputDialog("digite o telefone");
                    Contato contato = new Contato(nome, telefone);
                    agenda.addContato(contato);
                    } catch (Exception e) {
                        System.out.println(e);

                    }

                    break;
                    
                case 2 :
                    agenda.listarContatos();
                    break;

                case 3:
                    try {
                        String nome = JOptionPane.showInputDialog("infome um nome");
                        System.out.println(agenda.buscarContato(nome).toString());
                    } catch (Exception e) {
                        System.err.println(e);
                    }
                    break;
                case 4:
                try {
                    String nomeRemove = JOptionPane.showInputDialog("informe um nome para remover");
                    agenda.removerContato(nomeRemove);
                } catch (Exception e) {
                    System.err.println(e);
                }   

                default:
                    break;
            }
        } while (operador!=5);
        }catch (Exception e){
            System.err.println(e);
        }
    }
}