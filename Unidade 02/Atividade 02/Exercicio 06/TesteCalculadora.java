public class TesteCalculadora {
    
    public static void main(String[] args) {
        
        Calculadora calculadora = new Calculadora();

        System.out.println(calculadora.somar(5, 3));
        System.out.println(calculadora.somar(5.5, 3.2));
        System.out.println(calculadora.dividir(10, 3));
        System.out.println(calculadora.dividir(10.0, 3.0));
    }
}
