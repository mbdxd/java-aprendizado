package Consolidando;


import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.stream.Collectors;

public class VerificandoListaFruta {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Set<String> setFrutas = new HashSet<>();
        setFrutas.add("Banana");
        setFrutas.add("Melancia");
        setFrutas.add("Uva");
        setFrutas.add("Morango");
        setFrutas.add("Maçã");

        String frutasFormatadas = setFrutas.stream().collect(Collectors.joining(", ", "", ""));

        System.out.println("Quais frutas você vai comprar?");
        System.out.println(frutasFormatadas);
        String comprarFrutas = scanner.nextLine().trim();

        String[] frutasParaComprar = comprarFrutas.split(",");

        Set<String> carrinho = new HashSet<>();
        for ( String fruta : frutasParaComprar) {
            carrinho.add(fruta.trim());

        }
        System.out.println(carrinho);
    }
}
