package LABCYCLE;


	import java.util.Arrays;

	public class sort_array_string {
	    public static void main(String[] args) {
	        
	        String[] strings = {"Banana", "Apple", "Kiwi", "Blueberry", "Orange", "Rasberry"};

	       
	        Arrays.sort(strings);

	        
	        System.out.println("Sorted array of strings:");
	        for (String str : strings) {
	            System.out.println(str);
	        }
	    }
	}



