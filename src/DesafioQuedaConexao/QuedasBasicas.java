package DesafioQuedaConexao;

import java.util.Scanner;

public class QuedasBasicas {

    public static String verificarQuedaConexao(String[] velocidades) {
        for (String velocidade : velocidades) {
            try {
                int valor = Integer.parseInt(velocidade.trim());
                if (valor == 0) {
                    return "Queda de Conexão";
                }
            } catch (NumberFormatException e) {
                return "Entrada inválida: todas as velocidades devem ser números inteiros.";
            }
        }
        return "Sem Quedas";
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite as velocidades de conexão registradas a cada hora, separadas por vírgula:");
        String input = scanner.nextLine();

        if (input.trim().isEmpty()) {
            System.out.println("Nenhuma velocidade foi fornecida.");
        } else {
            String[] velocidades = input.split(",");

            String resultado = verificarQuedaConexao(velocidades);

            System.out.println(resultado);
        }

        scanner.close();
    }
}
