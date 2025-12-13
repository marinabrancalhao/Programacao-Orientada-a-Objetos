public class Moto extends Veiculo {
    
    private int cilindradas;
    private boolean temBau;

    public Moto(String modelo, int ano, int cilindradas, boolean temBau){
        super(modelo, ano);
        this.cilindradas = cilindradas;
        this.temBau = temBau;
    }

    public int getCilindradas() {
        return cilindradas;
    }

    public void setCilindradas(int cilindradas) {
        this.cilindradas = cilindradas;
    }

    public void setTemBau(boolean temBau) {
        this.temBau = temBau;
    }

    public void inclinarParaCurva(){
        System.out.println("A moto " + getModelo() + " está inclinando para fazer uma curva...");
    }

    @Override
    public void imprimirInformacoes() {
        System.out.println("\n-- Informações da Moto --");
        super.imprimirInformacoes();
        System.out.println("Cilindradas: " + cilindradas);
        System.out.println("Baú: " + (temBau ? "Sim" : "Não"));
        System.out.println();
    }
}
