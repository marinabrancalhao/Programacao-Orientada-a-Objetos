public class Ave extends Animal {
    
    private String corPena;
    private boolean sabeVoar;

    public Ave(String nomeCientifico, double peso, String habitat, String corPena, boolean sabeVoar){
        super(nomeCientifico, peso, habitat);
        this.corPena = corPena;
        this.sabeVoar = sabeVoar;
    }

    public String getCorPena() {
        return corPena;
    }

    public void setCorPena(String corPena) {
        this.corPena = corPena;
    }

    public void setSabeVoar(boolean sabeVoar) {
        this.sabeVoar = sabeVoar;
    }

    public void construirNinho(){
        System.out.println("A ave está construindo ninho...");
    }

    @Override
    public void emitirSom() {
        System.out.println("A ave está piando...");
    }
}
