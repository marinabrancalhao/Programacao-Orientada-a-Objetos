public class Usuario implements Autenticavel {

    private String senha;

    public Usuario(String senha){
        this.senha = senha;
    }
    
    @Override
    public boolean autenticar(String senhaFornecida) {
        if (senha.equals(senhaFornecida)) {
            return true;
        } 
        return false;
    }
}
