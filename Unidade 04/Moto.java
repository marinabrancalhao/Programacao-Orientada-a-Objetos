public class Moto extends Veiculo {

    private int cilindradas;
    private boolean partidaEletrica;
    private String categoria;


    public Moto(String marca, String modelo, int ano, String cor, double precoCusto, int cilindradas, boolean partidaEletrica, String categoria) {
        super(marca, modelo, ano, cor, precoCusto); 
        this.cilindradas = cilindradas;
        this.partidaEletrica = partidaEletrica;
        this.categoria = categoria;
    }

    public int getCilindradas() {
        return cilindradas;
    }

    public String getCategoria() {
        return categoria;
    }

    public boolean isPartidaEletrica(){
        return partidaEletrica;
    }
    
    public void setCilindradas(int cilindradas) {
        this.cilindradas = cilindradas;
    }

    public void setPartidaEletrica(boolean partidaEletrica) {
        this.partidaEletrica = partidaEletrica;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    @Override
    public void exibirInformacoes() {
        super.exibirInformacoes();
        System.out.println("Cilindradas: " + cilindradas);
        System.out.println("Partida elétrica: " + (partidaEletrica ? "Sim" : "Não"));
        System.out.println("Categoria: " + categoria);
        System.out.println("------------------------------------------------------------");
    }

    public void empinar(){
        System.out.println("Moto " + getModelo() + " empinando...");
    }
}
