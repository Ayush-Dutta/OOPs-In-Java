import java.util.*;
class Cap 
	{
	    public static void main(String args[]) 
		{
			Scanner sc = new Scanner (System.in);
			System.out.println("Enter the Inductance:");
			double L=sc.nextDouble();
			System.out.println("Enter the Resistance:");
			double R=sc.nextDouble();
			double C=0.01d;
			for ( ; C <=0.1; C = C + 0.01)
				{
					double n1 = 1 / (L * C);
					double n2 = (R*R) / (4* C * C);
					double F = Math.sqrt(Math.abs(n1 - n2));
					double Z = Math.ceil(F * 100) / 100;
					System.out.println("Frequency = " + Z);
				}
		}
	}