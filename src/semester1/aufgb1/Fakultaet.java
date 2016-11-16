package semester1.aufgb1;

import java.util.*;

public class Fakultaet {
  public static void main (String args[]) {
    int eingabe;
    int ergebnis = 1;
    int anzahl = 0;
    Scanner konsole = new Scanner(System.in);
    
    System.out.println("Basis der Fakult?t?");
    eingabe = konsole.nextInt();
    
    while (anzahl < eingabe) {
      anzahl++;       
      ergebnis = (eingabe - (eingabe - anzahl)) * ergebnis;
    } 
    
    System.out.println(ergebnis);
  }
}    