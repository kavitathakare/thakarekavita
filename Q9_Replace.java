//Java program to replace string in java1 with java2.

package bappa;

public class Q9_Replace {

	public static void main(String[] args) {
	
		String str1 = "Morning";
		String str2 = "Hello Everyone";
		
		System.out.println("Original string : "+str1);
		
		// using replace method 
		System.out.println("Replaced string : "+str1.replace("Hello Everyone", str2));

	}

}
output:
/*Original string : Morning
Replaced string : Hello Everyone
*/