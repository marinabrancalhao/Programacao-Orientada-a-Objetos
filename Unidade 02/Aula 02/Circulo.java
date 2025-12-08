public class Circulo extends FiguraGeometrica{
    
    private double raio;

    public Circulo(double raio){
        this.raio = raio;
    }

    @Override
    public Double calcularArea() {
        return Math.PI * raio * raio;
    }

    @Override
    public double calcularPerimetro() {
        return 2 * Math.PI * raio;
    }
}
