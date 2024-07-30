package es3;

import java.util.HashMap;

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
    
    public void getPersonaWithNumber() {
        for (int i = 0; i < ; i++) {
            
        }
    }

    @Override
    public String toString() {
        return "Rubrica{" +
                "rubrica=" + rubrica +
                '}';
    }
}
