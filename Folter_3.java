import java.util.*;

public class Lotto {
  public static void main (String args[]) {
    int nummer = 0;
    int eingabe;
    int gezogen;
    int richtige = 0;
    
    Random r = new Random();
    
    Scanner konsole = new Scanner(System.in);
    
    while (nummer < 6) { 
      nummer++;
      System.out.println(nummer + ". Zahl?");
      eingabe = konsole.nextInt();
      
      gezogen = 1 + Math.abs(r.nextInt()) % 49;
      
      if (eingabe == gezogen) {
        richtige++;
        System.out.println("Die " + nummer + ". gezogene Zahl ist " + gezogen + " und somit die " + richtige + ". richtige Zahl.");
        }
      else {
        System.out.println("Die " + nummer + ". gezogene Zahl ist " + gezogen + " und somit nicht übereinstimmend.");       
      }
    } 
  }
}    