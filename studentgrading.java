package student;

import java.util.Scanner;

public class studentgrading {

	
	public static void main(String[] args) { Scanner sc = new Scanner(System.in);

    int totalStudents = 0;
    int passes = 0;
    int fails = 0;

    System.out.println("Enter student's marks (0-100). Type -1 to finish.");

    while (true) {
        System.out.print("Enter mark (or -1 to end): ");
        int mark = sc.nextInt();

        if (mark == -1) {
            break; // stop when sentinel is entered
        }

        if (mark < 0 || mark > 100) {
            System.out.println("  Invalid mark. Please enter 0–100.");
            continue; // skip invalid mark
        }

        totalStudents++;

        String grade;
        if (mark >= 80) {
            grade = "A";
        } else if (mark >= 70) {
            grade = "B";
        } else if (mark >= 60) {
            grade = "C";
        } else if (mark >= 50) {
            grade = "D";
        } else {
            grade = "F";
        }

        System.out.println("  Grade: " + grade);

        if (mark >= 50) {
            passes++;
        } else {
            fails++;
        }
    }

    // Summary report
    System.out.println("\n===== CLASS SUMMARY =====");
    System.out.println("Total students entered: " + totalStudents);
    System.out.println("Passed: " + passes);
    System.out.println("Failed: " + fails);

    if (totalStudents > 0) {
        double passRate = (passes * 100.0) / totalStudents;
        System.out.println("Class pass rate: " + passRate + "%");
    } else {
        System.out.println("No student marks were entered.");
    }

    sc.close();
}

	}

