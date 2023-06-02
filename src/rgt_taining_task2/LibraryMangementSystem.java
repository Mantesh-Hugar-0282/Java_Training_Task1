package rgt_taining_task2;

import java.util.Scanner;

public class LibraryMangementSystem {

	public static void main(String[] args) {
		Book b = new Book();
		Scanner sc = new Scanner(System.in);
		int choice;
		System.out.println("Welcome to Library Management System");
		do {
			System.out.println("1:Add Book");
			System.out.println("2:Add Patron");
			System.out.println("3:Barrow Book");
			System.out.println("4:Return Book");
			System.out.println("5:Exit");
			System.out.println("Choose an Option: ");

			choice = sc.nextInt();
			switch (choice) {
			case 1: {
				b.addBook();
				break;
			}
			case 2: {
				b.addPatron();
				break;
			}
			case 3: {
				b.barrowBook();
				break;
			}
			case 4: {
				b.returnBook();
				break;
			}
			case 5: {
				System.out.println("Bye, See You Again !");
				break;
			}
			default:
				System.out.println("Invalid option");
			}
		} while (choice != 5);
		System.out.println("Thanks for using library books,Please visit again !");
		sc.close();
	}

}
