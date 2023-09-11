package Questão01;

import java.util.ArrayList;
import java.util.Scanner;

public class DemoClientes {
    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);

        ArrayList<Clientes> clientes = new ArrayList<>();

        int id;
        int idade;
        String nome;
        String telefone;

        do {

            System.out.print("\nDigite seu id: "); //informar o id
            id = ent.nextInt();

            if (id < 0) {
                break; // encerrar o loop, caso o id seja negativo
            }

            System.out.print("Digite seu nome: ");
            nome = ent.next();

            System.out.print("Digite sua idade: ");
            idade = ent.nextInt();

            System.out.print("Digite seu telefone de 11 digitos: ");
            telefone = ent.next();

            Clientes cliente = new Clientes(id, nome, idade, telefone);

            clientes.add(cliente);
            
        } while (true);

        for (Clientes cadaCliente : clientes) {
            System.out.println(cadaCliente.toString());
        }

        ent.close();
    }
}
