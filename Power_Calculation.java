import java.util.*;

public class Power_Calculation
{
public static double power(double base, double exponent)
{
      if(exponent==0){
	   return 1;
	   }
	   return power(base, exponent-1);
}
     public static void main(String [] args)
	 {
	    Scanner sc = new Scanner(System.in);
		System.out.print("Enter a base: ");
		double base = sc.nextDouble();
		System.out.print("Enter a exponent: ");
		double exponent = sc.nextDouble();
		double answer = power(base, exponent);
		System.out.print("power is " + answer);
	 }
}