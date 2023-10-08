//Java program to create two instance variable and two instance method to find sum and difference.


package Java;

public class Q3_SumDiffInstance {

	int u, v;
	
	// creating instance method sum.
	public int sum(int u, int v) {
		
		return  u + v;
	}
	
	// creating instance method diff.
	public int diff(int u, int v) {
		
		return  u - v;
	}
	
	public static void main(String[] args) {
	
		Q3_SumDiffInstance q = new Q3_SumDiffInstance();
		
		System.out.println("Sum of two variable using instance method is :"+q.sum(7,4));
		System.out.println("Difference between two variable using instance method is :"+q.diff(16,6));
		

	}

}
output:
/*Sum of two variable using instance method is :11
Difference between two variable using instance method is :10