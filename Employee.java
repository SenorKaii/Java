
public class Employee
{
    private String name;
    private int age;
    private String gender;
    private double salary;
    
    //default constructor
    public Employee()
    {
      name = null;
      age = 0;  
      gender = null;
      salary = 0;
    }
    
    //normal constructor
    public Employee (String name, int age, String gender, double salary)
    {
        this.name = name;
        this.age= age;
        this.gender = gender;
        this.salary = salary;
    }
    
    //mutator
    public void setEmployee (String name, int age, String gender, double salary)
    {
        this.name = name;
        this.age= age;
        this.gender = gender;
        this.salary = salary;
    }
    
    //mutator
    public void setName (String name)
    {
        this.name=name;
    }
    
    public void setAge (int age)
    {
        this.age =age;
    }
    
    public void setGender (String gender)
    {
        this.gender = gender;
    }
    
    public void setSalary (double salary)
    {
        this.salary = salary;
    }
    //accessor
    public String getName ()
    {
        return name;
    }
    
    public int getAge ()
    {
        return age;
    }
    
    public String getGender ()
    {
        return gender;
    }
    
    public double getSalary ()
    {
        return salary;
    }
    //toString() method
    public String toString()
    {
        return ("Name:" + name + "\nAge:" + age + "\nGender:" + gender + "\nSalary" + salary);
    }
           
}
