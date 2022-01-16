import java.util.*;

public class MathMethod
{
    public static void main(String[] args)
    {
        double absoluteValue = Math.abs(-1.23);
        System.out.println(absoluteValue);
        
        double power1 = Math.pow(3, 2);
        System.out.println(power1);
        
        double power2 = Math.pow(10, -2);
        System.out.println(power2);
        
        double squareroot = Math.sqrt(121.0) - Math.sqrt(256.0);
        System.out.println(squareroot);
        
        double round = Math.round(Math.PI) + Math.round(Math.E);
        System.out.println(round);
        
        double ceilling = Math.ceil(6.022) + Math.floor(15.9994);
        System.out.println(ceilling);
        
        double absvalue = Math.abs(Math.min(-3, -5));
        System.out.println(absvalue);
    }
}
