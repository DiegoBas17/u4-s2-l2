package es3;

public class Main {
    public static void main(String[] args) {
        Rubrica rubrica = new Rubrica();
        rubrica.inserisciContatto("Gabriel", 11111);
        rubrica.inserisciContatto("Eddy", 22222);
        rubrica.inserisciContatto("Arianna", 33333);
        rubrica.inserisciContatto("Yuri", 44444);

        System.out.println(rubrica);
        rubrica.cancellaContatto("Eddy");
        System.out.println(rubrica);
    }

}
