import java.util.Scanner;

public class MonitoramentoDadosMoveis {

    // Função para verificar o consumo em relação ao limite do plano
    public static void verificarConsumo(double limiteGB, int consumoMB) {
        // Converte o limite mensal de gigabytes (GB) para megabytes (MB)
        int limiteMB = (int) (limiteGB * 1024);

        // Verifica se o consumo excedeu o limite
        if (consumoMB > limiteMB) {
            System.out.println("Limite de dados excedido. Compre ou renove seu pacote.");
        } else {
            int dadosDisponiveis = limiteMB - consumoMB;
            System.out.println("Voce ainda possui " + dadosDisponiveis + " MB disponiveis.");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Lê o limite mensal de dados em GB
        System.out.println("Digite o limite mensal de dados em GB:");
        double limiteGB = scanner.nextDouble();

        // Lê o consumo total de dados móveis em MB
        System.out.println("Digite o consumo total de dados móveis em MB:");
        int consumoMB = scanner.nextInt();

        // Chama a função para verificar o consumo
        verificarConsumo(limiteGB, consumoMB);
    }
}
