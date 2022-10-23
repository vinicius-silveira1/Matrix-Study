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

        msg = "Matrix = \n\n";

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                matrix[i][j] = Integer.parseInt(JOptionPane.showInputDialog("Type a number to position " + i + "and " + j));
                msg = msg + matrix[i][j] + "  ";
            }
        }
    }
}
