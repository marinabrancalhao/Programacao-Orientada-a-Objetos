public class Exemplo {
    
    public static void main(String[] args) {
        Pato pato = new Pato();
        Onca onca = new Onca();

        onca.fazerBarulho();
        onca.nadar();

        pato.fazerBarulho();
        pato.nadar();
        pato.voar();
    }
}
