//This program demonstrates using dialogs with JOptionPane.
import javax.swing.JOptionPane;
public class MyDetails
{
 public static void main(String[] args)
 {
     String name; //The user's first name
     int age; //The user's age
     double income; //The user’s income
     String input; //hold user’s input
     // Get the user's first name.
     name = JOptionPane.showInputDialog("What is your name? ");
    
     // Get the user's age
     input = JOptionPane.showInputDialog("What is your age? ");
    
     //convert the input to an int
     age = Integer.parseInt(input);
     // Get the user's income
     input = JOptionPane.showInputDialog("what is your annual income ");
     //convert the input to a double
     income = Double.parseDouble(input);
     // Display a greeting
     JOptionPane.showMessageDialog(null, "Hello " + name + " \nYou is " + age + " years old" +" \nYou earned RM" + income + " a year.");
    
     System.exit(0);
 }
}
