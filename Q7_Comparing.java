//Java program to create methods constructor and check if two objects are overlapping.

package bappa;

public class Q7_Comparing{

	int a, b;
	
	// create default constructor.
	public Q7_Comparing() {
		
	// set value to 0.	
	a = 0;
	b = 0;
	
	}
	
	// creating parameterized constructor.
	public Q7_Comparing(int a, int b) {
		
	// using this keyword	
	this.a = a;
	this.b = b;
	
	}
	
	
	public void setX(int x) {
	
	// use this keyword.	
	this.a = a;
	
	}
	
	// creating method setY.
	public void setY(int y) {
	
	// use this keyword.
	this.b = b;
	
	}
	
	public void setXY(int x, int y) {
	
	// use this keyword.	
	this.a = a;
	this.b = b;
		
	}
	
	// create method to return value of x.
	public int getX() {
		
		return a;
	}
	
	// create method to return value of y.
	public int getY() {
		
		return b;
	}
	
	// creating method to return overlapping points.
	public boolean IsOverlapping(Q7_Comparing abc) {
		
		return this.a == abc.a && this.b == abc.b;
	}
	public static void main(String[] args) {
		
		// creating constructor objects.
		Q7_Comparing s = new Q7_Comparing (6,7);
		Q7_Comparing t = new Q7_Comparing (1,1);
	
     // creating boolean variable to check overlapping points.	
		boolean overlapping = s.IsOverlapping(t);
		
		System.out.println("Point1 : "+s.getX()+" , "+t.getY());
		
		System.out.println("Point1 : "+s.getX()+" , "+t.getY());
		
		System.out.println("Is points are overlapping "+overlapping);
	}

}
output:
/*Point1 : 6 , 1
Point1 : 6, 1
Is points are overlapping false*/