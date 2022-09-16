import java.util.Scanner;  
public class question6
{  
    static void checkRepdigit(int num){
        if (num<0){
            System.out.println("not a rep digit");
        }
        else if(num>10){
            System.out.println("rep digit");
        }
        else{
            while(num > 0){
                int digit = 0;
                boolean flag = false;
                int currentNum = 0;
                int count = 0;
                digit = num % 10;
                currentNum = digit;
                count++;
                if(count != 0){
                    if(currentNum != digit){
                        flag = true;
                }
        System.out.println(flag);
            }

        }
    }
    }
    public static void main(String args[]) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to check if it is a repdigit");
        int input = sc.nextInt();
        checkRepdigit(input);
    } 
}