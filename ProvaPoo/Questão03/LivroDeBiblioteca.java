package Questão03;

public  class LivroDeBiblioteca extends Livro implements ItemDeBiblioteca{
    private boolean emprestado;
    private String localizacao;

    public LivroDeBiblioteca(String titulo, String autor, int numeroDePaginas, int anoDeEdicao, boolean emprestado,
        String localizacao) {
        super(titulo, autor, numeroDePaginas, anoDeEdicao);
        this.localizacao = localizacao;
    }

    @Override
    public boolean estaEmprestado(){
        return emprestado;
    }

    @Override
    public void empresta(){
        emprestado = true;
    }

    @Override
    public void devolver() {
        emprestado = false;
    }

    @Override
    public String localizacao() {
        return localizacao;
    }


    @Override
    public String descricao() {
        return "Livro na localização: " + localizacao;
    }

    @Override
    public String toString() {
        return super.toString() + "\nLocalização: " + localizacao + "\nEmprestimo: " + (emprestado ? "Sim" : "Não");
    }

    
    
    
}
