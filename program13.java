package bappa;
//13.	Initialize 2 variables and find the sum, difference, product, quotient and remainder.  Do it using static methods and without static methods

import java.util.Scanner;

public class program13 
{
	public static void arithmeticOperations(double a, double b) 
    {
    	System.out.println();
        System.out.println("****************  using static methods for area & circumference  ****************");
        // Sum
        double sum = a + b;
        System.out.println("Sum: " + sum);

        // Difference
        double difference = a - b;
        System.out.println("Difference: " + difference);

        // Product
        double product = a * b;
        System.out.println("Product: " + product);

        // Quotient and Remainder
        double quotient = a / b;
        System.out.println("Quotient: " + quotient);

        double remainder = a % b;
        System.out.println("Remainder: " + remainder);
    } 

    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);