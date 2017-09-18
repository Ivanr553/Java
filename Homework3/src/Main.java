
import javax.swing.JOptionPane;


public class Main {
    
    
    public static void main(String args []) {
        //Initializing method to run program
        display();
        
    }
    
    public static void display() {
        
        //Creation of JOptionPane variable
        JOptionPane pane = new JOptionPane();
        
        //Accepting inputs for parameters of calculation method (as strings)
        String sharesIn = pane.showInputDialog(null, "Input the amount of shares purchased:");
        String priceBoughtIn = pane.showInputDialog(null, "Input the price of purchased stock:");
        String priceSoldIn = pane.showInputDialog(null, "Input the price the stock was sold:");
        String commissionIn = pane.showInputDialog(null, "Input the commission for the stock purchase and sale:");
        
        //Turning the inputs into floats and ints
        int shares = Integer.parseInt(sharesIn);
        float priceBought = Float.parseFloat(priceBoughtIn);
        float priceSold = Float.parseFloat(priceSoldIn);
        float commission = Float.parseFloat(commissionIn);
        
        //Displaying the answers as message dialogs
        pane.showMessageDialog(null, 
                "The amount paid for the purchase was: " + calculatePaid(shares, priceBought) + "\n"
                + "The amount paid for commission for the purchase was: " + calculateCommissionPurchase(shares, priceBought, commission) + "\n"
                + "The amount the stock was sold for was: " + calculateSold(shares, priceSold) + "\n"
                + "The amount of commission paid for the sale was: " + calculateCommissionSold(shares, priceSold, commission) + "\n"
                + "The profit for the purchase was: " + calculateProfit(shares, priceBought, priceSold, commission) + "\n"
                + "Since the profit was " + calculateProfit(shares, priceBought, priceSold, commission) + "Joe...");
    }
    
    public static float calculatePaid(int shares, float priceBought) {
        return shares * priceBought;
    }

    public static float calculateCommissionPurchase(int shares, float priceBought, float commission) {
        return (shares * priceBought) * (commission / 100);
    }
    
    public static float calculateSold(int shares, float priceSold) {
        return shares * priceSold;
    }
    
    public static float calculateCommissionSold(int shares, float priceSold, float commission) {
        return (shares * priceSold) * (commission / 100);
    }
    
    public static float calculateProfit(int shares, float priceBought, float priceSold, float commission) {
        float paid = (shares * priceBought);
        float sold = (shares * priceSold);
        float commissionBought = paid * (commission / 100);
        float commissionSold = sold * (commission / 100);
        return sold - paid - commissionBought - commissionSold;
    }
    
}
