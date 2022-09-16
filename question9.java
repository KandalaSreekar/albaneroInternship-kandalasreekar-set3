import java.util.Scanner;  
public class Question9
{  
    public static void main(String args[])  
    {  
    	int number, digit = 0;
    	String answer = "";
    	Scanner sc = new Scanner(System.in);  
    	System.out.print("Enter the number: ");  
    	number = sc.nextInt();  
    while(number > 0)  
    	{  
    	digit = number % 10;  
    	int square = digit * digit;
    	String ans = Integer.toString(square);
    	answer = ans + answer;
    	number = number / 10;  
    	}  
    System.out.println("The concat of all squares digits" + answer);
    }  
}  