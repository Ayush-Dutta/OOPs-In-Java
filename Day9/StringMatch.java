import java.util.Scanner;

class NoMatchFoundException extends Exception {
    public NoMatchFoundException(String message) {
        super(message);
    }
}

public class StringMatch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); 

        System.out.print("Enter a string: ");
        String input = scanner.nextLine(); 

        try {
            if (!input.equals("University")) {
                throw new NoMatchFoundException("String does not match 'University'");
            } else {
                System.out.println("String matches 'University'");
            }
        } catch (NoMatchFoundException e) {
            System.out.println("Caught NoMatchFoundException: " + e.getMessage());
        } finally {
            scanner.close(); 
        }
    }
}