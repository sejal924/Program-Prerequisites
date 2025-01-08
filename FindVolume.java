import java.util.*;

public class FindVolume
{
    public static void main(String [] args)
	{
	    Scanner sc = new Scanner(System.in);
		double pie = 3.14;
		System.out.print("Enter the radius: ");
		double radius = sc.nextDouble();
		System.out.print("Enter the height: ");
		double height = sc.nextDouble();
		double volume = pie*radius*radius*height;
		System.out.print("volume of a cylinder: " + volume);
	}
}