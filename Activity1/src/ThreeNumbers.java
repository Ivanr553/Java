
import javax.swing.JOptionPane;

public class ThreeNumbers {
    
    Activity checkParse;
    
    public static void ThreeNumbers() {
       
        //Input messages to take in the three numbers and checking to make sure they are numbers
        String input1 = JOptionPane.showInputDialog(null, "Please enter the first number: ");
        int check1 = Activity.checkParse(input1, "ThreeNumbers");
        int num1 = check1;
        
        String input2 = JOptionPane.showInputDialog(null, "Please enter the second number: ");
        int check2 = Activity.checkParse(input2, "ThreeNumbers");
        int num2 = check2;
        
        String input3 = JOptionPane.showInputDialog(null, "Please enter the third number: ");
        int check3 = Activity.checkParse(input3, "ThreeNumbers");
        int num3 = check3;
        
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
