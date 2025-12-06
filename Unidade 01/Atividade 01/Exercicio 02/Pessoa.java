/*
Agora, pense em um sistema para gerenciar um evento social. 
Desenvolva uma classe Pessoa com atributos como nome e idade, e implemente um método que permita cumprimentar os convidados.
Isso tornará a recepção mais amigável!
*/

public class Pessoa {

    private String nome;
    private int idade;

    public Pessoa(String nome, int idade){

        this.nome = nome;
        this.idade = idade;
    }

    public void cumprimentarConvidados(){
        
        System.out.println("Olá, meu nome é " + nome + " e eu tenho " + idade + " anos. Fique à vontade!");
    }

    public static void main(String[] args) {
        
        Pessoa pessoa = new Pessoa("Marina", 30);

        pessoa.cumprimentarConvidados();

    }
    
}
