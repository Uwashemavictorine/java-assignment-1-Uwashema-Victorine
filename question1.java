package shema;

import java.util.Scanner;

public class question1 {
	 public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        // 1) Ask how many different items
	        System.out.print("How many different items did the customer buy? ");
	        int n = sc.nextInt();
	        sc.nextLine(); // consume newline

	        // Arrays to store data
	        String[] names = new String[n];
	        double[] price = new double[n];
	        int[] qty = new int[n];
	        double[] subtotal = new double[n];

	        double grandTotal = 0.0;

	        // 2) Input items
	        for (int i = 0; i < n; i++) {
	            System.out.println("\nItem " + (i + 1) + ":");
	            System.out.print("  Name: ");
	            names[i] = sc.nextLine();

	            System.out.print("  Price per unit: ");
	            price[i] = sc.nextDouble();

	            System.out.print("  Quantity purchased: ");
	            qty[i] = sc.nextInt();
	            sc.nextLine(); // consume newline

	            subtotal[i] = price[i] * qty[i];
	            grandTotal += subtotal[i];
	        }

	        double discount = 0.0;
	        if (grandTotal > 50000) {
	            discount = grandTotal * 0.05;
	        }
	        double finalAmount = grandTotal - discount;

	        System.out.println("\n========== RECEIPT ==========");
	        System.out.println("Item Name      | Quantity | Price per unit | Subtotal");
	        System.out.println("-----------------------------------------------------");
	        for (int i = 0; i < n; i++) {
	            System.out.println(names[i] + " | " + qty[i] + " | " + price[i] + " | " + subtotal[i]);
	        }
	        System.out.println("-----------------------------------------------------");
	        System.out.println("Grand Total (before discount): " + grandTotal);
	        System.out.println("Discount: " + discount);
	        System.out.println("Final Amount Payable: " + finalAmount);
	        System.out.println("=============================");

	        sc.close();
	    }
	}
		 