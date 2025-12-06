import java.util.ArrayList;
import java.util.Scanner;

public class GerenciarLivros {

    private ArrayList<Livro> biblioteca;

    public GerenciarLivros(){

        biblioteca = new ArrayList<>();
    }

    public void cadastrarLivro(Livro livro){
        biblioteca.add(livro);
    }

    public void exibirLivros(){
        for (Livro livro : biblioteca) {
            System.out.println("Título: " + livro.getTitulo());
            System.out.println("Autor: " + livro.getAutor());
            System.out.println("Número de páginas: " + livro.getNumeroPaginas());
            System.out.println("---------------------------------------------------");
        }
    }

    public static void main(String[] args) {

        GerenciarLivros biblioteca = new GerenciarLivros();
        Scanner scanner = new Scanner(System.in);

        boolean continuar = true;
        while (continuar) {
        
            System.out.println("\n== Biblioteca Online ==");
            System.out.println("1. Cadastrar livros");
            System.out.println("2. Exibir livros cadastrados");
            System.out.println("0. Sair");
            System.out.print("\nDigite a opção desejada: ");

            int opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:

                    System.out.print("\nTítulo: ");
                    String titulo = scanner.nextLine();

                    System.out.print("Autor: ");
                    String autor = scanner.nextLine();

                    System.out.print("Número de páginas: ");
                    int numeroPaginas = scanner.nextInt();
                    scanner.nextLine();

                    biblioteca.cadastrarLivro(new Livro(titulo, autor, numeroPaginas));

                    System.out.println("\nLivro cadastrado com sucesso!");

                    break;

                case 2:

                    System.out.println("\n--- Livros Cadastrados ---\n");
                    biblioteca.exibirLivros();

                    break;
            
                case 0 :

                    System.out.println("Programa encerrado...");

                    continuar = false;

                    break;

                default:

                    System.out.println("Opção inválida, tente novamente...");

                    break;
            }
        }

        scanner.close();

    }
    
}
