package com.example;

import java.util.ArrayList;
import java.util.List;

public class Curso {

    //atributos 
        private String nomeCurso;
        private List<Aluno> alunos;
        private Professor professor;

        public Curso(String nomeCurso) {
            this.nomeCurso = nomeCurso;
            alunos = new ArrayList<>();
        }

        //metodo para adicionar professor no curso 
        public void addProf(Professor professor) {
            this.professor = professor;
            //chamei com o this porque esse professor ele vem de fora
        }

        //metodo par adicionar aluno 
        public void addAluno(Aluno aluno) {
            alunos.add(aluno);
            //aqui fizemos com add por conta que aluno sao varios, ou seja, ele apenas ira adicionar mais um aluno na lista
        }

        //lancar notas
        public void lancarNotas(String nomeAluno, Double notaAluno){
            for (Aluno aluno : alunos) {
                if(aluno.getNome().equalsIgnoreCase(nomeAluno)) {
                    aluno.setNota(notaAluno);
                    System.out.println("nota iserida com sucesso");
                    return;
                }
            }
            System.out.println("Aluno nao encontrado!!!");
        }
        //exibir nota final de cada aluno
        public void resultadoFinal(){
            for (Aluno aluno : alunos) {
                System.out.println(aluno.exibirInfo());
                aluno.avaliarDesempemho();
            }
        }
    
}
