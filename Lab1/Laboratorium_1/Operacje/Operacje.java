class KlasaA {
    int wartoscA = 10;
    int wartoscB = 5;

    public void wypisz(int a, int b) {
        System.out.println(a + ", " + b);
    }
}

class Kalkulator {
    public int dodaj(int a, int b) {
        return a + b;
    }

    public int odejmij(int a, int b) {
        return a - b;
    }

    public int pomnoz(int a, int b) {
        return a * b;
    }

    public int podziel(int a, int b) {
        return a / b;
    }
}

// -------------------------------------------------------
public class Operacje {
    public static void main(String[] args) {

        /*
         * 
         * // Błąd! Trzeba stworzyć obiekt klasy int a = KlasaA.wartoscA;
         * 
         * // Również błąd, musimy stworzyć obiekt i na nim operować wartoscA = 5;
         */

        // Tworzenie instancji klasy 'KlasaA'
        KlasaA klasa = new KlasaA();

        klasa.wartoscA = 8;
        klasa.wartoscB = 2;

        // Tworzymy instancję klasy Kalkulator
        Kalkulator kalkulator = new Kalkulator();

        // pobieramy wartości zadeklarowane w klasie 'KlasaA' i przekazujemy jako
        // parametry do funkcji
        int razem = kalkulator.dodaj(klasa.wartoscA, klasa.wartoscB);
        int odjete = kalkulator.odejmij(klasa.wartoscA, klasa.wartoscB);
        int pomnozone = kalkulator.pomnoz(klasa.wartoscA, klasa.wartoscB);
        int podzielone = kalkulator.podziel(klasa.wartoscA, klasa.wartoscB);

        System.out.println(razem);
        System.out.println(odjete);
        System.out.println(pomnozone);
        System.out.println(podzielone);
        klasa.wypisz(klasa.wartoscA, klasa.wartoscB);
    }
}