import javax.swing.JOptionPane;

import java.swing.*;

public class App {
    public static void main(String[] args)  {
        int vector[] = {2, 4, 6, 8, 10};
        int matrix[][] = new int [2][3];
        String msg = "vector = ";


        for (int i = 0; i < vector.length; i++) {
            msg = msg + vector[i] + "  ";
        }
        JOptionPane.showMessageDialog(null, msg);
    }
}
