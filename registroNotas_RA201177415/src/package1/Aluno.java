package package1;

import java.util.ArrayList;

public class Aluno {
    int encontro;
    String nome, matricula;
    float parcial = 0;
    float media = 0;
    Float situacao;
    double percentualDePresenca;

    ArrayList<Float> notasAluno = new ArrayList<>();

    // public Aluno(){

    // }

    public Aluno(String nome, String matricula, int encontro){
        setNome(nome);
        setMatricula(matricula);
        setEncontro(encontro);
        calculaNotas();
        calculoPresenca();
    }

    //funcao que jogas as notas pra dentro da lista
    void insereNotas(float nota){
        notasAluno.add(nota);
    }

    //getters e setters de nomes, matriculas e encontros
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public int getEncontro() {
        return encontro;
    }

    public void setEncontro(int encontro) {
        this.encontro = encontro;
    }

    //getters e setters de notas
    
    public ArrayList<Float> getNotasAluno() {
        return notasAluno;
    }

    public void setNotasAluno(ArrayList<Float> notasAluno) {
        this.notasAluno = notasAluno;
    }
    

    // METODOS

    //listar situacoes referente as notas
    void mostraSituacao(){
        System.out.println("\nNome: " + this.nome);
        System.out.print(String.format("Percetual de Presenca: %.2f", this.percentualDePresenca));
        System.out.println("%");
        System.out.println("Média: " + this.situacao);
    }

    //calcular siacao para o grupo de notas.
    void calculaNotas(){
        for(float notaDaLista:notasAluno){
            parcial += notaDaLista;
        }
        media = parcial/3;
        
        //situacao do aluno
        situacao = media;

    }

    void calculoPresenca(){
        //cálculo de presença:  = (encontro/quantidadeEncontros)*100
        percentualDePresenca =  (encontro / 60.0) * 100;
    }


}
