package tracker;

import java.util.Scanner;

public class question3attendance {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);

	        // Ask total number of students in class
	        System.out.print("Enter total number of students in the class: ");
	        // Ask total number of days you want to record attendance
	        System.out.print("Enter number of days to record attendance: ");
	        int totalDays = sc.nextInt();

	        int dayCount = 0;
	        int sumAttendance = 0;

	        // Array is optional, but can use to store attendance per day
	        int[] attendance = new int[totalDays];

	        // Loop through each day
	        while (dayCount < totalDays) {
	            System.out.print("Enter number of students present on day " + (dayCount + 1) + ": ");
	            int present = sc.nextInt();

	            // Store attendance
	            attendance[dayCount] = present;
	            sumAttendance += present;

	            dayCount++;
	        }

	        // Print attendance list
	        System.out.println("\n===== ATTENDANCE LIST =====");
	        for (int i = 0; i < totalDays; i++) {
	            System.out.println("Day " + (i + 1) + " -> " + attendance[i] + " students present");
	        }

	        // Calculate and print average attendance
	        double average = (double) sumAttendance / totalDays;
	        System.out.println("\nAverage attendance per day: " + average);

	        sc.close();
	    }
	

	}
