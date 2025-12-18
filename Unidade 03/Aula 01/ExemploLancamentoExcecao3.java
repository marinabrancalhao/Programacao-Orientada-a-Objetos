import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class ExemploLancamentoExcecao3 {
    
    public static void main(String[] args) {

        System.out.println(new File(".").getAbsolutePath());
        
        try {
            abrirArquivo("arquivo.txt");
            
            abrirArquivo(null);
            
            abrirArquivo("");
        } catch (IllegalArgumentException | IOException e) {
            System.out.println("Erro ao abrir o arquivo: " + e.getMessage());
        }
    }

    public static void abrirArquivo(String caminho) throws IllegalArgumentException, IOException{
        if (caminho == null) {
            throw new IllegalArgumentException("Caminho do arquivo não pode ser nulo.");
        }
         if (caminho.isEmpty()) {
            throw new IllegalArgumentException("Caminho do arquivo não pode ser vazio.");
        }

        File arquivo = new File(caminho);  
     
        try(FileReader leitor = new FileReader(arquivo)){
            System.out.println("Arquivo aberto com sucesso!");
        }
    }
}

    
