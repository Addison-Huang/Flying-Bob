import java.util.ArrayList;

public class LCourse {
    //instance vars
    private static ArrayList<Course> courses = new ArrayList();

    //methods
    public static void printCourses() {
	String retVal = "Current List of Courses Available: \n";
	
	for (int i = 0; i < courses.size(); i++) {
	    retVal += courses.get(i) + "/n"; //make a toString for Course w/ subject, teacher

	System.out.println(retVal);
    }
    }

    public static String addCourse(Course c) {
	courses.add(c);
	return "Added course " + c.getSubject() + "!";
    }

    public static String removeCourse(int i) {
	Course c = courses.remove(i);
	return "Removed Course " + c + "!";
    }

    public static ArrayList<Course> getCourses() {
	return courses;
    }

    public static Course getCourse(int n) {
	return courses.get(n);
    }
}


