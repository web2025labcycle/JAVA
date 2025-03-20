package LABCYCLE;

public class Rectangle {
    private double length;
    private double width;

    // Default constructor setting length and width to 1
    public Rectangle() {
        this.length = 1;
        this.width = 1;
    }

    // Parameterized constructor to initialize given values
    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    // Method to calculate area
    public double calculateArea() {
        return length * width;
    }

    // Method to calculate perimeter
    public double calculatePerimeter() {
        return 2 * (length + width);
    }

    // Display rectangle details
    public void displayRectangleInfo() {
        System.out.println("\nRectangle Details:");
        System.out.println("Length: " + length);
        System.out.println("Width: " + width);
        System.out.println("Area: " + calculateArea());
        System.out.println("Perimeter: " + calculatePerimeter());
    }

    // Main method to test the class
    public static void main(String[] args) {
        // Creating rectangles with different constructors
        Rectangle defaultRectangle = new Rectangle();
        Rectangle customRectangle = new Rectangle(5.0, 3.0);

        // Display details of both rectangles
        defaultRectangle.displayRectangleInfo();
        customRectangle.displayRectangleInfo();
    } 
} 
