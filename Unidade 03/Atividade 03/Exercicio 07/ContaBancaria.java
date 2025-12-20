/*
Exceção de Saldo Insuficiente
Desenvolva uma exceção personalizada chamada SaldoInsuficienteException que seja lançada quando uma tentativa de sacar uma quantia superior ao saldo disponível for feita em uma conta bancária.
*/

public class ContaBancaria {

    private double saldo;

    public ContaBancaria(double saldo){
        this.saldo = saldo;
    }

    public void sacar(double valor) throws SaldoInsuficienteException{

        if (valor > saldo) {
            throw new SaldoInsuficienteException("Saldo insuficiente para esta operação!");
        }
        
        saldo -= valor;

        System.out.println("Valor sacado: " + valor);
        System.out.println("Saldo atual: " + saldo);
    }

        public static void main(String[] args) {
        
        ContaBancaria conta = new ContaBancaria(500.00);

        try {
            conta.sacar(1000.00);
        } catch (SaldoInsuficienteException e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }
    
}
