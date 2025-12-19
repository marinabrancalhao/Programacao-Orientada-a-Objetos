public class ContaBancaria {
    
    private double saldo;

    public ContaBancaria(double saldo){
        this.saldo = saldo;
    }

    public void realizarTransacao(double valor) throws TransacaoInvalidaException{
        if (valor <= 0) {
            throw new TransacaoInvalidaException("Valor da transação inválido: " + valor);
        }

        if (valor > saldo) {
            throw new TransacaoInvalidaException("Saldo insuficiente para realizar a transação... ", new SaldoInsuficienteException());
        }

        saldo -= valor;
        System.out.println("Saque de R$ " + valor + " realizado com sucesso!");
        System.out.println("Saldo atual: R$: " + saldo);
    }
}
