import java.util.*;

public class BMI {
    public static void main (String args[]) {
    double g;
    double masse;
    double bmi;
    
    Scanner konsole = new Scanner(System.in);
    
    System.out.println("K�rpergewicht in Kilogramm?");
    masse = konsole.nextDouble();
    System.out.println("K�rpergr��e in Metern?");
    g = konsole.nextDouble();
    
    bmi = masse / Math.pow(g, 2);
    
    System.out.println((int)bmi);
    }
}