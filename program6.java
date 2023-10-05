package bappa;
//6.Print "PASS" if the int variable "mark" is more than or equal to 50; or prints "FAIL" otherwise.
public class Program6 {

	public static void main(String[] args) {
		int mark = 49;
		 System.out.println("The mark is "+ mark);
		 
		 if (mark >= 50)
		 {
            System.out.println("Pass");
        }
        else {
            System.out.println("Fail");
        }
    }
}

output:
The mark is 49
Fail
