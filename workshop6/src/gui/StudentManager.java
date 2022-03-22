package gui;
/**
 *
 * @author raekyo
 */
import api.Menu;
import dto.StudentList;

public class StudentManager {
	public static void main(String[] args){
		// options in menu
		String[] options = {"Add new student", "Search a student",
			"Update name and mark", "Remove a student", "List all",
			"Quit"};
		int choice = 0; // user choice
                StudentList list = new StudentList();
		do{
			System.out.println("\nStudent managing program");
			choice = Menu.getChoice(options);
			switch(choice){
				case 1: list.addStudent(); break; // add new student
				case 2: list.searchStudent(); break; // searchStudent
				case 3: list.updateStudent(); break; // update Student
				case 4: list.removeStudent(); break; // remove student
				case 5: list.printAll(); break; // print all students
				default: System.out.println("Bye!");}
                }while(choice>0 && choice<6);
                
	}	
}// end StudentManager class
