/*
Validação de Idade
Desenvolva uma classe Idade com um método verificarIdade(int idade) que lança uma exceção caso a idade fornecida seja menor que 0 ou maior que 150. 
Este exercício ajudará a controlar a entrada de dados inválidos no sistema.
*/

import java.util.Scanner;

public class Idade {
    
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a idade: ");
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
