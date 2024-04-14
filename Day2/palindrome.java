import java.util.Scanner;

class Palindrome 
{
    public static void main(String args[]) 
    {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter a number or a string: ");
            String input = scanner.nextLine();

            if (isPalindrome(input)) 
        {
                    System.out.println(input + " is a palindrome.");
            } 
        else 
        {
                    System.out.println(input + " is not a palindrome.");
            }

            scanner.close();
    }

    public static boolean isPalindrome(String str)
    {
            int length = str.length();
	    String lower_string=str.toLowerCase();
            for (int i = 0; i < length / 2; i++) 
        {
                if (lower_string.charAt(i) != lower_string.charAt(length - i - 1)) {
                    return false;
            }
        }
        return true;
    }
}

 