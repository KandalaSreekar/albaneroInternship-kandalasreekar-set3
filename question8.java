import java.util.Scanner;  
public class question8
{  
    public static void main(String args[])  
    {  
    	int parity = 0;
    	int number = 0;
    	int digit = 0;
    	int parityBit = 0;
    	Scanner sc = new Scanner(System.in);  
    	System.out.print("Enter the binary: ");  
    	number = sc.nextInt();
    	int inputNumber = number;
    	while(number > 0)  
    		{  
    			digit = number % 10;  
    			if (digit==1){parity++;}
			number = number / 10;  
    		}  
    if((parity%2)==1){ parityBit = 1; }
    System.out.println(Integer.toString(inputNumber) + parityBit);
    }  
} 