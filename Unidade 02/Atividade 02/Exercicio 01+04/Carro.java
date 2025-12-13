public class Carro extends Veiculo {
    
    private int numeroPortas;
    private boolean temTetoSolar;

    public Carro(String modelo, int ano, int numeroPortas, boolean temTetoSolar){
        super(modelo, ano);
        this.numeroPortas = numeroPortas;
        this.temTetoSolar = temTetoSolar;
    }

    public int getNumeroPortas() {
        return numeroPortas;
    }

    public void setNumeroPortas(int numeroPortas) {
        this.numeroPortas = numeroPortas;
    }

    public void setTemTetoSolar(boolean temTetoSolar) {
        this.temTetoSolar = temTetoSolar;
    }

    public void abrirPortaMalas(){
        System.out.println("Porta-malas do " + getModelo() + " está aberto...");
    }

    @Override
    public void imprimirInformacoes() {
        System.out.println("\n-- Informações do Carro --");
        super.imprimirInformacoes();
        System.out.println("Número de Portas: " + numeroPortas);
        System.out.println("Teto Solar: " + (temTetoSolar ? "Sim" : "Não"));
        System.out.println();
    }
        
}
