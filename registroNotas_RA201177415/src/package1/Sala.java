package package1;

import java.util.ArrayList;

public class Sala {
    ArrayList<Aluno> listaDeAlunos;

    public Sala() {
        this.listaDeAlunos = new ArrayList<>(); 
    }

    void insereAluno(Aluno novoAluno){
        novoAluno.calculaNotas();
        listaDeAlunos.add(novoAluno);

    }

    void listarSituacoes(){
        System.out.println("\nSituações de todos alunos:");

        for(Aluno alunoNaLista:listaDeAlunos){
            alunoNaLista.mostraSituacao();
        }
    }
    
}

