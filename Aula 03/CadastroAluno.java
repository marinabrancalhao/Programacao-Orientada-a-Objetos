import java.util.ArrayList;
import java.util.Scanner;

public class CadastroAluno {
    
    private ArrayList<Aluno> alunos;

    public CadastroAluno(){
        alunos = new ArrayList<>();
    }

    public void cadastrarAluno(Aluno aluno){
        alunos.add(aluno);
    }

    public void mostrarAlunos(){
        for (Aluno aluno : alunos) {
            System.out.println("Nome: " + aluno.getNome());
            System.out.println("Idade: " + aluno.getIdade());
            System.out.println("Curso: " + aluno.getCurso());
        }
    }

    public static void main(String[] args) {
        
        CadastroAluno cadastro = new CadastroAluno();
        Scanner scanner = new Scanner(System.in);

        boolean continuar = true;
        while (continuar) {
            System.out.println("\nEscolha uma opção abaixo: ");
            System.out.println("1. Cadastrar aluno");
            System.out.println("2. Mostrar alunos cadastrados");
            System.out.println("3. Sair");
            System.out.print("\nOpção: ");
            
            int opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:

                    System.out.print("\nInforme o nome do aluno: ");
                    String nome = scanner.nextLine();

                    System.out.print("Informe a idade do aluno: ");
                    int idade = scanner.nextInt();
                    scanner.nextLine();

                    System.out.print("Informe o curso do aluno: ");
                    String curso = scanner.nextLine();

                    cadastro.cadastrarAluno(new Aluno(nome, idade, curso));

                    System.out.println("\nAluno cadastrado com sucesso!");

                    break;

                case 2:

                    System.out.println("\nAlunos cadastrados:");
                    cadastro.mostrarAlunos();
                    
                    break;

                case 3:

                    System.out.println("\nEncerrando o sistema...");

                    continuar = false;
                    
                    break;

                default:

                    System.out.println("\nOpção inválida! Tente novamente...");

                    break;
            }
        }

        scanner.close();

    }


}


