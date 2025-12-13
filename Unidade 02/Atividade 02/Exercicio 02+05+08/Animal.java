/*
Hierarquia de Animais
Você está ajudando uma equipe de biólogos a organizar um catálogo de animais! 
Comece com uma classe base chamada Animal, definindo os atributos básicos para representar qualquer animal.
Em seguida, desenvolva subclasses específicas como Mamífero, Ave e Peixe, adicionando características que melhor descrevam cada tipo. 
Sua missão é criar uma estrutura hierárquica que facilite a identificação e classificação dos animais.
*/

/*
Sons dos Animais
No exercício 2, você desenvolveu uma hierarquia de classes para animais.
Agora, adicione um método emitirSom à classe base Animal, e sobrescreva-o nas subclasses para que cada animal emita um som específico.
Esse método permitirá identificar os animais apenas pelos sons que produzem, enriquecendo seu sistema de classificação.
*/

/*
Lista de Sons de Animais
Utilize a hierarquia de classes que você criou para animais no exercício 2. 
Crie uma lista com diferentes animais e percorra essa lista chamando o método emitirSom de cada animal. 
Esse recurso ajudará a criar uma “sinfonia” de sons de animais, permitindo que a equipe de biólogos utilize o sistema para reconhecimento auditivo das espécies.
*/

public class Animal {

    private String nomeCientifico;
    private double peso;
    private String habitat;

    public Animal(String nomeCientifico, double peso, String habitat){
        this.nomeCientifico = nomeCientifico;
        this.peso = peso;
        this.habitat = habitat;
    }
    
    public String getNomeCientifico() {
        return nomeCientifico;
    }

    public double getPeso() {
        return peso;
    }

    public String getHabitat() {
        return habitat;
    }

    public void setNomeCientifico(String nomeCientifico) {
        this.nomeCientifico = nomeCientifico;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }

    public void dormir(){
        System.out.println("O animal está dormindo...");
    }

    public void comer(){
        System.out.println("O animal está comendo...");
    }

    public void emitirSom(){
        System.out.println("O animal está emitindo som... ");
    }
}
