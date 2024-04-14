import java.util.*;

class ReverseString 
{
    public static void main(String[] a) 
	{
        String rev = "";
        for (int i = a.length - 1; i >= 0; i--) 
	{
            rev += a[i] + " ";
            for (int j = a[i].length() - 1; j >= 0; j--) 
		{
                	System.out.print(a[i].charAt(j));
            	}
            System.out.print(" ");
        }
        System.out.println(" ");
        System.out.println(rev);
    	}
}
