import java.util.ArrayList;

//class LCourse
public class LCourse {
    //instance vars
    private static ArrayList<Course> courses = new ArrayList();

    //prints out the available courses
    public static void printCourses() {
	System.out.println("Current List of Courses Available: \n");
	for (int i = 0; i < courses.size(); i++) {
	    System.out.println(i +". " + courses.get(i));
	}
    }

    //adds Course c to the list of courses
    public static String addCourse(Course c) {
	courses.add(c);
	return "Added course " + c.getSubject() + "!";
    }

    //removes a course by its position in courses
    public static String removeCourse(int i) {
	Course c = courses.remove(i);
	return "Removed Course " + c + "!";
    }

    //accesor for courses
    public static ArrayList<Course> getCourses() {
	return courses;
    }

    //accesor for a course in courses
    public static Course getCourse(int n) {
	return courses.get(n);
    }
}


