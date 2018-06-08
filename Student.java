import java.util.Stack;
import java.util.ArrayList;

public class Student extends User implements Comparable {

    // instance variables
    private int id;
    private ArrayList<Course> schedule;
    private int grade;
    private double gpa;
    private boolean needFirst;
    private boolean needSecond;
    private boolean needThird;

    static int stdIDs = 1;

    public Student(String u, String p, int g, double a) {
	super(u, p);
	id = stdIDs++;
	schedule = new ArrayList();
	grade = g;
	gpa = a;
	needFirst = needSecond = needThird = true;
    }

    // accessors and mutators
    public boolean getFirst() {
	return needFirst;
    }

    public boolean getSecond() {
	return needSecond;
    }

    public boolean getThird() {
	return needThird;
    }
    
    public int size() {
	return schedule.size();
    }

    public ArrayList<Course> getSchedule() {
	return schedule;
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
	if (schedule.size() == 0) {
	    System.out.println("You have no schedule");
	}
	else {
	    for (int i = 1; i <= schedule.size(); i++) {
		System.out.println("period: " +i + " teacher: " + schedule.get(i-1).getTeacher() + " subject: " + schedule.get(i-1).getSubject());
	    }
	}
    }

    public void printScheduleReverse() {
	if (schedule.size() == 0) {
	    System.out.println("You have no schedule");
	}
	else {
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

    public void chooseClasses(int period) {
	if ((LCourse.getCourses()).size() == 0) {
	    System.out.println("There are no classes");
	}
	else if (period > 3) {
	    return;
	}
	else {
	    LCourse.printCourses();
	    System.out.println("Type the number of the course you want to apply for. You are picking for period " + period);
	    int selection = Integer.parseInt(IOTools.readLine());
	    if (LCourse.getCourse(selection).getPeriod() == period) {
		System.out.println("You picked " + LCourse.getCourse(selection));
		LCourse.getCourse(selection).addStudent(this);
		chooseClasses(period+1);
	    }
	    else {
		System.out.println("Invalid choice");
		chooseClasses(period);
	    }
	        
	}
    }

    public void joinClass(Course c) {
	schedule.add(c);
	if (c.getPeriod() == 1) {
	    needFirst = false;
	}
	else if (c.getPeriod() == 2) {
	    needSecond = false;
	}
	else if (c.getPeriod() == 3) {
	    needThird = false;
	}	
    }


    public String toString() {
	return "name: " + username + " id: " + id + " GPA: " + gpa + " grade: " + grade;
    }
    
}
