package rgt_taining_task2;

import java.util.Scanner;

public class Library {
	private static final int MAX_BOOKS = 10;
	private static final int MAX_PATRONS = 5;
	private static String[] books = new String[MAX_BOOKS];
	private static String[] patrons = new String[MAX_PATRONS];
	private static String[] author = new String[MAX_BOOKS];

	int bookCount = 0;
	int authorCount = 0;
	int patronsCount = 0;
	int availablebooksCount = 0;
	int barrowCount = 0;

	private static String[] availablebooks = new String[MAX_BOOKS];
	private static String[] barrowbooks = new String[MAX_BOOKS];
	Scanner sc = new Scanner(System.in);

	public void addBooks(String bookTitle, String bookAuthor) {
		if (bookCount <= MAX_BOOKS) {
			if (bookCount == 0) {
				books[bookCount++] = bookTitle;
				availablebooks[availablebooksCount++] = bookTitle;
				author[authorCount++] = bookAuthor;
				System.out.println("Book added Successfully");
			} else {
				if (!bookexist(bookTitle)) {
					books[bookCount++] = bookTitle;
					availablebooks[availablebooksCount++] = bookTitle;
					author[authorCount++] = bookAuthor;
					System.out.println("Book added Successfully");
				} else {
					System.out.println("Book Already exist");
				}
			}
		}
	}

	public void addPatrons(String userName) {
		if (patronsCount <= MAX_PATRONS) {
			if (patronsCount == 0) {
				patrons[patronsCount++] = userName;
				System.out.println("Patron added Successfully");
			} else {
				if (!patronsexist(userName)) {
					patrons[patronsCount++] = userName;
					System.out.println("Patron added Successfully");
				} else {
					System.out.println("Patron Already Exist");
				}
			}
		}
	}

	public void barrowBooks(String bookTitle, String userName) {
		if (availablebooksCount == 0) {
			System.out.println("No Books are available, Please add books into library...");
		} else {
			if (patronsexist(userName)) {
				if (availableBooks(bookTitle)) {
					barrowbooks[barrowCount++] = bookTitle;
					System.out.println("Book borrowed Successfully");
					for (int i = 0; i < availablebooksCount; i++) {
						if (availablebooks[i].equalsIgnoreCase(bookTitle)) {
							for (int j = i; j < availablebooks.length - 1; j++) {
								availablebooks[j] = availablebooks[j + 1];
							}
							availablebooksCount--;
							break;
						}
					}
				} else {
					System.out.println("This book is not available ");
				}
			} else {
				System.out.println("patron doesnot exist");
			}

		}
	}

	public void returnBook(String bookTitle) {
		if (bookexist(bookTitle)) {
			if (barrowBooks(bookTitle)) {
				availablebooks[availablebooksCount++] = bookTitle;
				System.out.println("Book returned Successfully");
				for (int i = 0; i < barrowCount; i++) {
					for (int j = i; j < barrowbooks.length - 1; j++) {
						barrowbooks[j] = barrowbooks[j + 1];
					}
					barrowCount--;
					break;
				}
			} else {
				System.out.println("This book is not yet borrowed");
			}
		} else {
			System.out.println("This book Invalid book");
		}
	}

	public boolean bookexist(String bookTitle) {
		for (int i = 0; i < bookCount; i++) {
			if (books[i].equalsIgnoreCase(bookTitle)) {
				return true;
			}
		}
		return false;
	}

	public boolean authorexist(String bookAuthor) {
		for (int i = 0; i < authorCount; i++) {
			if (author[i].equalsIgnoreCase(bookAuthor)) {
				return true;
			}
		}
		return false;
	}

	public boolean patronsexist(String userName) {
		for (int i = 0; i < patronsCount; i++) {
			if (patrons[i].equalsIgnoreCase(userName)) {
				return true;
			}
		}
		return false;
	}

	public boolean availableBooks(String bookTitle) {
		for (int i = 0; i < availablebooksCount; i++) {
			if (availablebooks[i].equalsIgnoreCase(bookTitle)) {
				return true;
			}
		}
		return false;
	}

	public boolean barrowBooks(String bookTitle) {
		for (int i = 0; i < barrowCount; i++) {
			if (barrowbooks[i].equalsIgnoreCase(bookTitle)) {
				return true;
			}
		}
		return false;
	}

	public boolean bookcount()

	{

		if (bookCount == MAX_BOOKS) {

			return false;

		}

		return true;

	}

	public boolean patronscount()

	{

		if (patronsCount == MAX_PATRONS) {

			return false;

		}

		return true;

	}
}
