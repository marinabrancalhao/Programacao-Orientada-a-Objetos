package pacote01;

import pacote02.Carro;

public class Exemplo01 {
    
    public static void main(String[] args) {

        Pessoa pessoa = new Pessoa();
        Produto produto = new Produto();
        Carro carro = new Carro();  

        pessoa.setNome("Leo");
        pessoa.setIdade(27);

        System.out.println(pessoa.nome);
        System.out.println(pessoa.idade);
        //System.out.println(pessoa.peso);

        produto.setNome("Macarrão");
        produto.setPreco(10.50);

        System.out.println(produto.nome);
        System.out.println(produto.preco);
        //System.out.println(pessoa.peso);

        carro.setMarca("Fiat");

        System.out.println(carro.marca);
        //System.out.println(produto.modelo); protected só no mesmo pacote
        //System.out.println(pessoa.cor);


        
        
    }
}
