import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/**
 * 
 */

/**
 * @author zacha
 *
 */
public class University {
	
	Unit[] units = new Unit[3];
	Student[] students = new Student[3];
	
	public void createUnits() {
		
		units[0] = new Unit("FIT2099","Object Oriented Design");
		units[1] = new Unit("SCI2010","Scientific Practice");
		units[2] = new Unit("ENG1003","Mobile Apps");

		students[0] = new Student(readString("Student's ID: "),readString("Student's given name: "),readString("Student's family name: "));
		students[1] = new Student(readString("Student's ID: "),readString("Student's given name: "),readString("Student's family name: "));
		students[2] = new Student(readString("Student's ID: "),readString("Student's given name: "),readString("Student's family name: "));
		
		units[0].enrolStudent(students[0]);
		units[0].enrolStudent(students[1]);
		units[1].enrolStudent(students[1]);
		units[1].enrolStudent(students[2]);
		units[2].enrolStudent(students[2]);
		units[2].enrolStudent(students[0]);
		
	}
	
	
	private String readString(String prompt) {
		
		System.out.print(prompt);
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String s = null;
		try {
			s = in.readLine();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return s;
	}
	
	public void displayUnits() {
		
		System.out.println(units[0].description());
		for (String element : units[0].studentDescription()) {
		    System.out.println(element);
		}
		System.out.println(units[1].description());
		System.out.println(Arrays.toString(units[1].studentDescription()));
		System.out.println(units[2].description());
		System.out.println(Arrays.toString(units[2].studentDescription()));
		
	}
	
	public void printStatus() {
		System.out.println("Welcome to Java University");
		
		createUnits();
		displayUnits();
		
		System.out.println();
		System.out.println("Thank you for using Java University");
		
		
	}
}
