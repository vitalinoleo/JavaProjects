package com.example;

public class Aluno extends Pessoa implements Avaliavel {
    //atributos 
    private String matricula;
    private Double nota;

    //contrutor
    public Aluno(String matricula, String nome, String cpf) {
        this.matricula = matricula;
        this.nota = nota;
    }

   

    // get 
    public String getMatricula() {
        return matricula;
    }

    public Double getNota() {
        return nota;
    }
    // set 



    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }



    public void setNota(Double nota) {
        this.nota = nota;
    }
    

    // polimorfismo - sobrescritura

    @Override 
    public String exibirInfo(){
    super.exibirInfo();
    return "Matricula:" +matricula+ "nota:" +nota ;
    }



    @Override
    public void avaliarDesempemho() {
        if (nota>=7){
            System.out.println("Aluno Aprovado");
        }else if( nota>=5 && nota <7) {
            System.out.println("Aluno de recuperacao");
        }else{
            System.out.println("Aluno Reprovado");
        }
    }

}
