/*
Imagine que você está criando um aplicativo para um zoológico.
Desenvolva uma classe Animal com características como nome e tipo de alimentação, além de um método que permita ao animal emitir um som característico.
Isso tornará o app mais interativo!
*/

public class Animal {

    private String nome;
    private String tipoAlimentacao;

    Animal(String nome, String tipoAlimentacao){

        this.nome = nome;
        this.tipoAlimentacao = tipoAlimentacao;

    }

    public void emitirSom(){

        System.out.println("O animal " + nome + " está emitindo um som.");

    }

    public static void main(String[] args) {
        
        Animal animal = new Animal("Panda", "Bambu");

        animal.emitirSom();
    }
    
}
