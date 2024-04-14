import java.util.*; 

class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int x = sc.nextInt();

        try {
            if (x < 0)
                throw new IllegalArgumentException("Value of x must be non-negative.");
            else if (x > 20) 
                throw new IllegalArgumentException("Result will overflow.");

            long[] result = new long[21];
            result[0] = 1;
            int last = 0;

            while (last < x) {
                result[last + 1] = result[last] * (last + 1);
                last++;
            }

            System.out.println("Factorial of " + x + " is " + result[x]);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}
