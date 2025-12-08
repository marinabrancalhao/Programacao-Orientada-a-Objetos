/*
Por fim, pense em um sistema de recursos humanos.
Implemente uma classe Funcionário com características como nome, cargo e salário, e um método para calcular aumento de salário.
Isso ajudará a gerenciar a equipe de forma eficaz!
*/

import java.util.Scanner;

public class Funcionario {
    
    private String nome;
    private String cargo;
    private double salario;
    private double aumento;

    Funcionario(String nome, String cargo, double salario, double aumento){
        this.nome = nome;
        this.cargo = cargo;
        this.salario = salario;
        this.aumento = aumento;
    }

    public double calcularAumento(double salario){

        return salario += salario * (aumento / 100) ;

    }

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o nome do funcionário: ");
        String nome = scanner.nextLine();

        System.out.print("Digite o cargo: ");
        String cargo = scanner.nextLine();

        System.out.print("Qual o salário atual? ");
        double salario = scanner.nextDouble();

        System.out.print("Em quantos % será o aumento? ");
        double aumento = scanner.nextDouble();

        Funcionario funcionario = new Funcionario(nome, cargo, salario, aumento);

        System.out.printf("\nSalário atualizado: %.2f%n", funcionario.calcularAumento(salario));

        scanner.close();



    }
}
