public class Peixe extends Animal {
    
    private String tipoAgua;
    private boolean temEscamas;

    public Peixe(String nomeCientifico, double peso, String habitat, String tipoAgua, boolean temEscamas){
        super(nomeCientifico, peso, habitat);
        this.tipoAgua = tipoAgua;
        this.temEscamas = temEscamas;
    }

    public String getTipoAgua() {
        return tipoAgua;
    }

    public void setTipoAgua(String tipoAgua) {
        this.tipoAgua = tipoAgua;
    }

    public void setTemEscamas(boolean temEscamas) {
        this.temEscamas = temEscamas;
    }

    public void nadar(){
        System.out.println("O peixe está nadando....");
    }

    @Override
    public void emitirSom() {
        System.out.println("O peixe está emitindo ruídos...");
    }
}
