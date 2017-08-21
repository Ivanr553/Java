
import java.text.DecimalFormat;
import javax.swing.JOptionPane;

public class Circle {
    
    public static void Circle() {
        
        //Dialog window for input
        int r = Integer.parseInt(JOptionPane.showInputDialog(null, "Input a radius for the circle and hit enter: "));
        
        //Manipulation of input for calculation
        DecimalFormat df = new DecimalFormat("#.#");
        
        int diameter = Integer.parseInt(df.format(r*2));
        double circumference = Double.parseDouble(df.format(2*r*Math.PI));
        double area = Double.parseDouble(df.format(r*r*Math.PI));
        
        //Output message
        JOptionPane.showMessageDialog(null, 
                "The diameter of the circle is: " + diameter +
                "\nThe circumference of the circle is: " + circumference +
                "\nThe area of the circle is: " + area
        );
    }
    
}
