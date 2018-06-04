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

    public Student addStudent() {}

    public Student removeStudent() {}

    public Student getStudent(int id) {}

    public boolean addStudentInfo(String info) {}
} 
