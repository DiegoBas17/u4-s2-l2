package es3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Rubrica {
    private HashMap<String, Integer> rubrica;

    public Rubrica() {
        rubrica = new HashMap<>();
    }

    /*METODI*/
    public void inserisciContatto(String nome, int telefono) {
        rubrica.put(nome, telefono);
        System.out.println("Contatto aggiunto: " + nome + " con numero: " + telefono);
    }

    public void cancellaContatto(String nome) {
        if (rubrica.containsKey(nome)) {
            rubrica.remove(nome);
            System.out.println("Contatto rimosso: " + nome);
        } else {
            System.out.println("Il contatto " + nome + " non esiste.");
        }
    }

    public void getPersonaWithNumber(int numero) {
        List<String> nomi = new ArrayList<>(rubrica.keySet());
        boolean trovato = false;
        for (int i = 0; i < nomi.size(); i++) {
            String nome = nomi.get(i);
            if (rubrica.get(nome) == numero) {
                System.out.println("Persona con numero " + numero + ": " + nome);
                trovato = true;
                break;
            }
        }
        if (!trovato) {
            System.out.println("Nessuna persona trovata con il numero: " + numero);
        }
    }

    public void getNumberwithName(String name) {
        System.out.println("Il numero della persona: " + name + " è " + this.rubrica.get(name));
    }
    

    @Override
    public String toString() {
        return "Rubrica{" +
                "rubrica=" + rubrica +
                '}';
    }

}
