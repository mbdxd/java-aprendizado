package DesafiosVelocidaMedia;

import java.util.Scanner;

public class VelocidadeConexao {

    public static double calcularVelocidadeMedia(String[] velocidades) {
        int total = 0;
        int n = velocidades.length;
        for (int i = 0; i < n; i++) {
            int velocidade = Integer.parseInt(velocidades[i].trim());
            total += velocidade;
        }

        double media = (double) total / n;
        return media;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite as velocidades de conexão registradas, separadas por vírgula:");
        String input = scanner.nextLine();

        String[] velocidades = input.split(",");

        double velocidadeMedia = calcularVelocidadeMedia(velocidades);

        System.out.println((int) velocidadeMedia + " Mbps");

        scanner.close();
    }
}
