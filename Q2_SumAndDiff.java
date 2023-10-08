public class Q2_SumAndDiff{

	// creating static method sum.
	static int sum(int x, int y) {
		
		return x + y; 
	}
	
	// creating static method diff.
	static int diff(int x, int y) {
		
		return x - y;
	}
	
	public static void main(String[] args) {
	
		Q2_SumAndDiff d= new Q2_SumAndDiff();
		
		// Print sum and difference.
		System.out.println("Sum of two number is : "+d.sum(10,8));
		System.out.println("Difference between to number is : "+d.diff(6,2));
	}

}
output:
/*Sum of two number is :18
Difference between to number is : 4
*/