public class ContaCorrente extends ContaBancaria {

    private double limiteChequeEspecial;
    private double taxaChequeEspecial;

    public ContaCorrente(String numeroConta, double saldo, double limiteChequeEspecial, double taxaChequeEspecial){
        super(numeroConta, saldo);
        this.limiteChequeEspecial = limiteChequeEspecial;
        this.taxaChequeEspecial = taxaChequeEspecial;
    }

    public double getLimiteChequeEspecial() {
        return limiteChequeEspecial;
    }

    public double getTaxaManutencaoMensal() {
        return taxaChequeEspecial;
    }

    public void setLimiteChequeEspecial(double limiteChequeEspecial) {
        this.limiteChequeEspecial = limiteChequeEspecial;
    }

    public void setTaxaManutencaoMensal(double taxaChequeEspecial) {
        this.taxaChequeEspecial = taxaChequeEspecial;
    }

    @Override
    public void exibirInformacoes() {
        System.out.println("\n-- Conta Corrente --");
        super.exibirInformacoes();
        System.out.printf("Limite Cheque Especial: R$%.2f%n", limiteChequeEspecial);
    }

    @Override
    public void aplicarJuros() {
        if (getSaldo() < 0) {
            double jurosCobrado = getSaldo() * 0.15;
            setSaldo(getSaldo() + jurosCobrado);

            System.out.println("\nCOBRANÇA: Aplicado juros de 15% sobre o saldo devedor na Conta Corrente.");
            System.out.println("Novo saldo: R$" + getSaldo());
        } else {
            System.out.println("Conta Corrente: Saldo positivo. Nenhum juro de dívida aplicado.");
        }
    }

    @Override
    public void sacar(double valor) {

        double saldoLimiteMaximo = getSaldo() + limiteChequeEspecial;

        if (valor <= saldoLimiteMaximo) {
            double novoSaldo = getSaldo() - valor;
            setSaldo(novoSaldo);

            System.out.println("\nSaque realizado de R$" + valor + ". Saldo atualizado: R$" + novoSaldo);

            if (getSaldo() < 0) {
                System.out.println("ATENÇÃO! Você está usando o Cheque Especial.");
            }
        } else {
            System.out.println("\nErro: Saque de R$" + valor + " excede o limite total de crédito.");
        }
    }
        
}
