/*
Conta Bancária
Um banco deseja modernizar seu sistema de contas bancárias, e para isso, você deve implementar uma classe ContaBancaria com atributos como saldo e número da conta.
Crie duas subclasses, ContaCorrente e ContaPoupanca, cada uma herdando de ContaBancaria.
Diferencie as classes com características e métodos específicos para cada tipo de conta.
*/

/*
Aplicação de Juros em Contas Bancárias
Retorne à sua implementação da classe ContaBancaria no exercício 3.
Agora, adicione um método aplicarJuros, que deverá ter implementações diferentes nas subclasses ContaCorrente e ContaPoupanca.
Por exemplo, aplique uma taxa de juros de 15% para contas correntes e de 6,5% para contas poupança, permitindo que o banco gerencie os juros de maneira específica.
*/

public class ContaBancaria {
    
    private String numeroConta;
    private double saldo;

    public ContaBancaria(String numeroConta, double saldo){
        this.numeroConta = numeroConta;
        this.saldo = saldo;
    }

    public String getNumeroConta() {
        return numeroConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setNumeroConta(String numeroConta) {
        this.numeroConta = numeroConta;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void depositar(double valor){
        saldo += valor;
    }

    public void sacar(double valor){
        if (saldo >= valor) {
            saldo -= valor;
        } else {
            System.out.println("\nSaldo insuficiente para realizar a operação, tente novamente...");
        }
    }

    public void aplicarJuros(){
        System.out.println("A conta base não possui uma regra de juros específica.");
    }

    public void exibirInformacoes(){
        System.out.println("\nConta: " + numeroConta);
        System.out.printf("Saldo: R$%.2f%n", saldo);
    }
}
