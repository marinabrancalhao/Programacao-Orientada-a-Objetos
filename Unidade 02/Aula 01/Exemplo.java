public class Exemplo {
    
    public static void main(String[] args) {
        
        Carro carro = new Carro("Toyota", "Corolla", 5);
        Moto moto = new Moto("Honda", "CBR", 600);

        carro.setModelo("Hilux");
        carro.setPortas(3);

        moto.setModelo("Biz");
        moto.setCilindradas(120);

        System.out.println("\nCarro:");
        System.out.println("Marca: " + carro.getMarca());
        System.out.println("Modelo: " + carro.getModelo());
        System.out.println("Número portas: " + carro.getPortas());

        System.out.println("\nMoto:");
        System.out.println("Marca: " + moto.getMarca());
        System.out.println("Modelo: " + moto.getModelo());
        System.out.println("Cilindradas: " + moto.getCilindradas());
    }
}
