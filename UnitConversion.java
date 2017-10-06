/* 
 Author: Lamperts, Dustin
    Assignment: Programming Assignment Three 
    Course: COMP B11 
    Instructor: Richard Miles 
    Date submitted: 2016/10/25
 */


import java.util.Scanner;

public class UnitConversion
{
   public static void main(String[] args)
   {
      final double ML_PER_FL_OZ = 29.5735296;
      final double ML_PER_GAL = 3785.41178;
      final double G_PER_OZ = 28.3495231;
      final double G_PER_LB = 453.59237;

      final double M_PER_IN = 0.0254;
      final double M_PER_FT = 0.3048;
      final double M_PER_MI = 1609.344;

      Scanner in = new Scanner(System.in);
      System.out.print("Convert from? ");
      String fromUnit = in.nextLine();
      System.out.print("Convert to? ");
      String toUnit = in.next();

      char lastChar = toUnit.charAt(toUnit.length() - 1);

      // convert fluid ounces to liters/milliliters
      // fl.oz with no space.  wasn't working with space
      if (fromUnit.compareTo("fl. oz") == 0)
      {
         // fl. oz to ..
         if (lastChar == 'l')
         {
            // fl oz to milliliters
            System.out.print("Value? ");
            double value = in.nextDouble();

            double conversion = value * ML_PER_FL_OZ;
            if (toUnit.charAt(0) == 'l')
            {
               // fl oz to liters
               conversion /= 1000;
            }
            System.out.printf("%f %s = %f %s\n", value, fromUnit, conversion,
                  toUnit);
         }
         else
         {
            System.out.println("Incompatible Units.");
         }
      }

      // convert gallons to liters/milliliters
      if (fromUnit.compareTo("gal") == 0)
      {
         // Gallons to ...
         if (lastChar == 'l')
         {
            // Gallons to mililiters
            System.out.print("Value? ");
            double value = in.nextDouble();

            double conversion = value * ML_PER_GAL;
            if (toUnit.charAt(0) == 'l')
            {
               // Gallons to liters
               conversion /= 1000;
            }
            System.out.printf("%f %s = %f %s\n", value, fromUnit, conversion,
                  toUnit);
         }
         else
         {
            System.out.println("Incompatible Units.");
         }
      }

      // convert ounces to grams/kilograms
      if (fromUnit.compareTo("oz") == 0)
      {
         // Ounces to ...
		     if (lastChar == 'g')
         {
            // Ounces to grams
            System.out.print("Value? ");
            double value = in.nextDouble();

            double conversion = value * G_PER_OZ;
            if (toUnit.charAt(0) == 'k')
            {
               // Ounces to Kilograms
               conversion /= 1000;
            }
            System.out.printf("%f %s = %f %s\n", value, fromUnit, conversion,
                    toUnit);
         }
         else
         {
            System.out.println("Incompatible Units.");
         }
      }

      // convert pounds to grams/kilograms
      if (fromUnit.compareTo("lb") == 0)
      {
         // lb to ...
         if (lastChar == 'g')
         {
            // lb to grams
            System.out.print("Value? ");
            double value = in.nextDouble();
            double conversion = value * G_PER_LB;
            if (toUnit.charAt(0) == 'k')
            {
               // lb to kilograms
               conversion /= 1000;
            }
            System.out.printf("%f %s = %f %s\n", value, fromUnit, conversion,
                  toUnit);
         }
         else
         {
            System.out.println("Incompatible Units.");
         }
      }

      // convert inches to meters/kilometers/centimeters/millimeters
      if (fromUnit.compareTo("in") == 0)
      {
         // in to ...
         if (lastChar == 'm')
         {
            // in to m
            System.out.print("Value? ");
            double value = in.nextDouble();
            double conversion = value * M_PER_IN;
            if (toUnit.compareTo("km") == 0)
            {
               // in to kilometers
               conversion /= 1000;
            }
            if (toUnit.compareTo("cm") == 0)
            {
               // in to centimeters
               conversion *= 100;
            }
            if (toUnit.compareTo("mm") == 0)
            {
               // in to milimeters
               conversion *= 1000;
            }
            System.out.printf("%f %s = %f %s\n", value, fromUnit, conversion,
                  toUnit);
         }
         else
         {
            System.out.println("Incompatible Units.");
         }
      }

      // convert feet to meters/kilometers
      if (fromUnit.compareTo("ft") == 0)
      {
         // ft to ...
         if (lastChar == 'm')
         {
            // ft to meters
            System.out.print("Value? ");
            double value = in.nextDouble();
            double conversion = value * M_PER_FT;
            if (toUnit.compareTo("km") == 0)
            {
               // ft to kilometers
               conversion /= 1000;
            }
            if (toUnit.compareTo("cm") == 0)
            {
               // ft to centimeters
               conversion *= 100;
            }
            if (toUnit.compareTo("mm") == 0)
            {
               // ft to milimeters
               conversion *= 1000;
            }
            System.out.printf("%f %s = %f %s\n", value, fromUnit, conversion,
                  toUnit);
         }
         else
         {
            System.out.println("Incompatible Units.");
         }
      }

      // convert miles to meters/kilometers
      if (fromUnit.compareTo("mi") == 0)
      {
         // Miles to ...
         if (lastChar == 'm')
         {
            //Miles to meters
            System.out.print("Value? ");
            double value = in.nextDouble();
            double conversion = value * M_PER_MI;
            if (toUnit.charAt(0) == 'k')
            {
               //Miles to kilometers
               conversion /= 1000;

            }
            System.out.printf("%f %s = %f %s\n", value, fromUnit, conversion,
                  toUnit);
         }
         else
         {
            System.out.println("Incompatible Units.");
         }
      }
   }
}
