/*
Divisão por Zero com Feedback ao Usuário
Escreva um programa que solicite ao usuário um número e tente dividi-lo por zero.
Use um bloco try-catch para capturar a ArithmeticException, exibindo uma mensagem amigável para orientar o usuário sobre o erro.
*/

import java.util.Scanner;

public class Divisao {
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        try {
                  
            System.out.print("Digite um número inteiro para o numerador: ");
            int numerador = scanner.nextInt();

            System.out.print("Digite um número inteiro para o divisor: ");
            int divisor = scanner.nextInt(); 

            int resultado = numerador / divisor;
            System.out.println("Resultado: " + resultado);

        } catch (ArithmeticException e) {
            System.out.println("Erro: Não é possível realizar divisão por zero. ");
        } finally {
            scanner.close();
        }
    }
}
