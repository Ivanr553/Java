
package homework2;

import java.util.ArrayList;
import java.util.List;

public class Homework2 {
    
    public static void main (String args []) {
        System.out.println(payCalculation(15));
    }

    public static List<Float> payCalculation(int term) {
        List<Float> payments = new ArrayList<Float>();
        float pay;
        for(int i = 0; i < term; i++) {
            pay = (float)(Math.pow(2, i))/100;
            payments.add(pay);
        }
        return payments;
    }
    
}
