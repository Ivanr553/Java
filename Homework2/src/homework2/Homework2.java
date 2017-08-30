
package homework2;

import java.awt.Dimension;
import javax.swing.JFrame;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class Homework2 {
    
    
    public static void main (String args []) {
        //Initialization of term length for purpose of input catch
        int term = 0;
        
        //While loop to catch any input that is not valid (see checkParse() method for more clarification of input validation)
        while(term == 0) {
            
            //Creation of dialog pane to accept the term length input from the user
            term = checkParse(JOptionPane.showInputDialog(null, "Input a valid term length"));
        }
        
        //Creation of new JFrame
        JFrame frame = new JFrame();
        frame.setTitle("Pay Calculator");
        frame.setSize(600, 400);
        frame.setResizable(false);
        frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        
        //Creation of new JTable
        DefaultTableModel model = new DefaultTableModel();
        JTable table = new JTable(model);
        table.setPreferredScrollableViewportSize(new Dimension(500, 500));
        table.setFillsViewportHeight(true);
        model.addColumn("Day");
        model.addColumn("Payment");
        
        //Creation of table rows with calculation
        payCalculation(term, model);
        
        //Creation of scrolpane for table
        JScrollPane scrollpane = new JScrollPane(table);
        frame.add(scrollpane);
        
        //Set frame visible and display completed table to user
        frame.setVisible(true);
        
    }

    public static void payCalculation(int term, DefaultTableModel model) {
        //Initializing the variable to store the total payment for the term
        int total = 0;
        
        //For loop to iterate through the term length
        for(int i = 0; i <= term; i++) {
            
            //If statement to total the payments for the term and create new row with data
            if(i == term) {
                model.addRow(new Object[] {"Total Payment", total});
            }
            
            //Regular iteration through term
            else {
                
                //Initializing pay variable
                float pay;
                
                //Calculating pay for specific day
                pay = (float)(Math.pow(2, i))/100;
                
                //Creation of object to be added dynamically into row
                Object[] row = {
                    (i+1),
                    pay
                };
                
                //Addition of this days pay to the total payment
                total += pay;
                
                //Addition of row into the table
                model.addRow(row);
            }

        }
    }
    
        //Input validation method to make sure term length is input as an integer
            //Additional Info:
            //Success will feed the input back into the program as is
            //The failure will return a 0, which is not a valid return due 
            //to term length needing to be greater than 0. This will then
            //initiate the re-execution of the while loop since term will
            //have been set to 0
        public static int checkParse(String s) {
            try {
                //Success
                return Integer.parseInt(s);
            } catch(NumberFormatException e) {
                //Failure
                return 0;
            }
    }
    
}
