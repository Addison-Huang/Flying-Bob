import java.util.PriorityQueue;

public class Course implements Comparable{
    private String teacher;
    private int period;
    private String subject;
    private int maxStudents;
    private int numStudents;
    private PriorityQueue<Student> waitlist;

    public String getTeacher() {
	return teacher;
    }

    public String setTeacher(String t) {
	String temp = teacher;
	teacher = t;
	return temp;
    }

    public int getPeriod() {
	return period;
    }

    public int setPeriod(int p) {
	int temp = period;
	period = p;
	return temp;
    }

    public String getSubject() {
	return subject;
    }

    public String setSubject(String s) {
	String temp = subject;
	subject = s;
	return temp;
    }

    public int getMaxStudents() {
	return maxStudents;
    }

    public int setMaxStudents(int s) {
	int temp = maxStudents;
	maxStudents = s;
	return temp;
    }

    public int getNumStudents() {
	return numStudents;
    }

    public int setNumStudents(int s) {
	int temp = numStudents;
	numStudents = s;
	return temp;
    }

    public void addStudent(Student s) {
	waitlist.add(s);
    }

    public boolean removeStudent(Student s) {
	return waitlist.remove(s);
    }

    public PriorityQueue<Student> getWaitlist() {
	return waitlist;
    }
  public int compareTo(Object cour){
    Course c = (Course) cour;
    return this.getSubject().compareTo(c.getSubject());
  }

    public PriorityQueue<Student> setWaitList(PriorityQueue<Student> s) {
	PriorityQueue<Student> temp = new PriorityQueue();
	temp = waitlist;
	waitlist = s;
	return temp;
    }
	
	
}
