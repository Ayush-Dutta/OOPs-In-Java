import java.util.Scanner;
class LinEqu 
	{
	    public static void main(String args[]) 
		{
        		Scanner sc = new Scanner (System.in);

			System.out.println("Enter the value of a:");
			int a = sc.nextInt();

			System.out.println("Enter the value of b:");
			int b = sc.nextInt();

			System.out.println("Enter the value of c:");
			int c = sc.nextInt();

			System.out.println("Enter the value of d:");
			int d = sc.nextInt();

			System.out.println("Enter the value of m:");
			int m = sc.nextInt();

			System.out.println("Enter the value of n:");
			int n = sc.nextInt();

			int den = a * d - b * c;

			int p1 = m * d - b * n;

			int p2 =n * a - m * c;

			if (den == 0)
			{
				System.out.println("Solution is not possible as denominator is 0.");
			}
			else
			{
				float x1 = p1 / den;

				float x2 = p2 / den;

				System.out.println("Value of X1 is = " + x1);

				System.out.println("Value of X2 is = " + x2);

			}
		}
	}