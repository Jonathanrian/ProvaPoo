package Questão02;

public class Governador extends Politico{
    private String estado;

    public Governador(String nome, int idade, String cpf, String estadoCivil, String partido, String estado) {
        super(nome, idade, cpf, estadoCivil, partido);
        this.estado = estado;
    }

    public Governador(Pessoa pessoa, String partido, String estado) {
        super(pessoa, partido);
        this.estado = estado;
    }

    @Override
    public String toString() {
        return super.toString() + "\nGovernador do estado: " + estado;
    }


}
