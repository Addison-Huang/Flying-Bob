import java.util.Stack;
import java.util.ArrayList;

public class Student extends User implements Comparable {

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
	if (schedule[0] == null) {
	    System.out.println("You have no schedule");
	}
	else {
	    for (int i = 1; i <= schedule.length; i++) {
		System.out.println(i + " " + schedule[i].getTeacher() + " " + schedule[i].getSubject());
	    }
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

    public int compareTo(Object a) {
	Student s = (Student) (a);
	if (this.getGrade() > s.getGrade()) {
	    return 1;
	} else if (this.getGrade() == s.getGrade()) {
	    if (this.getGPA() > s.getGPA()) {
		return 1;
	    } else if (this.getGPA() == s.getGPA()) {
		return 0;
	    } else {
		return -1;
	    }
	} else {
	    return -1;
	}
    }

    public void chooseClasses() {
	if ((LCourse.getCourses()).size() == 0) {
	    System.out.println("There are no classes");
	}
	else {
	    LCourse.printCourses();
	    System.out.println("Type the name of the courses you want to apply for. You must pick 5");
	    for (int i = 0; i < 5; i ++) {
		String a = IOTools.readLine();
		ArrayList<Course> courses = LCourse.getCourses();
		for (int j = 0; j < courses.size(); j ++) {
		    if (a == courses.get(j).getSubject()) {
			courses.get(j).addStudent(this);
		    }
		}
	    }	     
	}
    }

    public String toString() {
	return "name: " + username + " id: " + id + " GPA: " + gpa + " grade: " + grade;
    }
    
}
