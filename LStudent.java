import java.util.ArrayList;
public class LStudent {

    private ArrayList<Student> students;
    
    public LStudent() {
	ArrayList<Student> students = new ArrayList();
    }

    public void printStudents() {
	for (Student s: students) {
	    System.out.println(s);
	}
    }

    public Student getStudent(int id) {
	for (Student s: students) {
	    if (s.getId() == id)
		return s;
	}
    }
    
}
    
    
