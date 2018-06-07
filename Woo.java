import java.io.IOException;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.io.*;

public class Woo {// driver

    private User user;
   private boolean studentAccount;
    public void loginPrompt() throws IOException, FileNotFoundException {
	System.out.println("Hi there! Welcome to Flying Bob's Programming Program!");
	if (!IOTools.checkSave()) { // if save file doesn't exist, there's no way for a user to be returning
	    makeAcct();
	} else {
	    if (hasAccount())
		login();
	    makeAcct();
	}
	mainMenu();
    }

    public void mainMenu2() {
	System.out.println("------------------------------");
	System.out.println("What would you like to do?");
	System.out.println("1. Add a Course");
	System.out.println("2. Remove a Course");
	System.out.println("3. Add a Student");
	System.out.println("4. Remove a Student");
	System.out.println("5. Get a student");
	System.out.println("6. Generate Schedules");
	System.out.println("7. Logout");
	System.out.println("------------------------------");

	int option = Integer.parseInt(IOTools.readLine());
	if (option == 1) {
	    System.out.println("Teacher?");
	    String teacher = IOTools.readLine();
	    System.out.println("Subject?");
	    String subject = IOTools.readLine();
	    System.out.println("Period?");
	    int period = Integer.parseInt(IOTools.readLine());
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
	    int op = Integer.parseInt(IOTools.readLine());
	    if (op > courses.size())
		mainMenu2();
	    else {
		((Admin)user).removeCourse(op-1);
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
	    System.out.println("added student");
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
	    
	    //System.out.println((Admin)user).getStudent(id);
	}
	if (option == 6) {
	    System.out.println("lol");
	}
	if (option == 7) {
	    System.out.println("Logging out...");
	    return;
	}
    }
    
    public boolean hasAccount() {
	System.out.println("\nAre you...");
	System.out.println("1: A returning student?");
	System.out.println("2: A new student?");
	System.out.println("3: An administator?");

	int option = Integer.parseInt(IOTools.readLine());
	switch (option) { //decided to try something new
	case 1:
          studentAccount = true;
          return true;
	case 2:
          studentAccount = true;
          return false;
	case 3:
          studentAccount = false;
          return true;
	default: 
	    System.out.println("Please input a valid option.");
	    hasAccount();
	    return false;
	}
    }

    public void login() {
	System.out.println("Username?");
	String u = IOTools.readLine();
	System.out.println("Pass?");
	String p = IOTools.readLine();
        if (studentAccount){
          int id = LStudent.checkStudent(u,p);
          if (id != -1){
            user = LStudent.getStudent(id);
            return;
          }
          else {
            System.out.println("Incorrect combination. Try again.");
            login();
            return;
          }
        }
	// add a way to check and return bool whether this set of data exists in csv
        if (u.equals("admin") && p.equals("admin")){
          user = new Admin(u,p);
        }
        else {
          System.out.println("Incorrect combination. Try again.");
          login();
          return;
        }
	System.out.println("Great job, we've logged you in!");
    }

    public void makeAcct() {
	System.out.println("Username?");
	String u = IOTools.readLine();
	System.out.println("Pass?");
	String p = IOTools.readLine();
	System.out.println("Grade?");
	int g = Integer.parseInt(IOTools.readLine());
	System.out.println("GPA?");
	double a = Double.parseDouble(IOTools.readLine());

        user = new Student(u, p, g, a);
        LStudent.addStudent((Student)user);
	System.out.println("Great job, we've made you an account and logged you in!");
    }

    public void mainMenu() {
	System.out.println("------------------------------");
	System.out.println("What would you like to do?");
	System.out.println("1. Print schedule");
	System.out.println("2. Choose classes");
	System.out.println("3. View stats");
	System.out.println("4. Logout");
	System.out.println("------------------------------");

	int option = Integer.parseInt(IOTools.readLine());
	if (option == 1) {
	    ((Student)user).printSchedule();
	    mainMenu();
	}
	if (option == 2) {
	    ((Student)user).chooseClasses();
	    mainMenu();
	}
	if(option == 3) {
	    System.out.println("gpa: " + ((Student)user).getGPA());
	    System.out.println("grade: " + ((Student)user).getGrade());
	    mainMenu();
	}
	if (option == 4) {
	    System.out.println("Logging out...");
	    return;
	}
    }

    public void logout() {

    }

    public static void main(String[] args) throws IOException, FileNotFoundException {
	File file = new File("StudentData.csv");
        BufferedReader br = new BufferedReader(new FileReader(file));
        String st;
        while ((st = br.readLine()) != null){
          if (!st.equals("Username,Password,Grade,GPA")){
            String[] arr = st.split(",");
            Student a = new Student(arr[0],arr[1],Integer.parseInt(arr[2]),Double.parseDouble(arr[3]));
            LStudent.addStudent(a);
          }
        }
	Woo n = new Woo();
	n.loginPrompt();
    }
}
