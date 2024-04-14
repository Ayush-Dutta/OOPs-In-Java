import java.util.*;
import java.lang.Math;
import java.util.Scanner;
class Armstrong
{

    public static void main(String args[]) 
	{
	
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter the Number:");
		int number =sc.nextInt();
        	int originalNumber,n,remainder, result = 0;

        	originalNumber = number;
		

        	while (originalNumber != 0)
        		{
            			remainder = originalNumber % 10;
				n = number;
				int length = (int)(Math.log10(n)+1);
            			result += Math.pow(remainder, length);
            			originalNumber /= 10;
        		}

        	if(result == number)
			{
            			System.out.println(number + " is an Armstrong number.");
			}
        	else
			{
				System.out.println(number + " is not an Armstrong number.");
			}
    	}
}