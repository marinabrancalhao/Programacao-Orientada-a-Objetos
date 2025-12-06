/*
Considere a criação de um programa para calcular áreas de terrenos.
Implemente uma classe Retângulo com atributos como comprimento e largura, e métodos para calcular a área e o perímetro.
Esse conhecimento será útil para muitos!
*/

import java.util.Scanner;

public class Retangulo {

    private double comprimento;
    private double largura;

    Retangulo(double comprimento, double largura){

        this.comprimento = comprimento;
        this.largura = largura;

    }

    public double calcularArea(double comprimento, double largura){

        double area = comprimento * largura;

        return area;
    }

    public static void main(String[] args){ 
        
        Scanner scanner = new Scanner(System.in);

        System.err.println("== Cáculo de Área ==");

        System.out.print("\nDigite o comprimento do terreno: ");
        double comprimento = scanner.nextDouble();

        System.out.print("Digite a largura do terreno: ");
        double largura = scanner.nextDouble();

        Retangulo retangulo = new Retangulo(comprimento, largura);

        System.out.printf("\nÁrea do terreno: %.2f m²", retangulo.calcularArea(comprimento, largura));

        scanner.close();
    }
    
}
