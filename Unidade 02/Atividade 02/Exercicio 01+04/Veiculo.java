/*
Veículo e Herança
Imagine que você foi contratado(a) por uma empresa automobilística para desenvolver um sistema que organize informações de veículos.
Comece criando uma classe Veículo com atributos básicos, como modelo e ano.
Em seguida, crie duas subclasses, Carro e Moto, adicionando ao menos dois atributos específicos e um método adicional para cada um.
Assim, seu sistema representará melhor as diferenças entre cada tipo de veículo.
*/

/*
Impressão de Informações de Veículos
Utilize as classes Carro e Moto que você criou no exercício 1 e, agora, implemente um método na classe base Veículo chamado imprimirInformacoes.
Sobrescreva este método nas subclasses para exibir detalhes específicos de cada tipo de veículo.
Este recurso ajudará os usuários a verem informações detalhadas de cada veículo de maneira prática e organizada.
*/

public class Veiculo {

    private String modelo;
    private int ano;

    public Veiculo(String modelo, int ano){
        this.modelo = modelo;
        this.ano = ano;
    }

    public int getAno() {
        return ano;
    }

    public String getModelo() {
        return modelo;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void imprimirInformacoes(){
        System.out.println("Modelo: " + modelo);
        System.out.println("Ano: " + ano);
    }
    
}
