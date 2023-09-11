package Questão03;

public abstract class Livro {
    private String titulo;
    private String autor;
    private int numeroDePaginas;
    private int anoDeEdicao;

    
    public Livro(String titulo, String autor, int numeroDePaginas, int anoDeEdicao) {
        this.titulo = titulo;
        this.autor = autor;
        this.numeroDePaginas = numeroDePaginas;
        this.anoDeEdicao = anoDeEdicao;
    }

    public String qualTitulo(){
        return titulo;
    }

    public String qualAutor(){
        return autor;
    }

    @Override
    public String toString() {
        return "Titulo: " + titulo + ", Autor: " + autor + ", NumeroDePaginas: " + numeroDePaginas + ", AnoDeEdicao: " + anoDeEdicao;
    }

    
}
