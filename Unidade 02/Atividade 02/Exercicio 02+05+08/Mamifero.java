public class Mamifero extends Animal {

    private boolean temPelo;
    private int quantidadeMamas;

    public Mamifero(String nomeCientifico, double peso, String habitat, boolean temPelo, int quantidadeMamas){
        super(nomeCientifico, peso, habitat); 
        this.temPelo = temPelo;
        this.quantidadeMamas = quantidadeMamas;
    }

    public int getQuantidadeMamas() {
        return quantidadeMamas;
    }

    public void setQuantidadeMamas(int quantidadeMamas) {
        this.quantidadeMamas = quantidadeMamas;
    }

    public void setTemPelo(boolean temPelo) {
        this.temPelo = temPelo;
    }

    public void amamentar(){
        System.out.println("O mamífero está amamentando...");
    }

    @Override
    public void emitirSom() {
        System.out.println("O mamífero está latindo...");
    }
    
}
