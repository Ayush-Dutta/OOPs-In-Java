import java.util.Arrays;

import java.util.Scanner;

class MergeArrays {

    public static void main(String args[]) 
	{

        	Scanner sc = new Scanner(System.in);
		System.out.print("Enter the size of array A: ");
		int sizeA = sc.nextInt();
		System.out.print("Enter the size of array B: ");
		int sizeB = sc.nextInt();

		int[] A = new int[sizeA];
		System.out.println("Enter elements for array A :");
		for (int i = 0; i < sizeA; i++) 
		{
	            A[i] = sc.nextInt();

        	}

		int[] B = new int[sizeB];
		System.out.println("Enter elements for array B :");
		for (int i = 0; i < sizeB; i++) 
		{
	            B[i] = sc.nextInt();

	        }

		int C[] = mergeArrays(A, B);
		Arrays.sort(C);
		System.out.println("Merged and sorted array C:");
		System.out.println(Arrays.toString(C));
		sc.close();
	}

	
public static int[] mergeArrays(int[] A, int[] B)
{
	int lengthA = A.length;
        int lengthB = B.length;
        int C[] = new int[lengthA + lengthB];

	int i = 0, j = 0, k = 0;
	while (i < lengthA && j < lengthB)
	{
		if (A[i] < B[j]) 
		{
                	C[k++] = A[i++];

            	} 
		else 
		{
                	C[k++] = B[j++];

            	}
	}
	
        while (i < lengthA) 
	{
            C[k++] = A[i++];
        }

 
        while (j < lengthB) 
	{
            C[k++] = B[j++];

        }
	return C;
	}
}