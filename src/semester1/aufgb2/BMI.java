package semester1.aufgb2;

public class BMI {
    public static void main (String args[]) {
        double g;
        double masse;
        double bmi;

        masse = Double.parseDouble(javax.swing.JOptionPane.showInputDialog(null, "Bitte Koerpergewicht in Kilogramm eingeben:"));
        g = Double.parseDouble(javax.swing.JOptionPane.showInputDialog(null, "Bitte Koerpergroeﬂe in Metern eingeben:"));

        bmi = masse / Math.pow(g, 2);

        javax.swing.JOptionPane.showMessageDialog(null, "Der BMI ist: " + (int) bmi);
    }
}