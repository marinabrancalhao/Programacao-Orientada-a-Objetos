public class Carro extends Veiculo {

    private int portas;

    public Carro(String marca, String modelo, int portas){
        super(marca, modelo);
        this.portas = portas;
    }
    
    @Override
    public void acelerar() {
        System.out.println("Carro acelerando...");
    } //sobrescrito

    public void abastecer(int litros){
        System.out.println("Abastecendo o carro com " + litros + " litros");
    } //sobrecarga

    public int getPortas() {
        return portas;
    }

    public void setPortas(int portas) {
        this.portas = portas;
    }

}
