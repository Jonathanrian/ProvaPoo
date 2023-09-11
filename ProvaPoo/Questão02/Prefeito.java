package Questão02;

public class Prefeito extends Politico {
    private String cidade;

    public Prefeito(String nome, int idade, String cpf, String estadoCivil, String partido, String cidade) {
        super(nome, idade, cpf, estadoCivil, partido);
        this.cidade = cidade;
    }

    public Prefeito(Pessoa pessoa, String partido, String cidade) {
        super(pessoa, partido);
        this.cidade = cidade;
    }

    @Override
    public String toString() {
        return super.toString() + "\nPrefeito da cidade: " + cidade;
    }

    
}
