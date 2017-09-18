
import javax.swing.JOptionPane;

public class Main {
    
    public static void main (String args []) {
        
        //Binding JOptionPane to pane variable and instantiating it to accept
        //user selection of study material topics
        JOptionPane pane = new JOptionPane();
        String userTopic = pane.showInputDialog(null, "Please input your study term:");
        
        switch (userTopic) {
            case "data types":
                dataTypes();
                return;
            case "java library classes":
                javaClasses();
                return;
            default:
                pane.showMessageDialog(null, "Topic not found, please select"
                    + " one of the following: data types, java development,"
                    + " java library classes");
        }
        
    }
    
    public static  void dataTypes() {
        JOptionPane pane = new JOptionPane();
        String selection = pane.showInputDialog(null, "Tnput a term to view the answer:");
        
        //Switch case for basic data types in Java
        switch (selection){
            case "char":
                pane.showMessageDialog(null, "A char is a 16bit unicode character");
                return;
            case "bit": 
                pane.showMessageDialog(null, "A bit is the smallest unit of data storage in a computer.");
                return;
            case "byte":
                pane.showMessageDialog(null, "A byte is a unit of data storage consisting of 8 bits");
                return;
            case "int":
                pane.showMessageDialog(null, "An int, short for integer, is a stored number in Java"
                        + " which consists of 4 bytes of memory.");
                return;
            case "short":
                pane.showMessageDialog(null, "A shot, is a stored number in Java "
                        + "that consists of 2 bytes of memory.");
                return;
            case "long":
                pane.showMessageDialog(null, "A long is a stored number in Java "
                        + "that consists of 8 bytes of memory.");
                return;
            case "float":
                pane.showMessageDialog(null, "A float is a stored decimal number "
                        + "consisting of 4 bytes of memory.");
                return;
            case "double":
                pane.showMessageDialog(null, "A double is a stored decimal in Java "
                        + "that consists of 8 bytes of memory.");
                return;
            case "string":
                pane.showMessageDialog(null, "A string is a grouping of unicode characters stored in sequence.");
                return;
            default:
                pane.showMessageDialog(null, "Request not understood, please try again.");
        }
    }
    
    public static void javaClasses() {
        JOptionPane pane = new JOptionPane();
        String selection = pane.showInputDialog(null, "Input a java library class "
                + "or general method to learn about it:");
        
        switch(selection) {
            case "scanner":
                pane.showMessageDialog(null, "The scanner is a tool in Java that allows the developer to accept"
                        + "inputs from the console and store them in the program for use and alteration"
                        + "by the program. Scanner will take in both numbers and strings. To initiate scanner: "
                        + "Scanner scan = Scanner(System.in) followed by using either of these methods on scan: "
                        + ".next(), nextLine(), .nextInt(), .nextFloat(), .nextLong(), nextDouble()");
                return;
            case "JOptionPane":
                pane.showMessageDialog(null, "The JOptionPane class allows for the creation of basic message and"
                        + " user input dialog frames. They are instantiated by calling the class JOptionPane and"
                        + " then using methods: showInputDialog or showMessageDialog. The input will return a "
                        + "string when assigned to a variable.");
                return;
            case "println":
                pane.showMessageDialog(null, "The println method allows the programmer to display a message directly"
                        + "in the console and then creates a new line afterwards.");
            case "printf":
                pane.showMessageDialog(null, "This is used to print a line into the console with formating. "
                        + "There are specific arguments that are accepted inline to format the output "
                        + "information. This is the argument structure: "
                        + "%[flags][width][.precision][conversion-character]."
                        + "Flags: - (left justify), + (output a plus or minus),"
                        + " 0 (forces numerical values to be padded with a 0), "
                        + ", (will create grouping for numbers > 999)"
                        + "'space' (will display a sign if the number is negative or a space "
                        + "if it is positive. "
                        + "Width: specifies the number of characters to be output including commas and decimals. "
                        + "Precision: designates the amount of decimal points output for floats. "
                        + "All of these arguments are option and performed in order without "
                        + "any formatting. Example: This is the number: %,f");
        } 
    }
    
    public static void javaDevelopment() {
        JOptionPane pane = new JOptionPane();
        String selection = pane.showInputDialog(null, "Input a term about the creation of Java development: ");
        
        switch (selection){
            
            case "sun microsystems": 
                pane.showMessageDialog(null, "The company that created Java.");
                return;
                
            case "James Gosling":
                pane.showMessageDialog(null, "The creator of Java.");
                return;
                
            case "JVM":
                pane.showMessageDialog(null, "This is the Java Virtual Machine. Java runs"
                        + " on the virtual machine and is then compiled by an "
                        + "interpretor in the JVM.");
                return;
            case "Command Prompt":
                pane.showMessageDialog(null, "You can run commands for Java from the command propmt."
                        + " To compile: javac Example.java. To run: java Example.");
                return;
        }
    }
    
}
