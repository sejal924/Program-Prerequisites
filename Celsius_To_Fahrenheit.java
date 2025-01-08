import java.util.*;

public class Celsius_To_Fahrenheit
{
      public static void main(String [] args)
	  {
	     Scanner sc = new Scanner(System.in);
		 System.out.print("Enter the temperature in celsius: ");
		 double Celsius = sc.nextDouble();
		 double Fahrenheit = (Celsius * 9/5)+32;
		 System.out.print("After converting,temperature in fahrenheit is: " + Fahrenheit);
	  }
}