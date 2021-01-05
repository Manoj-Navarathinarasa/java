package marks;

import java.util.Scanner;

public class Test {

    public static void main(String args[]) {
        float phy, chem, math;
        double total, average, percentage;
        Scanner scanner = new Scanner(System.in);
        // Input marks of all three subjects
        System.out.println("Please enter marks of three subjects");

        System.out.print("Enter marks of physics subjects:");
        phy = scanner.nextFloat();
        System.out.print("Enter marks of chemistry subjects:");
        chem = scanner.nextFloat();
        System.out.print("Enter marks of maths subjects:");
        math = scanner.nextFloat();

        // Calculate total, average and percentage
        total = phy + chem + math;
        average = (total / 3.0);
        percentage = (total / 300.0) * 100;

        // Print all results
        System.out.println("Total marks =" + total);
        System.out.println("Average marks = " + average);
        System.out.println("Percentage = " + percentage);
    }
}

