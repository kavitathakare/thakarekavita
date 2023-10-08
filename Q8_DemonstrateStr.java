//Java program to demonstrate  methods in string and string builder classes
package bappa;

public class Q8_DemonstrateStr {

	public static void main(String[] args) {
		
		String u = "Hello savita!";
		String v = "Hello Everyone!";
		
		System.out.println("Length of string is : "+u.length());
		
		System.out.println("Aaradhya is present in the string : "+u+" = "+u.contains("kavita"));
		
		System.out.println("Character at position 5th in  string : "+u.charAt(5));
		
		System.out.println("Is strings are equal : "+u.equals(v));
		
		System.out.println("Compare string difference : "+u.compareTo(v));
		
		System.out.println("Hash code of string str : "+u.hashCode()+" Hash code of string str1 : "+v.hashCode());
	
		System.out.println("Make string to lower case : "+v.toLowerCase());
		
		System.out.println("Make string to upper case : "+u.toUpperCase());
		
		StringBuilder b = new StringBuilder("Hello");
		
		System.out.println("Appending ',' to string : "+b.append(", "));
		
		System.out.println("Find string capacity : "+b.capacity());
		
		System.out.println("Append name to string : "+b.append("kavita"));
		
		System.out.println("Check indexOf string Aaradhya : "+b.indexOf("kavita"));
		
		System.out.println("Delete Hello in string : "+b.delete(0, 5));
		
		System.out.println("Reverse string : "+b.reverse());
	}

}
output:
/*Appending ',' to string : Hello, 
Find string capacity : 21
Append name to string : Hello, kavita
Check indexOf string kavita : 7
Delete Hello in string : kavita
Reverse string : kavit
*/