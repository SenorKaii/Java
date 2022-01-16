import java.util.*;
public class TestStudent2 {
    public static void main (String [] args) {
        Scanner input= new Scanner (System.in);
        Student []pupil = new Student[5];

        for (int i = 0; i < 5; i++){
            pupil[i] = new Student();

            System.out.print("Enter student name: ");
            String student_name = input.next();
            System.out.print("Enter student id: ");
            String student_id = input.next();
            System.out.print("Enter CGPA: ");
                        double cgpa = input.nextDouble();
                        System.out.print("Enter course name: ");
            String course_name = input.next();
                        System.out.print("\n");

            pupil[i].setStudent(student_name, student_id, cgpa, course_name);
        }

        for (int i = 0; i < 5; i++){
            System.out.println("Object "+ (i+1) +": ");
            System.out.println(pupil[i]+"\n");
        }
        int counter = 0;
        System.out.print("Students who got CGPA higher than 2.50: "+"\n");
        for (int i = 0; i < 5; i++){
            if (pupil[i].getCgpa() >= 2.50){
                System.out.print(pupil[i].getStud_name() + pupil[i].getCourse_name());
            }
            if (pupil[i].getCgpa() < 1.80){
                counter += 1;
                        }
        }
        System.out.print("Amount of students who failed: "+ counter);
    }
}
