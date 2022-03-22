package dto;

/**
 *
 * @author raekyo
 */
import java.util.ArrayList;
import api.Inputter;

public class StudentList extends ArrayList<Student> {
	public StudentList(){
	    super();
    	}

	// search a student based on student's code. Return the student found
	// This method supports preventing code duplications
	public Student search(String code){
		code = code.trim().toUpperCase();
		for(int i=0; i<this.size(); i++)
			if(this.get(i).getCode().equals(code))
				return this.get(i); // found
		return null;
	}	

        private boolean isCodeDuplicated(String code){
            code = code.trim().toUpperCase();
            return search(code)!=null;
        }

	// add new student
	public void addStudent(){
		// Input data of new student
		String newCode, newName;
		int newMark;
		boolean codeDuplicated = false;
		do{ // pattern: s000 || S000 ==> Pattern: "[sS][\\d}{3}"
		    newCode = Inputter.inputPattern("St. code s000: ", "[sS][\\d]{3}");
		    newCode = newCode.trim().toUpperCase();
		    codeDuplicated = isCodeDuplicated(newCode); // check code dupplicated
		    if(codeDuplicated) System.out.println("Code is duplicated");
		}
		while(codeDuplicated==true);

		newName = Inputter.inputNonBlankStr("Name of new Student: ");
		newName = newName.toUpperCase();
		newMark = Inputter.inputInt("Mark: ", 0, 10); // 0 <= max <= 10
		// create a new student
		Student st = new Student(newCode, newName, newMark);
		// add new Student to the list
		this.add(st);
		System.out.println("Student " + newCode + " has been added.");
	}


	// search student based on inputted code
	public void searchStudent(){
		if(this.isEmpty()){
			System.out.println("Empty list. No search can be performed!");
		}else{
			String sCode = Inputter.inputStr("Input student coe for search: ");
			Student st = this.search(sCode); // search Student based on code
			if(st == null) 
				System.out.println("Student " + sCode + "doesn;t existed!");
			else System.out.println("Found: " + st);
		}
	}



	// update name and mark based on studnet's code
	public void updateStudent(){
		if(this.isEmpty())
			System.out.println("Empty list. No update can be performed!");
		else{
			String uCode = Inputter.inputStr("Input code of updated student:");
			Student st = this.search(uCode); // search student
			if(st == null) 
				System.out.println("Student " + uCode + "doesn't existed!");
			else{
				// update student's name
				String oldName = st.getName();
				String msg = "Old Name: " + oldName + ". new name:";
				String newName = Inputter.inputNonBlankStr(msg);
				st.setName(newName);

				// update student's mark
				int oldMark = st.getMark();
				msg = "Old Mark: " + oldMark + ", new mark 0..10:";
				int newMark = Inputter.inputInt(msg, 0, 10);
				st.setMark(newMark);
				System.out.println("Student " + uCode + " has been updated.");
			}
		}
	}
	


	// remove a student based on student's code
	public void removeStudent(){
		if(this.isEmpty())
			System.out.println("Empty list. No remove can be performed!");
		else{
			String rCode = Inputter.inputStr("Input code of removed student:");
			Student st = this.search(rCode); // search Student
			if(st == null)
				System.out.println("Student " + rCode + " doesn't existed!");
			else{
				this.remove(st); // remove this student
				System.out.println("Student " + rCode + " has been removed.");
			}
		}
	}



	//list all students
	public void printAll(){
		if(this.isEmpty())
			System.out.println("Empty list!");
		else{
			System.out.println("Student list:");
			for(Student st : this) System.out.println(st);
			System.out.println("Total: " + this.size() + " student(s).");
		}	
	}
}// end StudentList
