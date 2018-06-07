import java.io.IOException;
import java.io.FileNotFoundException;

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
	// seed data from CSVs
	Woo n = new Woo();
	n.loginPrompt();
    }
}
