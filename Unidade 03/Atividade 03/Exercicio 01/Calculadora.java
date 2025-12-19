import java.util.Scanner;

public class Calculadora {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número para ser dividido: ");
        double dividendo = scanner.nextDouble();

        System.out.print("Digite o divisor: ");
        double divisor = scanner.nextDouble();

        try {
            double resultado = dividir(dividendo, divisor);
            System.out.println("Resultado da divisão: " + resultado);
        } catch (ArithmeticException e) {
            System.out.println("Erro ao realizar a operação: " + e.getMessage());
        } finally {
            scanner.close();
        }
        
    }

    public static double dividir(double dividendo, double divisor){
        
        if (divisor == 0) {
            throw new ArithmeticException("Divisão por zero não é permitida.");
        }

        return dividendo / divisor;

    }
}
