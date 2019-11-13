import java.util.Date;

/**
 * Tutaj umieszczamy komentarz opisujacy klase, np. Klasa ilustrujaca
 * umieszczanie kodu do automatycznie generowanej dokumentacji
 * 
 * @version 0.1
 * @author Jan Kowalski
 * @author Janina Kowalska
 */

public class DocTest {
  int i = 5;

  /**
   * Skladowa do przechowywania daty
   * 
   * @see java.util.Date
   */

  // -------------------------------------------------------------
  /**
   * Glowna metoda klasy uruchamiajaca test
   * 
   * @param args tablica lancuchow pobierana z wiersza polecen
   * @return nie zwraca wartosci
   * @exception exception Brak zgłaszanych wyjatkow
   */
  public static void main(String[] args) {

    // DateFormat mojaData = new SimpleDateFormat("yyyy/MM/dd");
    Date dzisiaj = new Date();
    System.out.println(dzisiaj.toString());

  }
}
