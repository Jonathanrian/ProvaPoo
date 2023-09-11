package Questão01;

import java.util.Objects;

public class Clientes {
    private int id;
    private int idade;
    private String nome;
    private String telefone;

    public Clientes(int id, String nome, int idade, String telefone) {
        this.id = id;
        this.nome = Objects.requireNonNull(nome, "Nome inválido!");
        setIdade(idade);
        setTelefone(telefone);
    }

    //verific1ando a idade e apresentando uma mensagem de erro caso a idade seja menor 0 ou maior que 125
    public void setIdade(int idade) {
        if (idade < 0 || idade > 125) {
            throw new IllegalArgumentException("Idade inválida!");
        }
        this.idade = idade;
    }

    //verificando o telefone
    public void setTelefone(String telefone) {
        if (telefone.length() != 11 && telefone.length() != 9) {
            throw new IllegalArgumentException("Telefone inválido!");
        }
        this.telefone = telefone;
    }

    @Override
    public String toString() {
        return "\nid: " + id + "\nNome: " + nome + "\nIdade: " + idade + "\nTelefone: " + telefone +"\n";
    }
}
