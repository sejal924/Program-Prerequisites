import java.util.*;
public class Calculate_Simple_Interest
{
      public static void main(String [] args)
	  {
	    Scanner sc = new Scanner(System.in);
		System.out.print("Enter principal amount: ");
		double principal = sc.nextDouble();
		System.out.print("Enter rate: ");
		double rate = sc.nextDouble();
		System.out.print("Enter time: ");
		double time = sc.nextDouble();
		double SI = (principal*rate*time) / 100;
		System.out.print("Simple Interest is: "+ SI);
	  }
}