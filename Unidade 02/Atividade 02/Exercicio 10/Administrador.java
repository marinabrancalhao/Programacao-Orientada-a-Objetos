public class Administrador implements Autenticavel {

    private String senha;

    public Administrador(String senha){
        this.senha = senha;
    }

    @Override
    public boolean autenticar(String senhaFornecida) {
        if (senha.equals(senhaFornecida) && senha.length() >= 5) {
            return true;
        }
        return false;
    }
    
}
