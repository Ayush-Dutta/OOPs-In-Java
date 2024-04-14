import java.util.Scanner;

class CharacterCounter 
{
    public static void main(String[] args) 
	{
        	Scanner sc = new Scanner(System.in);

        	System.out.print("Enter a string: ");
        	String inputString = sc.nextLine();

        	int uppercaseCount = 0;
        	int lowercaseCount = 0;
        	int digitCount = 0;
        	int spaceCount = 0;

        
        	for (int i = 0; i < inputString.length(); i++) 
		{
            		char ch = inputString.charAt(i);
            		if (Character.isUpperCase(ch)) 
			{
                	uppercaseCount++;
            		} 
			else if (Character.isLowerCase(ch)) 	
			{
                	lowercaseCount++;
            		} 	
			else if (Character.isDigit(ch)) 
			{
                	digitCount++;
            		} 		
			else if (Character.isWhitespace(ch)) 
			{
               		 spaceCount++;
            		}
       		 }


        	System.out.println("Count of uppercase characters: " + uppercaseCount);
        	System.out.println("Count of lowercase characters: " + lowercaseCount);
        	System.out.println("Count of digits: " + digitCount);
        	System.out.println("Count of spaces: " + spaceCount);

        	sc.close();
    	}
}
