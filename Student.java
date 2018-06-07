import java.util.Stack;

public class Student extends User {

	// instance variables
	private int id;
	private Course[] schedule;
	private int grade;
	private double gpa;

	static int stdIDs = 1;

	public Student(String u, String p, int g, double a) {
		super(u, p);
		id = stdIDs++;
		schedule = new Course[8];
		grade = g;
		gpa = a;
	}

	// accessors and mutators
	public Course[] getSchedule() {
		return schedule;
	}

	public Course[] setSchedule(Course[] s) {
		Course[] temp = new Course[schedule.length];
		schedule = s;
		return temp;
	}

	public double getGPA() {
		return gpa;
	}

	public int getGrade() {
		return grade;
	}

	public int getId() {
		return id;
	}

	public int setId(int n) {
		int temp = id;
		id = n;
		return temp;
	}

	public void printSchedule() {
		for (int i = 1; i <= schedule.length; i++) {
			System.out.println(i + " " + schedule[i].getTeacher() + " " + schedule[i].getSubject());
		}
	}

	public void printScheduleReverse() {
		Stack<Course> reverser = new Stack();
		for (Course x : schedule) {
			reverser.push(x);
		}
		while (!reverser.isEmpty()) {
			Course temp = reverser.peek();
			System.out.println(reverser.size() + " " + temp.getTeacher() + " " + temp.getSubject());
			reverser.pop();
		}
	}

	public boolean chooseClasses() {
		return true;
	}
}
