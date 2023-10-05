package bappa;
//11.Area and perimeter of rectangle – once without using methods and once using static methods for area & perimeter.
import java.util.*;
public class program11
{
	 double length;
	 double width;

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the length of the rectangle: ");
        double length = scanner.nextDouble();
        
        System.out.print("Enter the width of the rectangle: ");
        double width = scanner.nextDouble();
        
        double area = length * width;
        double perimeter = 2 * (length + width);

        System.out.println();
        System.out.println("****************  without using methods  ****************");
        System.out.println("Area of the rectangle: " + area);
        System.out.println("Perimeter of the rectangle: " + perimeter);
        
        System.out.println();
        System.out.println("****************  using static methods for area & circumference  ****************");
        double Area = calculateArea(length, width);
        double Perimeter = calculatePerimeter(length, width);
        
        System.out.println("Area of the rectangle: " + Area);
        System.out.println("Perimeter of the rectangle: " + Perimeter);
		