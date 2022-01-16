import java.util.*;
public class EmployeeSalary {
    private String name;
    private double incresalary, currentsalary, newsalary;
    private int yearofservice;
    static Scanner console = new Scanner(System.in);

    public void main(){
        System.out.print("Name: ");
        name = console.next();
        System.out.print("Year Of Service: ");
        yearofservice = console.nextInt();
        System.out.print("Current Salary: RM");
        currentsalary = console.nextDouble();
        calcIncrement(currentsalary, yearofservice);
        printReport(name, newsalary, currentsalary, yearofservice);
    }
    public double calcIncrement(double currentsalary, int yearofservice){
        if (yearofservice >= 1 && yearofservice <= 3)
        {
            incresalary =  currentsalary * 0.02;
        }
        else if (yearofservice >= 4 && yearofservice <= 9)
        {
            incresalary = currentsalary * 0.025;
        }
        else
        {
            incresalary = currentsalary * 0.04;
        }
        newsalary = incresalary + currentsalary;
        return newsalary;
    }
    public void printReport(String name, double newsalary, double currentsalary, int yearofservice){
        System.out.println("==================================================");
        System.out.println("                   2NE1 COMPANY                   ");
        System.out.println("==================================================");

        System.out.println("Name: "+ name);
        System.out.println("Year of Service: " + yearofservice);
        System.out.println("Current Salary: RM"+ currentsalary);
        System.out.println("New Salary: RM" + newsalary);
    }
}
