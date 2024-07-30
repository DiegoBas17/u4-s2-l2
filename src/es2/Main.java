package es2;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Set<Integer> numeriRandom = new TreeSet<>();
        Random random = new Random();
        System.out.println("inserisci il numero di numeri casuali che vuoi visualizzare");
        int numeriDaVisualizzare = scanner.nextInt();
        for (int i = 0; i < numeriDaVisualizzare; i++) {
            int numeroCasuale = random.nextInt(100);
            numeriRandom.add(numeroCasuale);
        }
        System.out.println("Numeri random ordinati:");
        System.out.println(numeriRandom);

        List<Integer> listaNumeri = new ArrayList<>(numeriRandom);
        List<Integer> listaInversa = visualizzaInverso(listaNumeri);
        System.out.println("Lista al contrario: " + listaInversa);

        stampaValoriParioDispari(listaNumeri, true);
        stampaValoriParioDispari(listaNumeri, false);
    }

    public static List<Integer> visualizzaInverso(List<Integer> listIniziale) {
        List<Integer> listaInversa = new ArrayList<>();
        for (int i = listIniziale.size() - 1; i >= 0; i--) {
            listaInversa.add(listIniziale.get(i));
        }
        return listaInversa;
    }

    public static void stampaValoriParioDispari(List<Integer> lista, boolean pariDispari) {
        if (pariDispari) {
            System.out.println("I valori pari sono:");
            for (int i = 0; i < lista.size(); i += 2) {
                System.out.println(lista.get(i));
            }
        } else {
            System.out.println("I valori in posizioni dispari:");
            for (int i = 1; i < lista.size(); i += 2) {
                System.out.println(lista.get(i));
            }
        }
    }
}
