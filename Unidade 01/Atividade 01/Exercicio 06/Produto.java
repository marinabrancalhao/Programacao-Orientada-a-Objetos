/*
Você está criando um sistema de e-commerce.
Crie uma classe Produto com atributos como nome e preço, e um método para calcular o preço com desconto.
Isso ajudará os clientes a economizar em suas compras!
*/

import java.util.Scanner;

public class Produto {
    
    private String nome;
    private double preco;

    Produto(String nome, double preco) {

        this.nome = nome;
        this.preco = preco;

    }

    public double calcularDesconto(double preco){

        double desconto = 0.10;
        double precoComDesconto = preco - (preco * desconto);

        return precoComDesconto;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o nome do produto: ");
        String nome = scanner.nextLine();

        System.out.print("Digite o preço para aplicar desconto: R$ ");
        double preco = scanner.nextDouble();
        
        Produto produto = new Produto(nome, preco);

        System.out.printf("\nPreço com desconto: R$ %.2f%n",produto.calcularDesconto(preco));
    }
}
