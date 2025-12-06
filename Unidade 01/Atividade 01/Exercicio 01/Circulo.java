/*
Imagine que você está criando um aplicativo para uma loja de materiais de arte.
Crie uma classe Círculo que represente um círculo, incluindo atributos como raio e área, e implemente métodos para calcular a área e o perímetro.
Isso ajudará os artistas a entender melhor as medidas de seus trabalhos!
*/

import java.util.Scanner;

public class Circulo {
    
    private double raio;

    public Circulo(double raio){

        this.raio = raio;
    }

    public double calcularArea(){

        return Math.PI * raio * raio;

    }

    public double calcularPerimetro(){

        return 2 * Math.PI * raio;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite o valor do raio do círculo para calcular área e perímetro: ");
        double raio = scanner.nextDouble();

        Circulo circulo = new Circulo(raio);

        System.out.printf("Área: %.2f%n", circulo.calcularArea());
        System.out.printf("Perímetro: %.2f%n", circulo.calcularPerimetro());

        scanner.close();
    }
    
}
