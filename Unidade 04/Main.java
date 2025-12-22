import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Main {

    private static List<Carro> carros = new ArrayList<>();
    private static List<Moto> motos = new ArrayList<>();
    private static List<Pessoa> clientes = new ArrayList<>();
    private static List<Venda> vendas = new ArrayList<>();
    
    public static void main(String[] args) {

        // Veiculo veiculo = new Veiculo("Chevrolet", "Onix", 2015, "Prata", 45000);
        // Carro carro = new Carro("Chevrolet", "Onix", 2015, "Prata", 45000, 5, "Flex", 200);
        // Moto moto = new Moto("Kawasaky", "Ninja 900", 2019, "Verde", 55000, 900, true, "Head");
        // Pessoa pessoa = new Pessoa("Leonardo", 52, "Rua 1 n123", "11 38325599", "leo@email.com", 192, 98.4);
        // Venda venda = new Venda(carro, pessoa, 50000, LocalDateTime.now());
        
        Scanner scanner = new Scanner(System.in);

        int escolha = 0;
        do {
            try{
                System.out.println("== Menu Concessionária ==");
                System.out.println("1. Mostrar veículos");
                System.out.println("2. Comprar veículo");
                System.out.println("3. Vender veículo");
                System.out.println("4. Cadastrar cliente");
                System.out.println("5. Gerar relatório");
                System.out.println("0. Sair");
                System.out.print("Escolha uma opção: ");

                escolha = scanner.nextInt();
                scanner.nextLine();

                switch (escolha) {
                    case 1:
                        mostrarVeiculos();
                        break;
                    case 2:
                        comprarVeiculo(scanner);
                        break;
                    case 3:
                        venderVeiculo(scanner);
                        break;
                    case 4:
                        cadastrarCliente(scanner);
                        break;
                    case 5:
                        gerarRelatorio();
                        break;
                    case 0:
                        System.out.println("Fechando o programa...");
                        break;
                    default:
                        System.out.println("Opção inválida... Tente novamente.");
                }
            } catch(InputMismatchException e) {
                System.out.println("Erro: Entrada inválida. Certifique-se de inserir os dados corretamente.");
            } catch(Exception e){
                System.err.println("Erro desconhecido: " + e.getMessage());
            }

        } while (escolha != 0);

        scanner.close();
    }

    private static void mostrarVeiculos() {
        mostrarCarros();
        System.out.println();
        System.out.println("----------------------------------------------");
        System.out.println();
        mostrarMotos();
    }

    private static void mostrarCarros(){
       if (!carros.isEmpty()) {
            System.out.println("\n-- Lista de Carros --");
            int x = 1;
            for (Carro carro : carros) {
                System.out.println(x + " - " + carro.getModelo() + " | " + carro.getAno());
                x++;
            }
        } else {
            System.out.println("\nNenhum carro foi encontrado!");
        }  
    }

    private static void mostrarMotos(){
           if (!motos.isEmpty()) {
            System.out.println("-- Lista de Motos --");
            int x = 1;
            for (Moto moto : motos) {
                System.out.println(x + " - " + moto.getModelo() + " | " + moto.getAno());
                x++;
            }
        } else {
            System.out.println("Nenhuma moto foi encontrada!\n");
        }
    }

    private static void comprarVeiculo(Scanner scanner){
        System.out.println("\n== Compra de Veículo ==");
        int escolha;

        try{
            System.out.println("\nQual novo veículo deseja cadastrar?");
            System.out.println("1. Carro");
            System.out.println("2. Moto");
            System.out.println("0. Voltar ao menu");
            
            System.out.print("Opção: ");
            escolha = scanner.nextInt();
            scanner.nextLine();

            if (escolha > 2) {
                throw new InputMismatchException();
            }

            while (escolha != 0) {
                System.out.print("\nDigite a marca do veículo: ");
                String marca = scanner.nextLine();

                System.out.print("Digite o modelo do veículo: ");
                String modelo = scanner.nextLine();

                System.out.print("Digite o ano do veículo: ");
                int ano = scanner.nextInt();
                scanner.nextLine();

                System.out.print("Digite a cor do veículo: ");
                String cor = scanner.nextLine();

                System.out.print("Digite o preço do veículo: ");
                double preco = scanner.nextDouble();

                switch (escolha) {
                    case 1:
                        System.out.print("Digite o número de portas do veículo: ");
                        int numeroPortas = scanner.nextInt();
                        scanner.nextLine();

                        System.out.print("Digite o tipo de combustível: ");
                        String tipoCombustivel = scanner.nextLine();

                        System.out.print("Digite a capacidade do porta-malas do veículo: ");
                        int capacidadePortaMalas = scanner.nextInt();
                        scanner.nextLine();

                        Carro carro = new Carro(marca, modelo, ano, cor, preco, numeroPortas, tipoCombustivel, capacidadePortaMalas);
                        carros.add(carro);

                        System.out.println("\nCarro modelo " + modelo + " cadastrado com sucesso!");

                        escolha = 0;

                        break;
                    case 2:
                        System.out.print("Digite as cilindradas do veículo: ");
                        int cilindradas = scanner.nextInt();
                        scanner.nextLine();

                        System.out.println("O veículo possui partida elétrica (S - Sim | N - Não)?");
                        String partida = scanner.nextLine();
                        boolean partidaEletrica;
                        if (partida == "S" || partida == "s") {
                            partidaEletrica = true;
                        } else {
                            partidaEletrica = false;
                        }

                        System.out.print("Digite a categoria do veículo: ");
                        String categoria = scanner.nextLine();

                        Moto moto = new Moto(marca, modelo, ano, cor, preco, cilindradas, partidaEletrica, categoria);
                        motos.add(moto);

                        System.out.println("\nMoto modelo " + modelo + " cadastrada com sucesso!");

                        escolha = 0;

                        break;
                    default:
                        System.out.println("\nOpção inválida... Tente novamente.");
                        break;
                }
            }
        } catch(InputMismatchException e) {
            System.out.println("Erro: Entrada inválida. Certifique-se de inserir os dados corretamente.");
        } catch(Exception e){
            System.err.println("Erro desconhecido: " + e.getMessage());
        }

    }    


    private static void venderVeiculo(Scanner scanner){
        try {
            if (clientes.isEmpty() || (carros.isEmpty() && motos.isEmpty())) {
                if (clientes.isEmpty()) {
                    System.out.println("Não há clientes na base de dados!");
                }
                if (carros.isEmpty()) {
                    System.out.println("Não há carros disponíveis para venda!");
                }
                if (motos.isEmpty()) {
                    System.out.println("Não há motos disponíveis para venda!");
                }
            } else {
                mostrarClientes();
                Pessoa comprador = clientes.get(scanner.nextInt()-1);
                scanner.nextLine();

                System.out.print("Informe o valor da venda: R$");
                double valorVenda = scanner.nextDouble();
                scanner.nextLine();

                int escolha;

                System.err.println("Qual novo veículo deseja vender? ");
                System.out.println("1. Carro");
                System.out.println("2. Moto");
                System.out.print("Opção: ");
                escolha = scanner.nextInt();
                scanner.nextLine();

                switch (escolha) {
                    case 1:
                        mostrarCarros();
                        Carro carroParaVenda = carros.get(scanner.nextInt()-1);
                        scanner.nextLine();

                        Venda novaVendaCarro = new Venda(carroParaVenda, comprador, valorVenda, LocalDateTime.now());

                        vendas.add(novaVendaCarro);
                        carros.remove(carroParaVenda);
                        break;

                    case 2:
                        mostrarMotos();
                        Moto motoParaVenda = motos.get(scanner.nextInt()-1);
                        scanner.nextLine();

                        Venda novaVendaMoto = new Venda(motoParaVenda, comprador, valorVenda, LocalDateTime.now());

                        vendas.add(novaVendaMoto);
                        motos.remove(motoParaVenda);
                        break;

                    default:
                        System.out.println("Opção inválida... Tente novamente.");
                        break;
                }

                System.out.println("Venda realizada com sucesso!");
            }
        } catch(InputMismatchException e) {
            System.out.println("Erro: Entrada inválida. Certifique-se de inserir os dados corretamente.");
        } catch(IndexOutOfBoundsException e){
            System.err.println("Erro: Índice inválido. Certifique-se de escolher uma opção correta.");
        } catch(Exception e){
            System.err.println("Erro desconhecido: " + e.getMessage());
        }
    }

    private static void mostrarClientes() {
        if (!clientes.isEmpty()) {
            System.out.println("-- Lista de Clientes --");
            int x = 1;
            for (Pessoa cliente : clientes) {
                System.out.println(x + " - " + cliente.getNome() + " | " + cliente.getTelefone());
                x++;
                
            }
        }
    }

    private static void cadastrarCliente(Scanner scanner){
        try{
            System.out.println("== Cadastro de Cliente ==");

            System.out.print("Digite o nome do cliente: ");
            String nome = scanner.nextLine();

            System.out.print("Digite a idade do cliente: ");
            int idade = scanner.nextInt();
            scanner.nextLine();

            System.out.print("Digite o endereço do cliente: ");
            String endereco = scanner.nextLine();

            System.out.print("Digite o telefone para contato do cliente: ");
            String telefone = scanner.nextLine();

            System.out.print("Digite o email do cliente: ");
            String email = scanner.nextLine();

            System.out.print("Digite a altura do cliente: ");
            double altura = scanner.nextDouble();
            scanner.nextLine();

            System.out.print("Digite o peso do cliente: ");
            double peso = scanner.nextDouble();
            scanner.nextLine();

            Pessoa novoCliente = new Pessoa(nome, idade, endereco, telefone, email, altura, peso);
            clientes.add(novoCliente);

            System.out.println("O cliente " + nome + " foi cadastrado com sucesso!");

        } catch(InputMismatchException e) {
                System.out.println("Erro: Entrada inválida. Certifique-se de inserir os dados corretamente.");
            } catch(Exception e){
                System.err.println("Erro desconhecido: " + e.getMessage());
            }   
    }

    private static void gerarRelatorio(){
        if (vendas.isEmpty()) {
            System.out.println("Não existem vendas cadastradas!");
        } else {
            System.out.println("== Relatório de Vendas ==");
            for (Venda venda : vendas) {
                System.out.println();
                System.out.println("Data: " + venda.getDataVenda());
                System.out.println("Veículo: " + venda.getVeiculo().getModelo() + " | " + venda.getVeiculo().getAno());
                System.out.println("Comprador: " + venda.getComprador().getNome() + " | " + venda.getComprador().getTelefone());
                System.out.println("Valor da venda: R$" + venda.getValor());
                System.out.println("----------------------------------------------");
            }
        }
    }
}
