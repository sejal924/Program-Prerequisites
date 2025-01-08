import java.util.*;
 
 public class FindArea
 {
    public static void main(String [] args)
	{
	    Scanner sc = new Scanner(System.in);
		System.out.print("Enter the radius: ");
		double radius = sc.nextDouble();
		double pie = 3.14;
		double area = pie*radius*radius;
	   System.out.print("Area of the circle is: " + area);
	}
 }