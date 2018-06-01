import java.util.ArrayList;
import java.util.PriorityQueue;

public class Course {

    private String subject;
    private String teacher;
    private int period;

    private ArrayList<Student> students;
    
    private int maxStudents;
    
    private PriorityQueue<Student> waitlist;
    
    public Course(String s, String t, int pd, int max) {
	subject = s;
	teacher = t;
	period = pd;
	maxStudents = max;

	students = new ArrayList<Student>();
	waitlist = new PriorityQueue<Student>();
    }

    //ACCESSORS
    public String getSubject() {
	return subject;
    }
    
    public String getTeacher() {
	return teacher;
    }

    public int getPeriod() {
	return period;
    }
    
    public int getNumStudents() {
	return students.size();
    }

    public int getMaxStudent() {
	return maxStudents;
    }


    
}
