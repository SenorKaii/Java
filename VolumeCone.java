import java.util.*;
public class VolumeCone
{
    private int radius, height;
    private static double pi = 3.142;
    private double volume;
    static Scanner console = new Scanner(System.in);
    public void main(){
        System.out.print("Enter radius: ");
        radius = console.nextInt();
        System.out.print("Enter height: ");
        height = console.nextInt();
        calc(radius, height, pi);
        disp(volume);
    }
    public double calc(int radius, int height, double pi){
        volume = 0.33*pi*(radius*radius)*height;
        return volume;
    }
    public void disp(double volume){
        System.out.printf("Volume of cone = %.2f", volume);
    }
}
