import java.util.*;
 public class Perimeter_of_a_Rectangle
 {
         public static void main(String [] args)
		 {
		     Scanner sc = new Scanner(System.in);
			 System.out.print("Enter the length of a rectangle: ");
			 double length = sc.nextDouble();
			 System.out.print("Enter the width of a rectangle: ");
			 double width = sc.nextDouble();
			 double perimeter = 2*(length + width);
			 System.out.print("Perimeter of a rectangle: " + perimeter);
		 }
 }