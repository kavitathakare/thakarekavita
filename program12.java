package bappa;
//12.Check if the given character is a vowel or consonant without using methods.  Do the same program by passing the char to a static method and returning the result.
import java.util.Scanner;
public class program12
{
    public static void main(String[] args) 
    {
        char ch;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a character: ");
        ch = scanner.next().charAt(0);

        System.out.println();
        System.out.println("****************  without using methods  ****************");
        if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) 
        {
            // Check if the character is a letter
            if (ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U' ||
                ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') 
            {
                System.out.println(ch + " is a vowel.");
            } 
            else 
            {
                System.out.println(ch + " is a consonant.");
            }
        } 
        else 
        {
            System.out.println(ch + " is not a letter.");
        }

        System.out.println();