package homework1;

import javax.swing.JOptionPane;

public class Homework1 {

    public static void main(String[] args) {
        
        //Accept inputs for interest calculations
        String input1 = JOptionPane.showInputDialog(null, "Input the principal: ");
        int principal = Integer.parseInt(input1);
        System.out.println("Principa;: " + principal);
        
        String input2 = JOptionPane.showInputDialog(null, "Input the term length: ");
        int term = Integer.parseInt(input2);
        System.out.println("Term: " + term);
        
        String input3 = JOptionPane.showInputDialog(null, "Input the interest rate: ");
        float rate_raw = Float.parseFloat(input3);
        float rate = rate_raw / 100;
        System.out.println("Rate: " + rate_raw + "%");
        
        
        //Use interest method to calculate interest
        double result = interest(principal, rate, term);
        
        //Display result
        JOptionPane.showMessageDialog(null, "Your monthly interest payment will be: " + result);
        
    }
    
    
    //Interest calculation method
    public static double interest(int principal, float rate, float term) {
        //Calculation
        float upper = principal * rate;
        double lower = (1 - Math.pow((rate + 1), -term));
        double result_raw = upper / lower;
        
        //Rounding raw results
        long result = Math.round(result_raw);
        
        //Returning rounded result
        return result;
    }
    
}
