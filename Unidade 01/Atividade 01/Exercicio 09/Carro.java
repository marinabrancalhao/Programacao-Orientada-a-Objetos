/*
Agora, considere a criação de um simulador de carros.
Crie uma classe Carro com atributos como marca, modelo e ano, e métodos para ligar, desligar e acelerar.
Isso tornará a simulação mais realista!
*/

public class Carro {

    private String marca;
    private String modelo;
    private int ano;

    Carro(String marca, String modelo, int ano){

        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;

    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public int getAno() {
        return ano;
    }

    public String ligar(){

        return "O carro " + modelo + " " + ano + " está ligado.";
    }
 
    public String acelerar(){

        return "Acelerando o " + modelo + "...";
    }

    public String desligar(){

        return "O carro " + modelo + " " + ano + " está desligado.";
    }

    public static void main(String[] args) {
        
        Carro carro = new Carro("Volkswagen", "Fusca", 1975);
        Carro carro2 = new Carro("Fiat", "Uno", 2015);
        Carro carro3 = new Carro("Nissan", "Kicks", 2021);

        System.out.println(carro.ligar());
        System.out.println(carro2.acelerar());
        System.out.println(carro3.desligar());
    }
    
}
