package LABCYCLE;

import java.util.Scanner; 

public class salary {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Enter designation (Manager, Developer, Intern): ");
        String designation = scanner.nextLine();

        
        System.out.print("Enter years of experience: ");
        int experience = scanner.nextInt();

        
        double baseSalary;
        switch (designation.toLowerCase()) {
            case "manager":
                baseSalary = 50000;
                break;
            case "developer":
                baseSalary = 30000;
                break;
            case "intern":
                baseSalary = 15000;
                break;
            default:
                System.out.println("Invalid designation.");
                return; 
        }

        
        double bonus = 0;
        if (experience >= 3 && experience <= 5) {
            bonus = 0.10 * baseSalary; 
        } else if (experience > 5) {
            bonus = 0.20 * baseSalary; 
        }

        
        double totalSalary = baseSalary + bonus;

        
        System.out.println("Base Salary: " + baseSalary);
        System.out.println("Bonus: " + bonus);
        System.out.println("Total Salary: " + totalSalary);

        scanner.close();
    }
}
