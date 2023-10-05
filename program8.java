package bappa;
//
public class program8
{
	public static void main(String[] args) {

		System.out.println("Even no using for loop");
		for (int i = 1; i <= 10; i++) 
		{
			if(i%2==0)
			{
				System.out.println(i);
			}
		}

		System.out.println("Even no using while loop");
		int i = 1;
		while (i <= 10) 
		{
			if(i%2==0)
			{
				System.out.println(i);
			}
			i++;	
		}

		System.out.println("Even no using do_while loop");
		i=1;
		do
		{
			if(i%2==0)
			{