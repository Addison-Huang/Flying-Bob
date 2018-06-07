import java.util.ArrayList;

public class LStudent {

  private static ArrayList<Student> students = new ArrayList(); 

  public static void addStudent(Student s){
    students.add(s);
  }
  public static int checkStudent(String u, String p){
    for (Student s: students){
      if (s.check(u,p)){
        return s.getId();
      }
    }
    return -1;
  } 

    public static void printStudents() {
	for (Student s : students) {
	    System.out.println(s);
	}
    }

    public static Student getStudent(int id) {
	for (Student s : students) {
	    if (s.getId() == id)
		return s;
	}
	return null;
    }

    public static Student removeStudent(int id) {
	Student s = getStudent(id);
	for (int i = 0; i < students.size(); i++) {
	    if (students.get(i) == s) {
		return students.remove(i);
	    }
	}
	return null;
    }
}
