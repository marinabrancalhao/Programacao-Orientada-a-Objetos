import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Main {

    private static List<Carro> carros = new ArrayList<>();
    private static List<Moto> motos = new ArrayList<>();
    private static List<Caminhao> caminhoes = new ArrayList<>();
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
                System.out.println("\n== Menu Concessionária ==");
                System.out.println("1. Mostrar veículos");
                System.out.println("2. Comprar veículo");
                System.out.println("3. Vender veículo");
                System.out.println("4. Cadastrar cliente");
                System.out.println("5. Mostrar clientes"); //opção para mostrar clientes
                System.out.println("6. Gerar relatório");
                System.out.println("0. Sair");
                System.out.print("\nEscolha uma opção: ");

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
                        mostrarClientes();
                        break;
                    case 6:
                        gerarRelatorio();
                        break;
                    case 0:
                        System.out.println("\nFechando o programa...");
                        break;
                    default:
                        System.out.println("\nOpção inválida... Tente novamente.");
                }
            } catch(InputMismatchException e) {
                System.out.println("\nErro: Entrada inválida. Certifique-se de inserir os dados corretamente.");
            } catch(Exception e){
                System.err.println("\nErro desconhecido: " + e.getMessage());
            }

        } while (escolha != 0);

        scanner.close();
    }

    private static List<Veiculo> mostrarVeiculos() { //método unificado para mostrar todos os veículos
        System.out.println("\n== Mostrar Veículos ==");

        List<Veiculo> veiculos = new ArrayList<>();
        veiculos.addAll(carros);
        veiculos.addAll(motos);
        veiculos.addAll(caminhoes);

        if (veiculos.isEmpty()) {
            System.out.println("\nNão há nenhum veículo cadastrado na concessionária.");
        } else {
            int i = 1;
            for (Veiculo veiculo : veiculos) {
                System.out.print(i + " - ");
                veiculo.exibirInformacoes();
                i++;
            }
        }

        return veiculos; //retorna a lista pra ser reutilizada
    }

    
    private static void comprarVeiculo(Scanner scanner){
        System.out.println("\n== Compra de Veículo ==");
        int escolha;

        try{
            System.out.println("\nQual novo veículo deseja cadastrar?");
            System.out.println("1. Carro");
            System.out.println("2. Moto");
            System.out.println("3. Caminhão");
            
            System.out.print("Opção: ");
            escolha = scanner.nextInt();
            scanner.nextLine();

            if (escolha > 3) {
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

                System.out.print("Digite o preço de custo do veículo: ");
                double precoCusto = scanner.nextDouble();

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

                        Carro carro = new Carro(marca, modelo, ano, cor, precoCusto, numeroPortas, tipoCombustivel, capacidadePortaMalas);
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

                        Moto moto = new Moto(marca, modelo, ano, cor, precoCusto, cilindradas, partidaEletrica, categoria);
                        motos.add(moto);

                        System.out.println("\nMoto modelo " + modelo + " cadastrada com sucesso!");

                        escolha = 0;

                        break;
                    
                    case 3:
                        System.out.print("Digite a capacidade de carga do veículo: "); //nova opção do novo tipo de veículo
                        double capacidadeCarga = scanner.nextInt();
                        scanner.nextLine();

                        System.out.print("Digite o número de eixoa do veículo: ");
                        int numeroEixos = scanner.nextInt();
                        scanner.nextLine();

                        Caminhao caminhao = new Caminhao(marca, modelo, ano, cor, precoCusto, capacidadeCarga, numeroEixos);
                        caminhoes.add(caminhao);

                        System.out.println("\nCaminhão modelo " + modelo + " cadastrado com sucesso!");

                        escolha = 0;

                        break;

                    default:
                        System.out.println("\nOpção inválida... Tente novamente.");
                        break;
                }
            }
        } catch(InputMismatchException e) {
            System.out.println("\nErro: Entrada inválida. Certifique-se de inserir os dados corretamente.");
        } catch(Exception e){
            System.err.println("\nErro desconhecido: " + e.getMessage());
        }

    }    


    private static void venderVeiculo(Scanner scanner){
        try {

            if (clientes.isEmpty()) {
                System.out.println("\nNão há clientes na base de dados!");
                return;
            }

            mostrarClientes();
            System.out.print("\nSelecione o número do cliente: ");
            Pessoa comprador = clientes.get(scanner.nextInt()-1);
            scanner.nextLine();

            List<Veiculo> estoqueVenda = mostrarVeiculos();
            if(estoqueVenda.isEmpty()){
                System.out.println("\nNão há veículos cadastrados!");
                return;
            }

            System.out.print("\nDigite o número do veículo para venda: ");
            int indice = scanner.nextInt() - 1;
            scanner.nextLine();
            Veiculo veiculoEscolhido = estoqueVenda.get(indice);

            System.out.print("Informe o valor da venda para " + veiculoEscolhido.getModelo() +": R$");
            double valorVenda = scanner.nextDouble();
            scanner.nextLine();

            if (valorVenda <= 0) { //exceção personalizada
                throw new ValorInvalidoException("\nO valor da venda deve ser maior que zero.");
            }
            
            Venda novaVenda = new Venda(veiculoEscolhido, comprador, valorVenda, LocalDateTime.now());
            vendas.add(novaVenda);

            if (veiculoEscolhido instanceof Carro) {
                carros.remove(veiculoEscolhido);
            } else if (veiculoEscolhido instanceof Moto) {
                motos.remove(veiculoEscolhido);
            } else if (veiculoEscolhido instanceof Caminhao) {
                caminhoes.remove(veiculoEscolhido);
            }

            System.out.println("\nVenda realizada com sucesso!");

        } catch(IndexOutOfBoundsException e){
            System.err.println("\nErro: Índice inválido. Certifique-se de escolher uma opção correta.");
        } catch(ValorInvalidoException e){
            System.out.println("\nErro: " + e.getMessage());    
        } catch(Exception e){
            System.err.println("\nErro desconhecido: " + e.getMessage());
        }
    }

    private static void mostrarClientes() {

        if (clientes.isEmpty()) {
            System.out.println("\nNenhum cliente cadastrado!");
        } else {
            System.out.println("\n-- Lista de Clientes e Sugestão de Carros --");
            int x = 1;
            for (Pessoa cliente : clientes) {
                System.out.println(x + " - " + cliente.getNome() + " | Altura: " + cliente.getAltura() + "cm");
                
                System.out.print("   #Sugestão: ");
                if (cliente.getAltura() > 190) {
                    System.out.println("Devido à sua altura, sugerimos um Caminhão pelo espaço interno.");
                } else if (cliente.getAltura() < 165) {
                    System.out.println("Sugerimos uma Moto pela facilidade de manobra.");
                } else {
                    System.out.println("Sugerimos um Carro pelo conforto e versatilidade.");
                }
                x++;
                System.out.println("----------------------------------------------");
            }
        }
    }

    private static void cadastrarCliente(Scanner scanner){
        try{
            System.out.println("\n== Cadastro de Cliente ==");

            System.out.print("Digite o nome do cliente: ");
            String nome = scanner.nextLine();

            System.out.print("Digite a idade do cliente: ");
            int idade = scanner.nextInt();
            scanner.nextLine();

            if (idade < 18) {
                throw new ClienteMenorIdadeException("Atenção! Cliente menor de idade.");
            }

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

            System.out.println("\nO cliente " + nome + " foi cadastrado com sucesso!");

        } catch(InputMismatchException e) {
            System.out.println("\nErro: Entrada inválida. Certifique-se de inserir os dados corretamente.");
        } catch(ClienteMenorIdadeException e){
            System.out.println("\nErro: " + e.getMessage());
        } catch(Exception e){
            System.err.println("\nErro desconhecido: " + e.getMessage());
        }   
    }

    private static void gerarRelatorio(){
        if (vendas.isEmpty()) {
            System.out.println("\nNão existem vendas cadastradas!");
        } else {
            System.out.println("\n== Relatório de Vendas ==");
            for (Venda venda : vendas) {
            venda.exibirDetalhesVenda(); //aproveitamento do método ao invés de print
            }
        }
    }
}
