import java.util.HashMap;

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
	public HashMap<String, Student> enrolledStudents = new HashMap<String, Student>();
	
	public Unit(String unitCode, String unitName) {
		code = unitCode;
		name = unitName;
	}
	
	public String description() {
		return code + " " + name;
	}
	
	public String studentDescription(String key) {
		String student = ((Student) enrolledStudents.get(key)).description();
		return student;
	}
	
	public void enrolStudent(Student newStudent) {
		String id = newStudent.getId();
		enrolledStudents.put(id, newStudent);
	}
	
	public void getStudents() {
		for (String key : enrolledStudents.keySet()) {
			Student student = enrolledStudents.get(key);
			System.out.println(student.description());
			}
	}
	
	public boolean isEnrolled(String key) {
		return enrolledStudents.containsKey(key);
	}
	
	public void unenrolStudent(String key) {
		enrolledStudents.remove(key);
	}
}
