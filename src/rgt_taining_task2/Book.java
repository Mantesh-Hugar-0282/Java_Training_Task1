package rgt_taining_task2;
import java.util.Scanner;


public class Book {

	Library lb = new Library();
	Scanner sc = new Scanner(System.in);

	int choice;
	String bookTitle;
	String bookAuthor;
	String bookPatron;

	public void addBook() {
		if (lb.bookcount()) {
			System.out.println("Enter Book Title:");
			bookTitle = sc.next();
			System.out.println("Enter Author Name:");
			bookAuthor = sc.next();
			lb.addBooks(bookTitle, bookAuthor);
		} else {
			System.out.println("You are not able to add more books !");
			System.out.println("Please Select Another Option");
		}

	}

	public void addPatron() {
		if (lb.patronscount()) {
			System.out.println("Enter Patron Name :");
			bookPatron = sc.next();
			lb.addPatrons(bookPatron);
		} else {
			System.out.println("You are not able to add more patrons !");
			System.out.println("Please Select Another Option");
		}
	}

	public void barrowBook() {
		System.out.println("Enter patron name :");
		bookPatron = sc.next();
		System.out.println("Enter book title:");
		bookTitle = sc.next();
		lb.barrowBooks(bookTitle, bookPatron);
	}

	public void returnBook() {
		System.out.println("Enter book title:");
		bookTitle = sc.next();
		lb.returnBook(bookTitle);
	}
}
