import java.util.Scanner;  
public class question7  
{  
    static void arrayOfMultiples(int base, int times)
	{
        int multiple = 0;
        int ans[] = new int[times];
        for (int i=0; i<times; i++)
		{
            		multiple = base * (i+1);
            		ans[i] = multiple;
        	}
        for (int a : ans)
		{
            		System.out.print(a + " ");
        	} 
    	}
    public static void main(String args[]) 
    {
        int base, times = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number");
        base = sc.nextInt();
        System.out.println("Enter the number of multiples needed");
        times = sc.nextInt();
        arrayOfMultiples(base, times);
    } 
}  