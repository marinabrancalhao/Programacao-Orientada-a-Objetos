import java.util.ArrayList;
import java.util.List;

public class Sons {
    
    public static void main(String[] args) {
        
        Mamifero cachorro = new Mamifero("Canis familiaris", 15.5, "Doméstico", true, 10);
        Ave pardal = new Ave("Passer domesticus", 0.03, "Urbano", "Marrom", true);
        Peixe salmao = new Peixe("Salmo salar", 4.5, "Aquático", "Salgada", true);

        List<Animal> catalogoAnimais = new ArrayList<>();

        catalogoAnimais.add(cachorro);
        catalogoAnimais.add(pardal);
        catalogoAnimais.add(salmao);

        System.out.println("--- Sinfonia de Sons dos Animais ---");
        for (Animal animal : catalogoAnimais) {
            animal.emitirSom();
        }       
    }
}
