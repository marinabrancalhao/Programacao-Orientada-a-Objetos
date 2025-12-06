/*
Você está ajudando a montar uma biblioteca digital.
Crie uma classe Livro com atributos como título, autor e número de páginas, além de um método para exibir detalhes do livro.
Assim, os usuários poderão explorar suas leituras de forma mais fácil.
*/

public class Livro {

    private String titulo;
    private String autor;
    private int numeroPaginas;

    public Livro(String titulo, String autor, int numeroPaginas){

        this.titulo = titulo;
        this.autor = autor;
        this.numeroPaginas = numeroPaginas;
    }
    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public int getNumeroPaginas() {
        return numeroPaginas;
    }

}
