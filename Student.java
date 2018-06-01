public class Student extends User {

    private int id;
    private Course[] schedule;
    private int grade;
    private double gpa;

    public boolean chooseClasses() {
	return true;
    }

    public Course[] getSchedule() {
	
    }

    public Course[] setSchedule() {
	
    }
    
    public double getGPA() {
	return gpa;
    }

    public int getGrade() {
	return grade;
    }
    
}
