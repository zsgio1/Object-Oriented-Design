import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 
 */

/**
 * @author zacha
 *
 */
public class Student {

	private String studentid;
	private String givenName;
	private String familyName;
	
	public Student(String newStudentId) {
		
		studentid = newStudentId;
		
	}
	
	public Student(String newStudentId, String newGivenName, String newFamilyName) {
		
		givenName = newGivenName;
		studentid = newStudentId; 
		familyName = newFamilyName;
		
	}

	
	public void setGivenName(String newGivenName) {
		
		givenName = newGivenName;
		
	}
	
	public void setFamilyName(String newFamilyName) {
		
		familyName = newFamilyName;
		
	}
	
	public String description() {
		
		return studentid + " " + givenName + " " + familyName;
		
	}
}
