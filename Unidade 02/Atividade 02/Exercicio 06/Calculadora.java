/*
Polimorfismo na Calculadora
Para este exercício, desenvolva uma classe Calculadora que execute operações básicas de matemática, como soma, subtração, multiplicação e divisão.
Para aplicar polimorfismo por sobrecarga, faça com que os métodos aceitem diferentes tipos de parâmetros, como números inteiros e decimais, para que o usuário tenha maior flexibilidade no uso da calculadora.
*/

public class Calculadora {

    public int somar(int a, int b){
        return a + b;
    }

    public double somar(double a, double b){
        return a + b;
    }

    public int subtrair(int a, int b){
        return a - b;
    }

    public double subtrair(double a, double b){
        return a - b;
    }

    public int multiplicar(int a, int b){
        return a * b;
    }

    public double multiplicar(double a, double b){
        return a * b;
    }

    public int dividir(int a, int b){
        return a / b;
    }

    public double dividir(double a, double b){
        return a / b;
    }

    
}