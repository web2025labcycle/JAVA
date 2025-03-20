package LABCYCLE;

public class Student {
	 private int studentId;
	    private String name;
	    private double marks;

	    // Constructor to initialize all fields
	    public Student(int studentId, String name, double marks) {
	        this.studentId = studentId;
	        this.name = name;
	        this.marks = marks;
	    }

	    // Method to display student details
	    public void displayDetails() {
	        System.out.println("\nStudent Details:");
	        System.out.println("ID: " + studentId);
	        System.out.println("Name: " + name);
	        System.out.println("Marks: " + marks);
	        System.out.println("Passed: " + (isPassed() ? "Yes" : "No"));
	    }

	    // Method to check if student has passed
	    public boolean isPassed() {
	        return marks >= 40;
	    }

	    // Main method to test the class
	    public static void main(String[] args) {
	        // Creating student objects
	        Student student1 = new Student(101, "Alice", 85.5);
	        Student student2 = new Student(102, "Bob", 39.0);
	        Student student3 = new Student(103, "Charlie", 50.0);

	        // Display details and pass status of students
	        student1.displayDetails();
	        student2.displayDetails();
	        student3.displayDetails();
	}
}