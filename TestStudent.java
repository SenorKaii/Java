public class TestStudent{
    public static void main (String [] args)
    {
        Scanner input = new Scanner (System.in);
        
        Student stud1;
        stud1 = new Student();
        stud1.setStudent("Muhamad Ibrahim", "COV12323232", 3.32, "Computer Science");
        System.out.println ("\n***Student 1 Details ***");
        System.out.println(stud1.toString());
        System.out.println("Status: " +stud1.findStatus(3.32));
        
        Student stud2;
        stud2 = new Student();
        stud2.setStudent("Farhana Salleh", "COV141242141", 2.85, "Accounting");
        System.out.println ("\n***Student 2 Details ***");
        System.out.println(stud2.toString());
        System.out.println("Status: " +stud2.findStatus(2.85));
        
        stud1.setStudent("Muhamad Ibrahim", "COV12323232", 2.8, "Computer Science");
        System.out.println ("\n***Student 1 Details After Modify ***");
        System.out.println(stud1.toString());
        System.out.println("Status: " +stud1.findStatus(2.8));
        
        stud2.setStudent("Farhana Salleh", "COV141242141", 1.5, "Accounting");
        System.out.println ("\n***Student 2 Details After Modify ***");
        System.out.println(stud2.toString());
        System.out.println("Status: " +stud2.findStatus(1.5));
        
        Student stud3;
        stud3 = new Student();
        System.out.print("\n\nEnter Student Name: ");
        String stud_name = input.next();
        System.out.print("Enter Student Id: ");
        String id_number = input.next();
        System.out.print("Enter CGPA: ");
        double cgpa = input.nextDouble();
        System.out.print("Enter Course: ");
        String course_name = input.next();
        
        stud3.setStudent(stud_name, id_number, cgpa, course_name);
        
        System.out.println ("\n***Student 3 Details ***");
        System.out.println(stud3.toString());
        System.out.println("Status: " +stud3.findStatus(cgpa));
    }
}
