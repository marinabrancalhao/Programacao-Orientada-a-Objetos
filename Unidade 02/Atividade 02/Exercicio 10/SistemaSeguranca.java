import java.util.ArrayList;
import java.util.List;

public class SistemaSeguranca {
    
    public static void main(String[] args) {

        List<Autenticavel> objetosAutenticaveis = new ArrayList<>();

        objetosAutenticaveis.add(new Usuario("1234"));
        objetosAutenticaveis.add(new Administrador("adm_seguro"));

        boolean usuarioSucesso = objetosAutenticaveis.get(0).autenticar("1234");
        System.out.println("A senha está correta: " + (usuarioSucesso ? "Sucesso" : "Falha"));

        boolean usuarioFalha = objetosAutenticaveis.get(0).autenticar("4321");
        System.out.println("A senha está correta: " + (usuarioFalha ? "Sucesso" : "Falha"));

        boolean admSucesso = objetosAutenticaveis.get(1).autenticar("adm_seguro");
        System.out.println("A senha está correta: " + (admSucesso ? "Sucesso" : "Falha"));

        boolean admFalha = objetosAutenticaveis.get(1).autenticar("adm_errado");
        System.out.println("A senha está correta: " + (admFalha ? "Sucesso" : "Falha"));
    }
}
