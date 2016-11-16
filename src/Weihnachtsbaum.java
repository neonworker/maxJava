import java.util.*;

public class Weihnachtsbaum {
  public static void main (String args[]) {


        int hight, dis, anz = -1, ver = 0;
        Scanner sc = new Scanner (System.in);
        System.out.println("Höhe des Weihnachtsbaumes?");
        hight = sc.nextInt();
        dis = (hight + hight + 1) / 2;

    for (int i = 0; i <= hight ;i++ ) {

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