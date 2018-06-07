import java.util.PriorityQueue;
import java.util.ArrayList;

public class Course implements Comparable {
    private String teacher;
    private String subject;
    private int period;
    private int numStudents;
    private int maxStudents;
    private PriorityQueue<Student> waitlist;
    private ArrayList<Student> roster;

    public Course(String t, String s, int p) {
        teacher = t;
        subject = s;
        period = p;
        numStudents = 0;
        maxStudents = 34;

        waitlist = new PriorityQueue<Student>();
        roster = new ArrayList<Student>();
    }

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

    public String toString() {
	return subject + " " + teacher;
    }

}
