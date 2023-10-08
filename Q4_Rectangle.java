//Java program to find area of rectangle using constructor and two methods.

package bappa;

public class Q4_Rectangle {

	double  l, b;
	
	// Creating parameterized constructor.
	public Q4_Rectangle(double len, double bre){
		
		// Using this keyword.
		this.l = len;
		this.b = bre;
	}
	
	// Creating user defined method.
	public double  getArea() {
		
		return l * b;
		
	}
	
	
	public static void main(String[] args) {
		
		// Creating constructor object.
		 Q4_Rectangle v = new  Q4_Rectangle(5,4);

		 // Print area of rectangle.
		 System.out.println("Area of rectangle is : "+v.getArea());
	}

}
output:
/*Area of rectangle is : 20*/