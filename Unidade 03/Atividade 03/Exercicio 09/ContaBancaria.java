/*
Validação de Transferências Bancárias
Em um sistema bancário, desenvolva uma classe ContaBancaria com um método transferir.
Esse método deve lançar uma exceção personalizada TransferenciaInvalidaException se a quantia transferida for menor ou igual a zero, garantindo a validade das transações.
*/

public class ContaBancaria {
    
    private double saldo;

    public ContaBancaria(double saldo){
        this.saldo = saldo;
    }

    public void transferir (double valor) throws TransferenciaInvalidaException{

        if (valor <= 0) {
            throw new TransferenciaInvalidaException("Valor inválido para transferência!");
        }

        saldo -= valor;
        System.out.println("Transferência de R$" + valor + " realizada com sucesso!");
        System.out.println("Saldo atual: R$ " + saldo);

    }

    public static void main(String[] args) {
        
        ContaBancaria conta = new ContaBancaria(850.00);

        try {
            conta.transferir(0);
        } catch (TransferenciaInvalidaException e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }
}
