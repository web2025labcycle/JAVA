package LABCYCLE;


	import java.util.Scanner;

	public class vowels_consonants {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	       
	        System.out.print("Enter a line of text: ");
	        String input = scanner.nextLine();

	        
	        int vowelCount = 0, consonantCount = 0;

	        
	        input = input.toLowerCase();

	        
	        for (int i = 0; i < input.length(); i++) {
	            char ch = input.charAt(i);

	            
	            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
	                vowelCount++;
	            }
	            
	            else if (ch >= 'a' && ch <= 'z') {
	                consonantCount++;
	            }
	        }

	        
	        System.out.println("Number of vowels: " + vowelCount);
	        System.out.println("Number of consonants: " + consonantCount);

	        scanner.close();
	    }
	}



