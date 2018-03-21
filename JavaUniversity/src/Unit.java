/**
 * 
 */

/**
 * @author zacha
 *
 */
public class Unit {

	private String code;
	private String name;
	private Student[] students = new Student[0];
	
	public Unit(String unitCode, String unitName) {
		
		code = unitCode;
		name = unitName;
		
	}
	
	public String description() {
		
		return code + " " + name;
		
	}
	
	public String[] studentDescription() {
		
		String[] student = new String[students.length];
		for (int i = 0; i < students.length; i++) {
			
			student[i] = students[i].description();
		
		}
		
		return student;
		
	}
	
	public void enrolStudent(Student newStudent) {
		
		Student[] output = new Student[students.length + 1];
		for (int i = 0; i < students.length; i++) {
			
			output[i] = students[i];
			
		}
		
		output[students.length] = newStudent;
		students = output;
		
	}
	

}
