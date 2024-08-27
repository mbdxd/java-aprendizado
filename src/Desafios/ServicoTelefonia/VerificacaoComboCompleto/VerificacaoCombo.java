package Desafios.ServicoTelefonia.VerificacaoComboCompleto;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class VerificacaoCombo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String entradaCliente = scanner.nextLine().trim();
        scanner.close();

        Set<String> servicosNecessarios = new HashSet<>();
        servicosNecessarios.add("movel");
        servicosNecessarios.add("banda larga");
        servicosNecessarios.add("tv");

        String[] servicosContratados = entradaCliente.split(",");
        Set<String> contratados = new HashSet<>();
        for (String servico : servicosContratados) {
            contratados.add(servico.trim());
        }

        if (contratados.containsAll(servicosNecessarios)) {
            System.out.println("Combo Completo");
        } else {
            System.out.println("Combo Incompleto");
        }
    }
}
