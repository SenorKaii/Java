import java.util.*;
public class Student{
    String stud_name;
    String id_number;
    double cgpa;
    String course_name;
    
    //default constructor
    public Student(){
        stud_name = null;
        id_number = null;
        cgpa = 0.0;
        course_name = null;
    }
    //normal constructor
    public Student(String stud_name,String id_number,double cgpa, String course_name){
        this.stud_name = stud_name;
        this.id_number = id_number;
        this.cgpa = cgpa;
        this.course_name = course_name;
    }
    //mutator
    public void setStudent(String stud_name,String id_number,double cgpa, String course_name){
        this.stud_name = stud_name;
        this.id_number = id_number;
        this.cgpa = cgpa;
        this.course_name = course_name;
    }
    //mutator
    public void setStud_name(String stud_name){
        this.stud_name = stud_name;
    }
    public void setId_number(String id_number){
        this.id_number = id_number;
    }
    public void setCgpa(double cgpa){
        this.cgpa = cgpa;
    }
    public void setCourse_name(String course_name){
        this.course_name = course_name;
    }
    //acessor
    public String getStud_name(){
        return stud_name;
    }
    public String getId_number(){
        return id_number;
    }
    public double getCgpa(){
        return cgpa;
    }
    public String getCourse_name(){
        return course_name;
    }
    //FindStatus() method
    public String findStatus(double cgpa){
        String status;
        if (cgpa >= 2.00){
            status = "Pass";   
        }
        else if (cgpa >= 1.8 && cgpa < 2.00){
            status = "Probition";
        }
        else{
            status = "Fail";
        }
        return status;
    }
    //toString() method
    public String toString(){
        return ("Student Name: " + stud_name +"\nStudent Id: "+ id_number + "\nStudent CGPA: "+ cgpa + "\nStudent Course: " + course_name);
    } 
}
