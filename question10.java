import java.util.Scanner;  
public class Question10   
{  
    public static void main(String args[])  
    {  
    	int number, digit, sum = 0;  
    	int counter = 0;
    	Scanner sc = new Scanner(System.in);  
    	System.out.print("Enter the number: ");  
    	number = sc.nextInt();  
    	while(number > 0)  
    	{  
    		digit = number % 10;    
    		sum = sum + digit;  
    		number = number / 10;  
    		counter++;
    	}  
    System.out.println("The mean of all digits" + sum/counter);
    }  
}  