package dto;

import java.util.InputMismatchException;
import java.util.Scanner;



/**
 *
 * @author raekyo
 */
public class Book {

	private String id;
	private String title;
	private String publisher;

	// constructor
	public Book() {
	}

	public Book(String id, String title, String publisher) throws IllegalArgumentException {
		this.id = id;
		this.title = title;
		if (publisher.equals("Tuoi Tre") && publisher.equals("Nhi Dong") && 
			publisher.equals("Giap Duc")) 
			this.publisher = publisher;
		else throw new IllegalArgumentException("ERROR: Publisher is not supported");
		
	}

	public Book(Book b) {
		this.id = b.id;
		this.title = b.title;
		this.publisher = b.publisher;
	}

	// getter
	public String getId() {
		return id;
	}

	public String getTitle() {
		return title;
	}

	public String getPublisher() {
		return publisher;
	}

	// setter
	public void setId(String id) throws IllegalArgumentException {
		if(id == null || id.isEmpty())
			throw new IllegalArgumentException("ERROR: ID can not be Empty");
		else this.id = id;
	}

	public void setTitle(String title) throws IllegalArgumentException {
		if(title == null || title.isEmpty())
			throw new IllegalArgumentException("ERROR: Title cannot be Empty");
		else this.title = title;
		
	}

	public void setPublisher(String publisher) throws IllegalArgumentException {
		if (!publisher.equals("Tuoi Tre") || !publisher.equals("Nhi Dong") || 
			!publisher.equals("Giao Duc")) 
			throw new IllegalArgumentException("ERROR: Publisher is not supported");
		else this.publisher = publisher;
	}

	// method
	public void inputBook() {
		boolean con = false;
		do{
			try {
				Scanner sc = new Scanner(System.in);
				System.out.print("Input id: ");
				id = sc.nextLine();
				if (id == null || id.isEmpty()) 
					throw new InputMismatchException("ID cannot be Empty");
				

				sc = new Scanner(System.in);
				System.out.print("Input title: ");
				title = sc.nextLine();
				if (title == null || title.isEmpty()) 
					throw new InputMismatchException("Title cannot be Empty");
				

				sc = new Scanner(System.in);
				System.out.print("Input publisher: ");
				publisher = sc.nextLine();
				if (publisher == null || publisher.isEmpty()) 
					throw new InputMismatchException("Publisher cannot be Empty");
				else if (!publisher.equals("Tuoi Tre") && !publisher.equals("Nhi Dong")
					&& !publisher.equals("Giao Duc")) {
					throw new InputMismatchException("Publisher is not supported");
				}

				con = false;
			} catch (InputMismatchException e) {
				con = true;
				System.out.println("ERROR: " + e.getMessage());
			} catch (Throwable e) {
				System.out.println("ERROR: Fatal error, System exit");
				break;
			} 
		}while(con);

	} // end inputBook()

	public void outputBook() {
		System.out.println("ID: " + id);
		System.out.println("Title: " + title);
		System.out.println("Publisher: " + publisher);
	}// end outputBook()

}
