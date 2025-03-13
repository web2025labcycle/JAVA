package LABCYCLE;


	import java.util.Scanner;

	public class string_palindrome {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	       
	        System.out.print("Enter a string: ");
	        String input = scanner.nextLine();

	        
	        String processedString = input.replaceAll("\\s+", "").toLowerCase();

	      
	        String reversedString = new StringBuilder(processedString).reverse().toString();

	       
	        if (processedString.equals(reversedString)) {
	            System.out.println("\"" + input + "\" is a palindrome.");
	        } else {
	            System.out.println("\"" + input + "\" is not a palindrome.");
	        }

	        scanner.close();
	    }
	}



