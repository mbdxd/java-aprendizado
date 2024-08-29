package Consolidando;

import java.util.*;

public class MaterialEscolar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Set<String> MateriaisEscolares = new HashSet<>();
        MateriaisEscolares.add("Lápis");
        MateriaisEscolares.add("Borracha");
        MateriaisEscolares.add("Caneta");
        MateriaisEscolares.add("Apontador");
        MateriaisEscolares.add("Caderno");
        MateriaisEscolares.add("Garrafinha");

        String MateriaisFormatados = String.join(", ", MateriaisEscolares);

        System.out.println(MateriaisFormatados);
        System.out.println("Digite o seu:");
        String MateriaisEscolhidos = scanner.nextLine().trim();
        scanner.close();

        String[] osMateriais = MateriaisEscolhidos.split(",");
        Set<String> Mochila = new HashSet<>();
        for (String materiais : osMateriais) {
            Mochila.add(materiais.trim());
        }


        System.out.println(Arrays.toString(osMateriais));
    }
}

