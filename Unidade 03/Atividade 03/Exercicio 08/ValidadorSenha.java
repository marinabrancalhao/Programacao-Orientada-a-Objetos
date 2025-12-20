/*
Validação de Senha
Crie uma classe ValidadorSenha com um método validarSenha(String senha) que lança uma exceção personalizada SenhaInvalidaException caso a senha não atenda aos critérios de segurança, como comprimento mínimo, entre outros.
*/

import java.util.Scanner;

public class ValidadorSenha {

    public static void validarSenha(String senha) throws SenhaInvalidaException{

        if (senha.length() < 8) {
            throw new SenhaInvalidaException("A senha deve conter no mínimo 8 caracteres.");
        }

        System.out.println("Senha válida!");
    }

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite sua senha: ");
        String senha = scanner.nextLine();

        try {
            validarSenha(senha);
        } catch (SenhaInvalidaException e) {
            System.out.println("Senha inválida: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}
