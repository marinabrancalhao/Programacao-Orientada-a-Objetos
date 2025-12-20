/*
Conversão de Temperatura e Limites Físicos
Em um sistema meteorológico, crie uma classe ConversorTemperatura com um método converterCelsiusParaFahrenheit(double temperaturaCelsius).
Esse método deve lançar uma IllegalArgumentException caso a temperatura informada seja menor que -273.15 (o zero absoluto). 
Depois, implemente um programa que utilize essa classe e capture a exceção, informando uma mensagem de erro apropriada ao usuário.
*/

import java.util.Scanner;

public class ConversorTemperatura {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("-- Conversor Temperatura --");
        System.out.print("Digite a temperatura em °C: ");
        double temperaturaCelsius = scanner.nextDouble();

        try {
            double resultado = converterCelsiusParaFahrenheit(temperaturaCelsius);
            System.out.printf("Resultado: %.1f °F", resultado);
        } catch (IllegalArgumentException e) {
            System.out.println("Erro ao realizar a conversão: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }

    public static double converterCelsiusParaFahrenheit(double temperaturaCelsius){

        if (temperaturaCelsius < -273.15) {
            throw new IllegalArgumentException("Temperatura abaixo do zero absoluto (-273.15°C) não é permitida.");
        }

        return (temperaturaCelsius * 1.8) + 32;
    }
}
