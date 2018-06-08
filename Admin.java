import java.util.ArrayList;

//class admin extends user
public class Admin extends User {

    //overloaded constructor
    public Admin(String u, String p) {
        super(u, p);
    }
    
    //adds Course c to the list of courses
    public Course addCourse(Course c) {
        System.out.println(LCourse.addCourse(c));
        return c;
    }

    //removes a Course from the list of courses
    public void removeCourse(int i) {
        System.out.println(LCourse.removeCourse(i));
    }

    //adds Student s to the list of students
    public void addStudent(Student s) {
        LStudent.addStudent(s);
    }

    //removes a student by their id from the listen of students
    public Student removeStudent(int id) {
        return LStudent.removeStudent(id);
    }
    
    //retrieves a Student by their id
    public Student getStudent(int id) {
        return LStudent.getStudent(id);
    }

    //generates the schedules for every student
    public void generateSchedules() {
	//first approves students based on their choices and their position on the waitlist
        ArrayList<Course> c = LCourse.getCourses();
	for (int i = 0; i < c.size(); i ++) {
	    c.get(i).approveStudents();
	}
	LCourse.setCourses(c);
	ArrayList<Student> s = LStudent.getStudents();
	//if students are missing a class, they are given a random class
	for (int j = 0; j < s.size(); j++) {
	    if (s.get(j).getFirst()) {
		for (int i = 0; i < c.size(); i++) {
		    if (c.get(i).getPeriod() == 1 && c.get(i).getNumStudents() < 5 ){
			c.get(i).joinStudent(s.get(j));
			s.get(j).joinClass(c.get(i));
		    }
		}
	    }
	   if (s.get(j).getSecond()) {
		for (int i = 0; i < c.size(); i++) {
		    if (c.get(i).getPeriod() == 2 && c.get(i).getNumStudents() < 5 ){
			c.get(i).joinStudent(s.get(j));
			s.get(j).joinClass(c.get(i));
		    }
		}
	   }
	   if (s.get(j).getThird()) {
		for (int i = 0; i < c.size(); i++) {
		    if (c.get(i).getPeriod() == 3 && c.get(i).getNumStudents() < 5 ){
			c.get(i).joinStudent(s.get(j));
			s.get(j).joinClass(c.get(i));
		    }
		}
	    }
	}
		
	   
    }
}
