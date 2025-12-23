public class Caminhao extends Veiculo { //novo tipo de veículo

    private double capacidadeCarga;
    private int numeroEixos;

    public Caminhao(String marca, String modelo, int ano, String cor, double precoCusto, double capacidadeCarga, int numeroEixos) {
        super(marca, modelo, ano, cor, precoCusto);
        this.capacidadeCarga = capacidadeCarga;
        this.numeroEixos = numeroEixos;
    }

    @Override
    public void exibirInformacoes() {
        super.exibirInformacoes();
        System.out.println("Capacidade de Carga: " + capacidadeCarga + " Toneladas");
        System.out.println("Número de Eixos: " + numeroEixos);
        System.out.println("------------------------------------------------------------");
    }

    public void carregar() {
        System.out.println("Carregando o caminhão " + getModelo() + "...");
    }
}
