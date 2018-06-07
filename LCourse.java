import java.util.ArrayList;

public class LCourse {
    //instance vars
    private static ArrayList<Course> courses;

    public LCourse() {
	courses = new ArrayList();
    }

    //methods
    public static void printCourses() {
	String retVal = "Current List of Courses Available: \n";
	
	for (Course c : courses)
	    retVal += c + "/n"; //make a toString for Course w/ subject, teacher

	System.out.println(retVal);
    }

    public static String addCourse(Course c) {
	courses.add(c);
	return "Added course " + c.getSubject() + "!";
    }

    public static String removeCourse(Course c) {
	//need to implement
	return "Removed Course " + c.getSubject() + "!";
    }

    public static ArrayList<Course> getCourses() {
	return courses;
    }
}


