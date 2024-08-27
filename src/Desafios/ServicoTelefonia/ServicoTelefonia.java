package Desafios.ServicoTelefonia;

import java.util.Scanner;

public class ServicoTelefonia {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String servicoDesejado = scanner.nextLine().trim();
        String entradaCliente = scanner.nextLine().trim();

        String[] dadosCliente = entradaCliente.split(",");
        String nomeCliente = dadosCliente[0];
        boolean contratouServico = false;

        for (int i = 1; i < dadosCliente.length; i++) {
            if (dadosCliente[i].equalsIgnoreCase(servicoDesejado)) {
                contratouServico = true;
                break;
            }
        }

        if (contratouServico) {
            System.out.println("Sim");
        } else {
            System.out.println("Nao");
        }

        scanner.close();
    }
}
