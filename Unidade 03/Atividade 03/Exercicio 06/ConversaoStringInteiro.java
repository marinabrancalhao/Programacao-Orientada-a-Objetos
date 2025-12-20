/*
Divisão por Zero com Feedback ao Usuário
Escreva um programa que solicite ao usuário um número e tente dividi-lo por zero.
Use um bloco try-catch para capturar a ArithmeticException, exibindo uma mensagem amigável para orientar o usuário sobre o erro.
*/

import java.util.Scanner;

public class ConversaoStringInteiro {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);   

        System.out.print("Digite um número inteiro: ");
        String numero = scanner.nextLine();

        try {
            Integer.parseInt(numero);
            System.out.println("Número digitado: " + numero);
        } catch (NumberFormatException e) {
            System.out.println("Erro: O valor digitado não é um número inteiro válido.");
        } finally {
            scanner.close();
        }
    }

}
