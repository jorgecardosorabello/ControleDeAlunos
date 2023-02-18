package package1;

import java.util.Scanner;

public class Main {
    
    /**
     * @param args
     */
    public static void main(String[] args) {
        int opc = 0;
        int encontro;
        float nota = 0;
        String nome, matricula;


        Sala novaSala = new Sala();
        // Aluno novoAluno = new Aluno();
        
        Scanner teclado = new Scanner(System.in);


        do{
            System.out.println("\n----------------------");
            System.out.println("       MENU");
            System.out.println("Escolha uma opção:");
            System.out.println("1 - Inserir Alunos.");
            System.out.println("2 - Situações dos alunos.");
            System.out.println("0 - Sair.");
            System.out.println("----------------------");

            opc = teclado.nextInt();
            teclado.nextLine();

            switch (opc){
                case 1:
                    System.out.println("Insira os dados do Aluno.\n");

                    System.out.println("Nome:");
                    nome = teclado.nextLine();

                    System.out.println("Matricula:");
                    matricula = teclado.nextLine();

                    System.out.println("Encontros em que o aluno estava presente:");
                    encontro = teclado.nextInt();

                    var novoAluno = new Aluno(nome, matricula, encontro);

                    for (int i = 0; i < 3; i++) {
                        System.out.println("Insira a nota "+(i+1)+":");
                        nota =  teclado.nextFloat(); 
                        //inserir no array de notas desse aluno
                        novoAluno.insereNotas(nota);
                        
                    }
                    
                    novaSala.insereAluno(novoAluno);
                    
                    break;
                case 2:
                    novaSala.listarSituacoes();
                    break;
                case 0:
                    System.out.println("Programa encerrado!");
                    break;
                default:
                System.out.println("Digite uma opção válida!");
            }

        }while(opc != 0);
    }
}
