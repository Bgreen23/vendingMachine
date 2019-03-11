package test260;

import java.util.Scanner;

//The task is for you to design a Vending Machine which
//
//Accepts coins of 1,5,10,25 Cents i.e. penny, nickel, dime, and quarter.
//
//Allow user to select products Coke(25), Pepsi(35), Soda(45)
//
//Allow user to take refund by canceling the request.
//
//Return selected product and remaining change if any
//
//Allow reset operation for vending machine supplier.
public class VendingMachine {

	public static void main(String[] args) {
		Selection();
	}
	
	public static void Selection() {
		System.out.println("\nVENDING MACHINE\n");
	    System.out.println("Coke Press 1");
	    System.out.println("Pepsi Press 2");
	    System.out.println("Soda Press 3");   
	    System.out.println("Please enter your selection.");
	    Scanner input = new Scanner(System.in);
	    int choice = input.nextInt();
	    
	    if (choice == 1) {
	    	Coke();
	    }else if (choice == 2) {
	    	Pepsi();   	
	    }else if (choice == 3) {
	    	Soda();
	    }else {
	    	System.out.print("Please make a valid selection\n");
	    	Selection();
	    }
	    input.close();
	 }
	
	public static void Coke() {
		int Coke = 25;
		int amountOwed = 0 + Coke;
			System.out.println("You've selected a Coke. Please insert 25 cents to recieve product or press 8 to cancel order.");
			System.out.println("Please insert your coins.");
			Scanner input = new Scanner(System.in);
		int credit = input.nextInt();
		if (credit == amountOwed) {
			System.out.print("Enjoy!\n");
			Selection();
		}else if (credit >= amountOwed) {
   		 	System.out.println(credit - amountOwed + " cents refunded");
   		 	System.out.print("Enjoy!\n");
   		 	Selection();
		}else if (credit == 8) {
			System.out.println("Order Canceled");
   		 	Selection();
		}else {
			System.out.println("Not enough. Please insert more coins");
   		 	System.out.println(credit + " cents returned\n");
   		 	Coke();
 	    }
		input.close();
	}
	public static void Pepsi() {
		int Pepsi = 35;
		int amountOwed = 0 + Pepsi;
			System.out.println("You've selected a Pepsi. Please insert 35 cents to recieve product or press 8 to cancel order.");
			System.out.println("Please insert your coins.");
			Scanner input = new Scanner(System.in);
		int credit = input.nextInt();
		if (credit == amountOwed) {
			System.out.print("Enjoy!\n");
			Selection();
		}else if (credit >= amountOwed) {
   		 	System.out.println(credit - amountOwed + " cents refunded");
   		 	System.out.print("Enjoy!\n");
   		 	Selection();
		}else if (credit == 8) {
			System.out.println("Order Canceled");
   		 	Selection();
		}else {
   		 	System.out.println("Not enough. Please insert more coins");
   		 	System.out.println(credit + " cents returned\n");
   		 	Pepsi();
 	    }
		input.close();
	}
	public static void Soda() {
		int Soda = 45;
		int amountOwed = 0 + Soda;
			System.out.println("You've selected a Soda. Please insert 45 cents to recieve product or press 8 to cancel order.");
			System.out.println("Please insert your coins.");
			Scanner input = new Scanner(System.in);
		int credit = input.nextInt();
		if (credit == amountOwed) {
			System.out.print("Enjoy!\n");
			Selection();
		}else if (credit >= amountOwed) {
   		 	System.out.println(credit - amountOwed + " cents refunded");
   		 	System.out.print("Enjoy!\n");
   		 	Selection();
		}else if (credit == 8) {
			System.out.println("Order Canceled");
   		 	Selection();
		}else {
   		 	System.out.println("Not enough. Please insert more coins");
   		 	System.out.println(credit + " cents returned\n");
   		 	Soda();
 	   	}
		input.close();
	}
}


