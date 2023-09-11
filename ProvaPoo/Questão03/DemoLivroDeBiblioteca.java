package Questão03;

public class DemoLivroDeBiblioteca {
    public static void main(String[] args) {
       LivroDeBiblioteca livro = new LivroDeBiblioteca("As aventuras de Poo", "jonathan Ryan", 200, 2023, false, "Corredor 2, partilheira 1");
       
       System.out.println("Informações do livro:");
       System.out.println(livro);
        
       System.out.println("Status de Emprestimo: " + (livro.estaEmprestado() ? "Emprestado" : "Disponivel"));

       livro.empresta();

       System.out.println("Status de Emprestimo: " + (livro.estaEmprestado() ? "Emprestado" : "Disponivel"));

       livro.devolver();


    }
}
