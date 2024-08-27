package Desafios.ServicoTelefonia.VerificacaoComboCompleto;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.stream.Collectors;

public class VerificandoSet {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Set<String> setItens = new HashSet<>();
        setItens.add("Faca statik");
        setItens.add("Mata krakens");
        setItens.add("Lamina de dorans");

        String itensFormatados = setItens.stream().collect(Collectors.joining(", ", "", ""));

        System.out.println("Quais desses itens: "+ itensFormatados +", você tem?");
        String temItens = scanner.nextLine().trim();
        scanner.close();

        String[] itensUsuario = temItens.split(",");

        Set<String> mochila = new HashSet<>();
        for (String item : itensUsuario) {
            mochila.add(item.trim());
        }

        System.out.println("Itens que você possui: ");
            for (String item : mochila) {
                System.out.println("- " + item);
            }

        if (mochila.containsAll(setItens)) {
            System.out.println("Você tem todos os itens!");
        } else {
            System.out.println("Ainda falta itens necessários!");
        }

    }
}
