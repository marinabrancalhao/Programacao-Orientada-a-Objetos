import java.util.ArrayList;
import java.util.List;

public class SistemaCalculos {
    
    public static void main(String[] args) {
        
        List<FormaGeometrica> formas = new ArrayList<>();

        formas.add(new Circulo(5.0));
        formas.add(new Retangulo(4.0, 6.0));
        formas.add(new Triangulo(5.0, 4.0, 3.0, 4.0, 5.0));

        System.out.println("== Cálculos das Formas Geométricas ==");
        for (FormaGeometrica forma : formas) {
            double area = forma.calcularArea();
            double perimetro = forma.calcularPerimetro();

            System.out.println("\nForma: " + forma.getNomeForma());
            System.out.printf("Área: %.2f%n", area);
            System.out.printf("Perímetro: %.2f%n", perimetro);
        }
    }
}
