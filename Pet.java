import java.util.*;

public class Pet
{
    private String name;
    private String animal_type;
    private int age;
    
    //default constructor
    public Pet()
    {
      name = null;
      animal_type =null;
      age=0;  
    }
    
    //normal constructor
    public Pet (String name, String animal_type, int age)
    {
        this.name = name;
        this.animal_type=animal_type;
        this.age= age;
    }
    
    //mutator
    public void setPet (String name,String animal_type, int age)
    {
        this.name =name;
        this.animal_type =animal_type;
        this.age =age;
    }
    
    //mutator
    public void setName (String name)
    {
        this.name=name;
    }
    
    public void setAnimal_type (String animal_type) 
    {
        this.animal_type =animal_type;
    }
    
    public void setAge (int age)
    {
        this.age =age;
    }
    
    //accessor
    public String getName ()
    {
        return name;
    }
    
    public String getAnimal_type ()
    {
        return animal_type;
    }
    
    public int getAge ()
    {
        return age;
    }
    
    //toString() method
    public String toString()
    {
        return ("Pet Name:" + name + "\nAnimal Type:" + animal_type + "\nAge:" + age);
    }
           
}
