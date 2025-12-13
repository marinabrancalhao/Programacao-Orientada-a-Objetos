public class ContaBancaria implements OperacoesBancarias {

    private String numeroAgencia;
    private String numeroConta;
    private double saldo;

    public String getNumeroAgencia() {
        return numeroAgencia;
    }

    public String getNumeroConta() {
        return numeroConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setNumeroAgencia(String numeroAgencia) {
        this.numeroAgencia = numeroAgencia;
    }

    public void setNumeroConta(String numeroConta) {
        this.numeroConta = numeroConta;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public ContaBancaria(String numeroAgencia, String numeroConta, double saldo){
        this.numeroAgencia = numeroAgencia;
        this.numeroConta = numeroConta;
        this.saldo = saldo;
    }

    protected void imprimirOperacão(String operacao, double valor){
        System.out.println("\n== Operação de " + operacao + " ==");
        System.out.println("Valor " + operacao.toLowerCase() + ": R$" + valor);
        System.out.println("Saldo atual: R$" + saldo);
        System.out.println("--------------------------------------------\n");
    }

    @Override
    public void depositar(double valor) {
        saldo += valor;
        imprimirOperacão("Depósito", valor);
    }

    @Override
    public void sacar(double valor) {
        if (valor <= saldo) {
            saldo -= valor;
            imprimirOperacão("Saque", valor);    
        } else {
            System.out.println("Saldo insuficiente para a operação... tente outro valor.");
        }
    }

    @Override
    public double consultarSaldo() {
        System.out.println("\nSaldo atual: R$" + saldo);
        return saldo;
    }
    

}
