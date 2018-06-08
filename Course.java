import java.util.PriorityQueue;
import java.util.ArrayList;

//class Course
public class Course implements Comparable {

    //instance variables
    private String teacher;
    private String subject;
    private int period;
    private int numStudents;
    private int maxStudents;
    private PriorityQueue<Student> waitlist;
    private ArrayList<Student> roster;

    //constructor
    public Course(String t, String s, int p) {
        teacher = t;
        subject = s;
        period = p;
        numStudents = 0;
        maxStudents = 5;

        waitlist = new PriorityQueue<Student>();
        roster = new ArrayList<Student>();
    }
    //overloaded constructor
    public Course(String t, String s, int p, PriorityQueue<Student> students, ArrayList<Student> rost) {
        teacher = t;
        subject = s;
        period = p;
        numStudents = 0;
        maxStudents = 5;

        waitlist = students;
        roster = rost;
    }

    //accessors and mutators
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
  public ArrayList getRoster(){
    return roster;
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

    public int compareTo(Object cour) {
        Course c = (Course) cour;
        return this.getSubject().compareTo(c.getSubject());
    }

    public PriorityQueue<Student> setWaitList(PriorityQueue<Student> s) {
        PriorityQueue<Student> temp = new PriorityQueue();
        temp = waitlist;
        waitlist = s;
        return temp;
    }

    //overriden too string
    public String toString() {
	return "Subject: "+  subject + " Teacher: " + teacher + " Period: " + period;
    }

    public void approveStudents() {
	if (maxStudents < waitlist.size()) {
	    for (int i = 0; i < maxStudents; i++) {
		roster.add(waitlist.poll());
	    }
	}
	else {
	    for (int i = 0; i < waitlist.size(); i++) {
		roster.add(waitlist.poll());
	    }
	}
	for (int i =0; i < roster.size(); i++) {
	    roster.get(i).joinClass(this);
	}
    }

    public void joinStudent(Student s) {
	roster.add(s);
    }
	
}
