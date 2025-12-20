public class DivisaoInteira {
    
    public void realizarDivisao(int dividendo, int divisor) throws DivisaoInteiraInvalidaException{

        if (dividendo % divisor != 0) {
            throw new DivisaoInteiraInvalidaException("O resultado da divisão não é um número inteiro.");
        }

        int resultado = dividendo / divisor;

        System.out.println("Resultado exato: " + resultado);
    }

    public static void main(String[] args) {
        
        DivisaoInteira divisao = new DivisaoInteira();

        try {
            divisao.realizarDivisao(10, 2);
        } catch (DivisaoInteiraInvalidaException e) {
            System.out.println("Erro: " + e.getMessage());
        }

         try {
            divisao.realizarDivisao(10, 3);
        } catch (DivisaoInteiraInvalidaException e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }
}
