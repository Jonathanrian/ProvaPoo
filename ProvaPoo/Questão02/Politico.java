package Questão02;

public class Politico extends Pessoa {
    private String partido;

    public Politico(String nome, int idade, String cpf, String estadoCivil, String partido) {
        super(nome, idade, cpf, estadoCivil);
        this.partido = partido;
    }

    public Politico(Pessoa pessoa, String partido) {
        super(pessoa.getNome(), pessoa.getIdade(), pessoa.getCpf(), pessoa.getEstadoCivil());
        this.partido = partido;
    }

    public String getPartido() {
        return partido;
    }

    @Override
    public String toString() {
        return super.toString() + " \nPartido: " + partido;
    }
    
}
