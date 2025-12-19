import java.util.Scanner;

public class Idade {
    
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a idade para verificar se é válida: ");
        int idade = scanner.nextInt();

        try {
            verificarIdade(idade);
        } catch (IllegalArgumentException e) {
            System.out.println("Erro: " + e.getMessage());
        } finally {
            scanner.close();
        }
        
    }

    public static void verificarIdade(int idade){

        if (idade < 0 || idade > 150) {
            throw new IllegalArgumentException("A idade informada é inválida.");
        }

        System.out.println("A idade informada é válida!");
    }
}
