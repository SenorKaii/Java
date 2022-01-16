import java.util.*;
public class Status
{
    static Scanner console = new Scanner(System.in);
    public static void main (String[]args)
    {
        int mark;

        System.out.print("Enter mark: ");
        mark = console.nextInt();
        if (mark >= 80)
        {
           System.out.print("Excellent");
        }
        else if (mark >= 70 && mark < 80)
        {
            System.out.print("Good");
        }
        else if (mark >= 60 && mark < 70)
        {
            System.out.print("Average");
        }
        else if (mark >= 50 && mark < 60)
        {
            System.out.print("Below Average");
        }
        else
        {
            System.out.print("Failed");
        }

    }
}
