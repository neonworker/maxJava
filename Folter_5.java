import java.util.*;

public class quadratische_Gleichung {
  public static void main (String args[]) {
    int höhe, dis, anz = -1, ver = 0;
    Scanner sc = new Scanner (System.in);
    System.out.println("Höhe des Weihnachtsbaumes?");
    höhe = sc.nextInt();
    dis = (höhe + höhe + 1) / 2;
    for (int i = 0; i <= höhe ;i++ ) {
      for (ver = 0; dis > ver ; ver++ ) {
        System.out.print(".");
      } 
      anz = anz +2;
      for (ver = 0; anz > ver ; ver++ ) {
        System.out.print("*");
      } 
      for (ver = 0; dis > ver ; ver++ ) {
        System.out.print(".");
      } 
      dis = dis - 1;
      System.out.println(); 
    }
  }
}      