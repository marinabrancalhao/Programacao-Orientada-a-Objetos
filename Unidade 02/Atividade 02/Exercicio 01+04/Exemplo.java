public class Exemplo {
    
    public static void main(String[] args) {
        
        Carro carro = new Carro("Golf", 2017, 4, true);

        Moto moto = new Moto("CG 150", 2015, 150, false);

        carro.imprimirInformacoes();
        carro.abrirPortaMalas();

        moto.imprimirInformacoes();
        moto.inclinarParaCurva();

    }
}
