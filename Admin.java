public class Admin extends User{

    public Admin(String u, String p) {
	super.this();
    }

    public Course addCourse(Course c) {
	System.out.println(LCourses.addCourse(c));
	return c;
    }

    public Course removeCourse(Course c) {
	//binary search
		
    }

    public boolean addStudent(Student s, Course c) {
	return true;
    }

    public boolean removeStudent(Student s) {
	return true;
    }

    public Student getStudent(int id) {
        return LStudent.getStudent(int id);
    }

    public boolean addStudentInfo(String info) {
	return true;
    }
} 
