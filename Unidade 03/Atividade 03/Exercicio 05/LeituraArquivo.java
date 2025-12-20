/*
Leitura de Arquivo
Implemente um método que tente ler um arquivo. 
Use um bloco try-catch para capturar a exceção FileNotFoundException e exibir uma mensagem informativa caso o arquivo não seja encontrado.
*/

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class LeituraArquivo {
    
    public static void main(String[] args) {
        
        lerArquivo("arquivo.text");
    }

    public static void lerArquivo(String nomeArquivo){

        try {
            File arquivo = new File(nomeArquivo);
            Scanner scanner = new Scanner(arquivo);
        } catch (FileNotFoundException e) {
            System.out.println("Erro: Arquivo não encontrado no caminho especificado.");
        }
    }
}
