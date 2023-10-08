//Java program to demonstrate static variable.

package bappa;

public class Q6_DemonstrateStatic {

	// initializing static variable.
	static int ab = 11;
	
	Q6_DemonstrateStatic(){
	
	// incrementing static value.	
	ab++;
	
	// Print variable.
	System.out.println(ab);
		
	}
	
	public static void main(String[] args) {
	
		// creating constructor objects single copy is shared by all objects.
		Q6_DemonstrateStatic a = new  Q6_DemonstrateStatic();
		Q6_DemonstrateStatic a1 = new Q6_DemonstrateStatic();
		Q6_DemonstrateStatic a2 = new Q6_DemonstrateStatic();
		
			
		
	}

}
output:
/*12
13
14
*/