public class ExemploExcecaoPersonalizada {
    
    public static void main(String[] args) {
        
        try {
            cadastrarUsuario("Leo", -30);
        } catch (IdadeInvalidaException e) {
           System.out.println("Erro ao cadastrar usuário: " + e.getMessage()); 
        }
    }

    public static void cadastrarUsuario(String nome, int idade) throws IdadeInvalidaException{
        if (idade < 0) {
            throw new IdadeInvalidaException("A idade precisa ser entre 0 e 100 anos...");
        }

        System.out.println("Usuario cadastrado: " + nome + ", " + idade + " anos");
    }
}
