import java.util.*;

public class Convert_Kilometers_to_Miles
{
     public static void main(String [] args)
	 {
	    Scanner sc = new Scanner(System.in);
		System.out.print("Enter distance in kilometers: ");
		double kilometer = sc.nextDouble();
		double miles = kilometer * 0.621371;
		System.out.print("After converting it into miles: " + miles);
	 }
}