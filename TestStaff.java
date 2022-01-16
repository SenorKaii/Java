import java.util.*;
public class TestStaff
{
    public static void main (String[]args)
    {
        Scanner input= new Scanner (System.in);
        
        Staff staff1;
        staff1 = new Staff();
        staff1.setStaff("Muhamad Fakhri",2215,"Finance","Executive",4500.0);
        System.out.println ("\n*** Staff 1 Details ***");
        System.out.println(staff1.display());
        
        Staff staff2;
        staff2 = new Staff();
        staff2.setStaff("Siti Saleha",2432,"Marketing","Administrator",3500);
        System.out.println ("\n*** Staff 2 Details ***");
        System.out.println(staff2.display());
        
        
        staff1.setStaff("Muhamad Fakhri",2215,"Finance","Executive",5200.0);
        System.out.println ("\n*** Staff 1 Details After Modify ***");
        System.out.println(staff1.display());
        
        staff2.setStaff("Siti Saleha",2432,"Marketing","Senior Administrator",3500);
        System.out.println ("\n*** Staff 2 Details After Modify ***");
        System.out.println(staff2.display());
        
        Staff staff3;
        staff3 = new Staff();
        System.out.print("\n\nEnter Staff Name:");
        String staff_name = input.next();
      
        System.out.print("Enter Staff Id:");
        int staff_id = input.nextInt();
      
        System.out.print("Enter Department:");
        String department = input.next();
        
        System.out.print("Enter Position:");
        String position = input.next();
        
        System.out.print("Enter Salary: RM");
        double salary = input.nextDouble();
      
        staff3.setStaff(staff_name, staff_id, department, position, salary);
      
        System.out.println ("\n*** Staff 3 Details ***");
      
        System.out.println(staff3.display());
        
    }
    
}
