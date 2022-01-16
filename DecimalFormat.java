
// This program demonstrates the DecimalFormat class.

import java.text.DecimalFormat;
public class Format1
{
   public static void main(String[] args)
   {
      double dNumber1 = 0.166666666666667;
      double dNumber2 = 11.666666666666667;
      double dNumber3 = 116.666666666666667;
      double dNumber4 = 1166.666666666666667;

      // Create a DecimalFormat object.
      DecimalFormat formatter = new DecimalFormat("#0,000.00");

      // Display the formatted variable contents.
      System.out.println(formatter.format(dNumber1));
      System.out.println(formatter.format(dNumber2));
      System.out.println(formatter.format(dNumber3));
      System.out.println(formatter.format(dNumber4));
   }
}
