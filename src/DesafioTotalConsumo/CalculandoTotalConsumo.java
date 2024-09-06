package DesafioTotalConsumo;

import java.util.Scanner;

public class CalculandoTotalConsumo {

    // Função para calcular o consumo total de dados móveis
    public static int calcularConsumoTotal(String[] consumoSemanal) {
        int totalConsumo = 0;

        // Itera sobre o array de strings e soma o consumo convertido para inteiro
        for (String consumo : consumoSemanal) {
            totalConsumo += Integer.parseInt(consumo);
        }

        return totalConsumo;
    }

    // Função para calcular a média semanal de consumo
    public static int calcularMediaSemanal(int totalConsumo, int semanas) {
        return totalConsumo / semanas;
    }

    // Função para identificar a semana de maior consumo
    public static int identificarSemanaMaiorConsumo(String[] consumoSemanal) {
        int maiorConsumo = 0;
        int semanaMaiorConsumo = 0;

        // Itera sobre o array para encontrar o maior valor e a semana correspondente
        for (int i = 0; i < consumoSemanal.length; i++) {
            int consumo = Integer.parseInt(consumoSemanal[i]);
            if (consumo > maiorConsumo) {
                maiorConsumo = consumo;
                semanaMaiorConsumo = i + 1; // Considera que a semana 1 é o índice 0
            }
        }

        return semanaMaiorConsumo;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Lê a entrada do usuário (consumo semanal separado por vírgulas)
        System.out.println("Digite o consumo semanal separado por vírgulas:");
        String entrada = scanner.nextLine();
        String[] consumoSemanal = entrada.split(",");

        // Calcula o consumo total de dados móveis no mês
        int totalConsumo = calcularConsumoTotal(consumoSemanal);

        // Calcula a média semanal de consumo de dados móveis
        int mediaSemanal = calcularMediaSemanal(totalConsumo, consumoSemanal.length);

        // Identifica a semana de maior consumo
        int semanaMaiorConsumo = identificarSemanaMaiorConsumo(consumoSemanal);

        // Exibe a saída formatada
        System.out.println("Total mensal: " + totalConsumo + " MB");
        System.out.println("Media semanal: " + mediaSemanal + " MB");
        System.out.println("Maior consumo: Semana " + semanaMaiorConsumo);
    }
}
