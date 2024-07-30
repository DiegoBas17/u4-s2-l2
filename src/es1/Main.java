package es1;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Set<String> paroleSet = new HashSet<>();
        List<String> paroleDuplicate = new ArrayList<>();

        System.out.println("inserisci il numero di elementi da inserire.");
        int nDaInserire = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < nDaInserire; i++) {
            System.out.println("inserisci una parola");
            String parolaCorrente = scanner.nextLine();
            if (paroleSet.contains(parolaCorrente)) {
                paroleDuplicate.add(parolaCorrente);
            } else {
                paroleSet.add(parolaCorrente);
            }
        }

        System.out.println("Parole duplicate:");
        for (String dup : paroleDuplicate) {
            System.out.println(dup);
        }
        System.out.println("Il numero di parole distinte è: " + paroleSet.size());

        System.out.println("elenco delle parole distinte:");
        for (String parolaCorrente : paroleSet) {
            System.out.println(parolaCorrente);
        }
    }
}