//This program demonstrates using dialogs with JOptionPane.

import javax.swing.JOptionPane;
public class PersonalInfo
{
 public static void main(String[] args)
 {
    //declare all the variable
    String name; // The user's name
    String hobby; // The user's hobby
    String homeTown; // The user's hometown
    // Get the user's first name.
    name = JOptionPane.showInputDialog("What is your name? ");

    // Get the user's hobby
    hobby = JOptionPane.showInputDialog("What is your hobby? ");

    // Get the user's hometown
    homeTown = JOptionPane.showInputDialog("Where is your hometown ");
    // Display a greeting
    JOptionPane.showMessageDialog(null, "Hello " + name + " \nYour hobby is :" + hobby + " \nYou’re from " + homeTown);

    System.exit(0);
 }
}             

