public class Admin extends User {

    public Admin(String u, String p) {
        super(u, p);
    }

<<<<<<< Updated upstream
     public Course addCourse(Course c) {
         System.out.println(LCourse.addCourse(c));
         return c;
     }

     public Course removeCourse(Course c) {
         System.out.println(LCourse.removeCourse(c));
         return c;
     }
=======
  public Course addCourse(Course c, LCourse L) {
	System.out.println(L.addCourse(c));
	return c;
    }

  public Course removeCourse(Course c, LCourse L) {
	System.out.println(L.removeCourse(c));
	return c;
    }
>>>>>>> Stashed changes

     public void addStudent(Student s, Course c) {
         c.addStudent(s);
     }

<<<<<<< Updated upstream
     public Student removeStudent(int id) {
         return LStudent.removeStudent(id);
     }

     public Student getStudent(int id) {
         return LStudent.getStudent(id);
     }
=======
  public Student removeStudent(int id, LStudent L) {
        return L.removeStudent(id);
    }

  public Student getStudent(int id, LStudent L) {
        return L.getStudent(int id);
    }
>>>>>>> Stashed changes

    public  boolean addStudentInfo(String info) {
        return true;
    }
}
