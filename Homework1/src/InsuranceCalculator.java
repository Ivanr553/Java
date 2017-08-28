
import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;

/*
Program Name: Homework1.java
Programmer: Ivan Raffucci
Date: 8/25/17
Version 1.0
Description: This program is an insurance calculator. It creates a GUI JFrame
that will take in three inputs from the user: principal, rate, and term length. The
rate is input as a raw float multiplied by 100 (ex. 5.75% interest rate is 
input into the program as 5.75). After the inputs are properly keyed in, pressing
the button "Calculate" will display the Monthly Interest Payment in the Output
panel. You can then reset the inputs and outputs by pressing the "Reset" button.
 */
public class InsuranceCalculator extends javax.swing.JFrame {
    
    //Main method that calls the InsuranceCalculator for the Insurance Calculator
    public static void main(String args[]) {
        //Calling the GUI Initiator
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InsuranceCalculator().setVisible(true);
            }
        });
    }
    
    //Initiator of the GUI
    public InsuranceCalculator() {
        initComponents();
    }
    
    //Interest calculation method
    public void interest() {
        int principal;
        float rate, term;
        //Setting Variables
        principal = Integer.parseInt(PInput.getText());
        rate = Float.parseFloat(RInput.getText());
        term = Float.parseFloat(TInput.getText());
        
        
        //Rate Manipulation
        rate = (rate / 100)/12;
        
        //Term Manipulation
        term = term * 12;
        
        //Calculation of Interest
        float upper = principal * rate;
        double lower = (1 - Math.pow((rate + 1), -term));
        double result_raw = upper / lower;
        
        //Rounding raw results
        long result = Math.round(result_raw);
        
        //Returning rounded result
        AOutput.setText(String.valueOf(result));
    }

    
    //JFrame/GUI
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        input = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        PInput = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        RInput = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        TInput = new javax.swing.JTextField();
        CalculateButton = new javax.swing.JButton();
        output = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        AOutput = new javax.swing.JTextField();
        ResetButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Insurance Payment Calculator");
        setAlwaysOnTop(true);
        setLocation(new java.awt.Point(0, 0));
        setName("Insurance Payment Calculator\n"); // NOI18N
        setResizable(false);

        input.setBorder(javax.swing.BorderFactory.createTitledBorder("Input"));

        jLabel1.setText("Principal:");

        jLabel2.setText("Rate:");

        jLabel3.setText("Term:");

        TInput.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                Enter(evt);
            }
        });

        CalculateButton.setText("Calculate");
        CalculateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Calculate(evt);
            }
        });

        javax.swing.GroupLayout inputLayout = new javax.swing.GroupLayout(input);
        input.setLayout(inputLayout);
        inputLayout.setHorizontalGroup(
            inputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(inputLayout.createSequentialGroup()
                .addGroup(inputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(inputLayout.createSequentialGroup()
                        .addGap(90, 90, 90)
                        .addGroup(inputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(inputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(PInput)
                            .addComponent(RInput)
                            .addComponent(TInput, javax.swing.GroupLayout.DEFAULT_SIZE, 121, Short.MAX_VALUE)))
                    .addGroup(inputLayout.createSequentialGroup()
                        .addGap(140, 140, 140)
                        .addComponent(CalculateButton)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        inputLayout.setVerticalGroup(
            inputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(inputLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(inputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(PInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(inputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(RInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(inputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(TInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(CalculateButton)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        output.setBorder(javax.swing.BorderFactory.createTitledBorder("Ouput"));
        output.setName("Output"); // NOI18N

        jLabel4.setText("Monthly Payment:");

        AOutput.setEditable(false);

        ResetButton.setText("Reset");
        ResetButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Reset(evt);
            }
        });

        javax.swing.GroupLayout outputLayout = new javax.swing.GroupLayout(output);
        output.setLayout(outputLayout);
        outputLayout.setHorizontalGroup(
            outputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(outputLayout.createSequentialGroup()
                .addGroup(outputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(outputLayout.createSequentialGroup()
                        .addGap(91, 91, 91)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(AOutput, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(outputLayout.createSequentialGroup()
                        .addGap(150, 150, 150)
                        .addComponent(ResetButton)))
                .addContainerGap(113, Short.MAX_VALUE))
        );
        outputLayout.setVerticalGroup(
            outputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(outputLayout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addGroup(outputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(AOutput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
                .addComponent(ResetButton))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(input, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(output, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(input, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(output, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>                        

    private void Calculate(java.awt.event.ActionEvent evt) {                           
        interest();
    }                          

    //Action event method for Reset Button
    private void Reset(java.awt.event.ActionEvent evt) {                       
        PInput.setText("");
        RInput.setText("");
        TInput.setText("");
        AOutput.setText("");
    }                      

    private void Enter(java.awt.event.KeyEvent evt) {                       
        if(evt.getKeyCode() == KeyEvent.VK_ENTER) {
            interest();
        }
    }                      

    // Variables declaration - do not modify                     
    private javax.swing.JTextField AOutput;
    private javax.swing.JButton CalculateButton;
    private javax.swing.JTextField PInput;
    private javax.swing.JTextField RInput;
    private javax.swing.JButton ResetButton;
    private javax.swing.JTextField TInput;
    private javax.swing.JPanel input;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel output;
    // End of variables declaration                   
}
