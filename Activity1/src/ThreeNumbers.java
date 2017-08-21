
import java.awt.event.WindowAdapter;
import javafx.stage.WindowEvent;
import javax.swing.JDialog;
import javax.swing.JOptionPane;

public class ThreeNumbers {
    
    public static void ThreeNumbers() {
       
        //Input messages to take in the three numbers
        int num1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Please enter the first number: "));
        int num2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Please enter the second number: "));
        int num3 = Integer.parseInt(JOptionPane.showInputDialog(null, "Please enter the third number: "));
        
        //Manipulation of data
        int sum = num1 + num2 + num3;
        int product = num1 * num2 * num3;
        
        //Creation of dialog window with answer
        JOptionPane.showMessageDialog(null, 
                "The sum of the numbers is: " + sum + 
                "\nThe product of the numbers is: " + product
        );
    }
    
}
