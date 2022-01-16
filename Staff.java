import java.util.*;
public class Staff
{
    private String staff_name;
    private int staff_id;
    private String department;
    private String position;
    private double salary;

    //default constructor
    public Staff()
    {
        staff_name = null;
        staff_id = 0;
        department = null;
        position = null;
        salary = 0;
    }
    //normal constructor
    public Staff(String staff_name,int staff_id,String department,String position,double salary)
    {
        this.staff_name = staff_name;
        this.staff_id = staff_id;
        this.department = department;
        this.position = position;
        this.salary = salary;
    }
    //mutator 
    public void setStaff(String staff_name,int staff_id,String department,String position,double salary)
    {
        this.staff_name = staff_name;
        this.staff_id = staff_id;
        this.department = department;
        this.position = position;
        this.salary = salary;
    }
    //mutator
    public void setStaff_name (String staff_name)
    {
        this.staff_name = staff_name;
    }
    public void setStaff_id (int staff_id)
    {
        this.staff_id = staff_id;
    }
    public void setDepartment (String department)
    {
        this.department = department;
    }
    public void setPosition (String position)
    {
        this.position = position;
    }
    public void setSalary (double salary)
    {
        this.salary = salary;
    }
    //acessor
    public String getStaff_name ()
    {
        return staff_name;
    }
    public int getStaff_id ()
    {
        return staff_id;
    }
    public String getDepartment ()
    {
        return department;
    }
    public String getPosition ()
    {
        return position;
    }
    public double getSalary ()
    {
        return salary;
    }
    //toString () method
    public String display ()
    {
        return ("Staff Name :" + staff_name +"\nStaff Id :" + staff_id +"\nDepartment :" + department +"\nPosition :" + position +"\nSalary : RM" + salary);
    }
}
