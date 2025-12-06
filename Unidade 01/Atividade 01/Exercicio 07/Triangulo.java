/*
Pense em um programa educacional que ensina geometria.
Implemente uma classe Triângulo com atributos como base e altura, e um método para calcular a área.
Essa prática será excelente para os alunos!
*/

import java.util.Scanner;

public class Triangulo {

    private double base;
    private double altura;

    Triangulo(double base, double altura){

        this.base = base;
        this.altura = altura;

    }

    public double calcularArea(double base, double altura){

        return (base * altura) / 2;
    }
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("== Cáculo de Área do Triângulo ==");

        System.out.print("\nDigite a medida da base do triângulo: ");
        double base = scanner.nextDouble();

        System.out.print("Digite a medida da altura do triângulo: ");
        double altura = scanner.nextDouble();

        Triangulo triangulo = new Triangulo(base, altura);

        System.out.printf("\nA área do triângulo é: %.1f", triangulo.calcularArea(base, altura));

        scanner.close();
    }
}
