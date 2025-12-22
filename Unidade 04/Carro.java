public class Carro extends Veiculo {

    private int numeroPortas;
    private String tipoCombustivel;
    private int capacidadePortaMalas;

    public Carro(String marca, String modelo, int ano, String cor, double precoCusto, int numeroPortas, String tipoCombustivel, int capacidadePortaMalas) {
        super(marca, modelo, ano, cor, precoCusto); 
        this.numeroPortas = numeroPortas;
        this.tipoCombustivel = tipoCombustivel;
        this.capacidadePortaMalas = capacidadePortaMalas;
    }

    public void abrirPortaMalas(){
        System.out.println("Abrindo porta-malas...");
    }

    public void fecharPortaMalas(){
        System.out.println("Fechando porta-malas...");
    }

    public int getNumeroPortas() {
        return numeroPortas;
    }

    public String getTipoCombustivel() {
        return tipoCombustivel;
    }

    public int getCapacidadePortaMalas() {
        return capacidadePortaMalas;
    }

    public void setNumeroPortas(int numeroPortas) {
        this.numeroPortas = numeroPortas;
    }

    public void setTipoCombustivel(String tipoCombustivel) {
        this.tipoCombustivel = tipoCombustivel;
    }

    public void setCapacidadePortaMalas(int capacidadePortaMalas) {
        this.capacidadePortaMalas = capacidadePortaMalas;
    }

    @Override
    public void exibirInformacoes() {
        super.exibirInformacoes();
        System.out.println("Número de portas: " + numeroPortas);
        System.out.println("Tipo de combustível: " + tipoCombustivel);
        System.out.println("Capacidade do porta-malas: " + capacidadePortaMalas + " litros");
    }
    
    
}
