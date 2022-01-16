public class TestEmployee
{
    public static void main (String[]args)
    {
        Scanner input= new Scanner (System.in);
        Employee [] emp = new Employee [3];
        
        for(int i = 0; i<3; i++)
        {
            System.out.print("\nEmployee no "+(i+1));
            
            System.out.print("Enter Name:");
            String name = input.next();
      
            System.out.print("Enter Age:");
            int age = input.nextInt();
      
            System.out.print("Enter Gender:");
            String gender = input.next();
        
            System.out.print("Enter Salary: RM");
            double salary = input.nextDouble();
        }
        
        
    }
}
