/*
Imagine que você está desenvolvendo um aplicativo de finanças pessoais.
Crie uma classe ContaBancária com atributos como saldo e número da conta, e métodos para depositar e sacar.
Isso ajudará os usuários a gerenciar suas economias!
*/

import java.util.Scanner;

public class ContaBancaria {

    private int numeroConta;
    private double saldo;

    ContaBancaria(int numeroConta, double saldo){

        this.numeroConta = numeroConta;
        this.saldo = saldo;

    }

    public double getSaldo() {
        return saldo;
    }

    public void depositar(double valor){
        saldo += valor;
    }

    public void sacar(double valor){
        saldo -= valor;
    }
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o número da conta: ");
        int numeroConta = scanner.nextInt();
        scanner.nextLine();

        ContaBancaria conta = new ContaBancaria(numeroConta, 1500.85);

        System.out.println("\nSaldo atual: " + conta.getSaldo());

        System.out.println("\nQual operação deseja realizar?");
        System.out.println("1. Depósito");
        System.out.println("2. Saque");

        System.out.print("\nOpção: ");
        int opcao = scanner.nextInt();
        scanner.nextLine();

        System.out.print("\nDigite o valor para realizar a operação: ");
        double valor = scanner.nextDouble();

        switch (opcao) {
            case 1:

            conta.depositar(valor);
                
                break;
            
            case 2:

                if (valor >= conta.getSaldo()) {
                    System.out.println("\nSaldo insuficiente...");
                } else {
                    conta.sacar(valor);
                }

                break;
        
            default:

                System.out.println("\nOpção inválida...");

                break;

        }

        System.out.println("\nSaldo atual: " + conta.getSaldo());
    }
}
