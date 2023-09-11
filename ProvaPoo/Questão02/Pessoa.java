package Questão02;

public class Pessoa {
    private String nome;
    private int idade;
    private String cpf;
    private String estadoCivil;

    public Pessoa(String nome, int idade, String cpf, String estadoCivil) {
        this.nome = nome;
        this.idade = idade;
        this.cpf = cpf;
        this.estadoCivil = estadoCivil;
    }


    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public String getCpf() {
        return cpf;
    }

    public String getEstadoCivil() {
        return estadoCivil;
    }

    @Override
    public String toString() {
        return "Nome: " + nome + "\nIdade: " + idade + "\nCPF: " + cpf + "\nEstadoCivil: " + estadoCivil;
    }

    
}
