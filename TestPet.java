import java.util.*;

public class TestPet
{
    public static void main (String [] args)
    {
      Scanner input= new Scanner (System.in); 
        
      /**a) Create an empty object named pet1. After that, 
      store the object with a value (‚Äúblacky‚Äù, ‚Äúcat‚Äù, 2) 
      and print the details */  
      
      Pet pet1;
      
      pet1= new Pet();
      pet1.setPet("blacky", "cat", 2);
      
      System.out.println ("\n***Pet 1 Details ***");
      System.out.println(pet1.toString());
      
      /**a) b)    Next create an object name pet2 with a value 
      (‚Äúcaca‚Äù, ‚Äùrabbit‚Äù, 3) and print the details.  */  
      
      Pet pet2;
      
      pet2= new Pet();
      pet2.setPet("caca", "rabbit", 3);
      
      System.out.println ("\n***Pet 2 Details ***");
      System.out.println(pet2.toString());
      
      /**c)Modify the value of pet1 with a new value of age is 3. 
       Print the new details. */
      pet1.setPet("blacky", "cat", 3);
      System.out.println ("\n***Pet 1 Details after modify ***");
      System.out.println(pet1.toString());
      
      /**d)Modify the value of pet2 changing the value of its name to ‚Äúribbit‚Äù  
       Print the new details. */
      pet2.setPet("ribbit", "rabbit", 3);
      System.out.println ("\n***Pet 2 Details after modify ***");
      System.out.println(pet2.toString());
      
      /**e)Create a new object named pet3. Ask user to enter the input 
       and store the input into object pet3. Print the details.*/
      Pet pet3 = new Pet();
      
      System.out.println("\n\nEnter pet's name:");
      String name = input.nextLine();
      
      System.out.println("Enter pet's type:");
      String type = input.nextLine();
      
      System.out.println("Enter pet's age:");
      int age = input.nextInt();
      
      pet3.setPet(name, type, age);
      
      System.out.println ("\n***Pet 3 Details ***");
      
      System.out.println(pet3.toString());
      
    }   
    
}
