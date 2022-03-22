package gui;

import java.util.Scanner;
import dto.Book;

/**
 *
 * @author raekyo
 */
public class Tester {

	public static void main(String[] args) {
		int choice = 0;
		Scanner sc = new Scanner(System.in);
		Book b = null;

		do {
			System.out.println("1. Input Book");
			System.out.println("2, Output Book");
			System.out.println("3. Exit");

			System.out.print("Choice : ");
			choice = sc.nextInt();

			switch (choice) {
				case 1:
					b = new Book();
					System.out.println("Input Book");
					b.inputBook();
					break;

				case 2:
					if (b != null) {
						System.out.println("Output Book: ");
						b.outputBook();
					} else throw new NullPointerException("Obj Book not exist!");
					
					break;

				default:
					break;
			}

		} while (choice <= 2);
	}
}
