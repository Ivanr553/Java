import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class Activity {
    
    public static void main (String args []) {
        //Create selection object for two different activities
        JPanel intro = new JPanel();
        Object[] options1 = {
            "Three Numbers",
            "Circle Calculation"
        };
        
        //Creating the selection window pane
        intro.add(new JLabel("Select your program"));
        int selection = JOptionPane.showOptionDialog(null, intro, "Activity 1",
                JOptionPane.YES_NO_OPTION, JOptionPane.PLAIN_MESSAGE, null, options1, null);
        
        //Running different programs depending on selection
        if(selection == JOptionPane.YES_OPTION) {
            ThreeNumbers.ThreeNumbers();
        }
        else if(selection == JOptionPane.NO_OPTION) {
            Circle.Circle();
        }
    }
    
}
