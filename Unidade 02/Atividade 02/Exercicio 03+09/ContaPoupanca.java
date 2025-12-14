public class ContaPoupanca extends ContaBancaria {
    
    private int diaAniversario;
    private double taxaRendimento;

    public ContaPoupanca(String numeroConta, double saldo, int diaAniversario, double taxaRendimento){
        super(numeroConta, saldo);
        this.diaAniversario = diaAniversario;
        this.taxaRendimento = taxaRendimento;
    }

    public int getDiaAniversario() {
        return diaAniversario;
    }

    public double getTaxaRendimento() {
        return taxaRendimento;
    }

    public void setDiaAniversario(int diaAniversario) {
        this.diaAniversario = diaAniversario;
    }

    public void setTaxaRendimento(double taxaRendimento) {
        this.taxaRendimento = taxaRendimento;
    }

    public void verificarAniversario(){
        System.out.println("A próxima data de aniverário para rendimento é o dia " + diaAniversario + " de cada mês.");
    }

    @Override
    public void exibirInformacoes() {
        System.out.println("\n-- Conta Poupança --");
        super.exibirInformacoes();
        System.out.println("Dia de Rendimento: Dia " + diaAniversario);
        System.out.println("Taxa de Rendimento: " + (taxaRendimento * 100) + "%");
    }

    @Override
    public void aplicarJuros() {
        double rendimento = getSaldo() * taxaRendimento;
        setSaldo(getSaldo() + rendimento);

        System.out.println("\nCRÉDITO: Rendimento de " + (taxaRendimento * 100) + "%, aplicada na Conta Poupança");
        System.out.println("Rendimento creditado: R$" + rendimento);
        System.out.println("Novo saldo: R$"+ getSaldo());
    }
}
