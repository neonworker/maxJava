import java.util.*;

public class  Satellit {
  public static void main (String args[]) {
    int zeit, tage, std, min, sek, rest;
    String wunsch;
    
    Scanner konsole = new Scanner(System.in);
    
    do {
      System.out.println("Zeit in Sekunden?");
      zeit = konsole.nextInt();
      rest = zeit;
       
      if (zeit >= 82800) {
        tage = zeit / 86400;
        rest = zeit - tage * 86400;
        System.out.println(tage + " Tage");
      } 
    
      if (rest >= 3600) {
        std = rest / 3600;
        rest = rest - std * 3600;
        System.out.println(std + " Stunden");
      }
    
      if (rest >= 60) {
        min = rest / 60;
        rest = rest - min * 60;
        System.out.println(min + " Minuten");
      } 
      if (rest > 0) {
        sek = rest;
        System.out.println(sek + " Sekunden");
      } 
      
      System.out.println("Noch weitere Intervalle?");
      wunsch = konsole.next();
    } while (wunsch.equals("ja")); // end of do-while
    
  }
}     