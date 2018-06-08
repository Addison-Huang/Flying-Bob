//class admin extends user
public class Admin extends User {

    //overloaded constructor
    public Admin(String u, String p) {
        super(u, p);
    }

    /*
    public void generateSchedules(int id) {
        if (id > LStudent.biggestID)
            return;
        else {
            for (Course c : LStudent.getStudent(id).getWants()) {

            }
        }
    }
    */

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
}
