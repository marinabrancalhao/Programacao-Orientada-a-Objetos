/*
Autenticação de Usuários
Imagine que você está desenvolvendo um sistema de segurança para uma empresa de tecnologia.
Crie uma interface Autenticável com um método autenticar.
Em seguida, implemente essa interface nas classes Usuário e Administrador.
Crie uma lista de objetos que implementem Autenticável e teste a autenticação para cada um, garantindo que apenas usuários autenticados acessem o sistema.
*/

public interface Autenticavel {
    
    public boolean autenticar(String senha);
    
}
