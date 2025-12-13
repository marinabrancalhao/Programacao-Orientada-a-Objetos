public class ContaInvestimento extends ContaBancaria {

    private static final double TAXA_ADMINISTRACAO = 20.0;
    private static final double TAXA_JUROS_MENSAL = 0.012;
    private double saldoInvestido;


    public ContaInvestimento(String numeroAgencia, String numeroConta, double saldo){
        super(numeroAgencia, numeroConta, saldo);
        this.saldoInvestido = 0.0;
    }
    
    public void investir(double valor){
        if (valor <= getSaldo()) {
            setSaldo(getSaldo() - valor);
            double valorInvestido = valor - TAXA_ADMINISTRACAO;
            saldoInvestido += valorInvestido;
            System.out.println("Investimento de R$ " + valorInvestido + " realizado!");
            System.out.println("Saldo investido atualizado: R$ " + saldoInvestido);

        } else {
            System.out.println("Saldo insuficiente para a operação... tente novamente.");
        }
    }

    public void resgatar(double valor){
        if (valor <= saldoInvestido) {
            saldoInvestido -= valor;
            setSaldo(getSaldo() + valor);
            System.out.println("Saldo investido atualizado: R$ " + saldoInvestido);
        } else {
            System.out.println("Saldo investido insuficiente para a operação... tente novamente.");
        }
    }

    public double consultarSaldoInvestido(){
        System.out.println("Saldo investido: R$ " + saldoInvestido);
        return saldoInvestido;
    }

    public void aplicarJurosMensal(){
        saldoInvestido += saldoInvestido * TAXA_JUROS_MENSAL;
        System.out.println("Saldo investido atualizado: R$ " + saldoInvestido);
    }


}
