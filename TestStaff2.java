import java.util.*;
public class TestStaff2 {
    public static void main (String [] args) {
        Scanner input= new Scanner (System.in);
        Staff []Staff = new Staff[5];

        for (int i = 0; i < 5; i++) {
            Staff[i] = new Staff();

            System.out.print("Enter name: ");
            String staff_name  = input.next();
            System.out.print("Enter id: ");
            int staff_id = input.nextInt();
            System.out.print("Enter department: ");
            String department = input.next();
            System.out.print("Enter position: ");
            String position = input.next();
            System.out.print("Enter salary: RM");
            double salary = input.nextDouble();
            System.out.print("\n");

            Staff[i].setStaff(staff_name, staff_id, department, position, salary);
        }

        for (int i = 0; i < Staff.length; i++) {
            System.out.println("Object "+ (i+1));
            System.out.println(Staff[i].display());
            System.out.print("\n");
        }

        for (int i = 0; i < 5; i++) {
            if (Staff[i].getSalary() >= 2500) {
                System.out.print("\nStaff Name: "+Staff[i].getStaff_name());
                System.out.print("\nStaff Department: " +Staff[i].getDepartment());
            }
        }
    }
}
