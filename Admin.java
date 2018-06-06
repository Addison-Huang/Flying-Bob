public class Admin extends User{

    public Admin(String u, String p) {
	super.this(u, p);
    }

    public Course addCourse(Course c) {
	System.out.println(LCourse.addCourse(c));
	return c;
    }

    public Course removeCourse(Course c) {
	System.out.println(LCourse.removeCourse(c));
	return c;
    }

    public boolean addStudent(Student s, Course c) {
	return c.addStudent(s);
    }

    public Student removeStudent(int id) {
        return LStudent.removeStudent(id);
    }

    public Student getStudent(int id) {
        return LStudent.getStudent(int id);
    }

    public boolean addStudentInfo(String info) {
	return true;
    }
} 
