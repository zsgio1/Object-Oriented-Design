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
	Student student = new Student(null);
	
	public void createUnits() {
		units[0] = new Unit("FIT2099","Object Oriented Design");
		units[1] = new Unit("SCI2010","Scientific Practice");
		units[2] = new Unit("ENG1003","Mobile Apps");
	
		for (int i = 0; i < 3; i++) {
			System.out.print("Students enrolled in " + units[i].description() + "\n");
			student = new Student(readString("Student's ID: "),readString("Student's given name: "),readString("Student's family name: "));
			units[i].enrolStudent(student);
		}
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
		units[0].getStudents();
		
		System.out.println(units[1].description());
		units[1].getStudents();
		
		System.out.println(units[2].description());
		units[2].getStudents();
	}
	
	public void printStatus() {
		System.out.println("Welcome to Java University");
		
		createUnits();
		displayUnits();
		
		System.out.println();
		System.out.println("Thank you for using Java University");
	}
}
