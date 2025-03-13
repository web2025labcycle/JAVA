package LABCYCLE;

import java.util.Scanner; 

public class Area_Perimeter_circle {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Enter the radius of the circle: ");
        double radius = scanner.nextDouble();

        
        double area = Math.PI * radius * radius;
        double perimeter = 2 * Math.PI * radius;

        
        System.out.println("Area of the circle is : " + area);
        System.out.println("Perimeter of the circle is : " + perimeter);

        scanner.close();
    }
}
