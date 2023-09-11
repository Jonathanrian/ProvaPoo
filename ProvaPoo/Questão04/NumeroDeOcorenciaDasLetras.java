package Questão04;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class NumeroDeOcorenciaDasLetras {
    public static void main(String[] args) {
        String inputString = "VAMOS VIVER A VIDA";
        //converter a string para não sensivel a maiuscula/minuscula
        inputString = inputString.toUpperCase(); 

        // Crie um mapa 
        Map<Character, Integer> contadorDeLetras = new HashMap<>();

        // contando as ocorrências de cada letra
        for (char letra : inputString.toCharArray()) {
            // Verificar se realmente é uma letra
            if (Character.isLetter(letra)) { 
                contadorDeLetras.put(letra, contadorDeLetras.getOrDefault(letra, 0) + 1);
            }
        }

        // ordenar o mapa alfabética
        Map<Character, Integer> mapaOrdenado = new TreeMap<>(contadorDeLetras);

        // Exiba os resultados
        for (Map.Entry<Character, Integer> entrada : mapaOrdenado.entrySet()) {
            char letra = entrada.getKey();
            int contagem = entrada.getValue();
            System.out.println(letra + ": " + contagem);
        }
    }
}
