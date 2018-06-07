public class Temp {
    public void mainMenu2() {
	System.out.println("------------------------------");
	System.out.println("What would you like to do?");
	System.out.println("1. Add a Course");
	System.out.println("2. Remove a Course");
	System.out.println("3. Add a Student");
	System.out.println("4. Remove a Student");
	System.out.println("5. Get a student");
	System.out.println("6. Generate Schedules");
	Systemp.out.println("7. Logout");
	System.out.println("------------------------------");

	int option = Integer.parseInt(IOTools.readLine());
	if (option == 1) {
	    System.out.println("Teacher?");
	    String teacher = IOTools.readLine();
	    System.out.println("Subject?");
	    String subject = IOTools.readLine();
	    System.out.println("Period?");
	    String period = IOTools.readline();
	    Course c = new Course(teacher,subject, period);
	    ((Admin)user).addCourse(c);
	    mainMenu2();
	}
	if (option == 2) {
	    ArrayList<Course> courses = LCourse.getCourses();
	    for (int i = 1; i <= courses.size(); i ++) {
		System.out.println(i + ". " + courses.get(i-1));
	    }
	    System.out.println((courses.size() + 1) + ". Go back");
	    int option = Integer.parseInt(IOTools.readLine());
	    if (option > courses.size())
		mainMenu2();
	    else {
		((Admin)user).removeCourse(i-1);
		mainMenu2();
	    }
	}
	if (option == 3) {
	    System.out.println("Username?");
	    String u = IOTools.readLine();
	    System.out.println("Pass?");
	    String p = IOTools.readLine();
	    System.out.println("Grade?");
	    int g = Integer.parseInt(IOTools.readLine());
	    System.out.println("GPA?");
	    double a = Double.parseDouble(IOTools.readLine());
	    Student s = new Student(u,p,g,a);
	    ((Admin)user).addStudent(s);
	    mainMenu2();
	}
	if (option == 4) {
	    LStudent.printStudents();
	    System.out.println("type the id of the student you want to remove");
	    int id = Integer.parseInt(IOTools.readLine());
	    ((Admin)user).removeStudent(id);
	    mainMenu2();
	}
	if (option == 5) {
	    System.out.println("type the id of the student you want to retrieve");
	    int id = Integer.parseInt(IOTools.readLine());
	    System.out.println(((Admin)user.getStudent(id)));
	}
	if (option == 6) {
	    System.out.println("lol");
	}
	if (option == 7) {
	    System.out.println("Logging out...");
	    return;
	}
    }
}
