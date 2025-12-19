import java.util.Scanner;

public class ExemploCapturaExcecao {
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número inteiro: ");
        String input = scanner.nextLine();

        try {
            int numero = Integer.parseInt(input);
            System.out.println("Número digitado: " + numero);
        } catch (Exception e) {
            System.out.println("Erro: Não foi possível converter a entrada em número inteiro.");
            System.out.println("Mensagem de exceção: " + e.getMessage());
        } finally {
            scanner.close();
        }

        
    }
}
