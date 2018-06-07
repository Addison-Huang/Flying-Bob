import java.util.Scanner;

public class Woo {// driver

  public void loginPrompt() {
    System.out.println("Hi there! Welcome to Flying Bob's Programming Program!");
    if (hasAccount())
      login();
    makeAcct();

    mainMenu();
  }

  public boolean hasAccount() {
    System.out.println("Are you a... \n0: Returning user \n1: New user");
    int option = Integer.parseInt(IOTools.readLine());
    if (option == 0)
      return true;
    return false;
  }

  public void login() {
    System.out.println("Username?");
    String u = IOTools.readLine();
    System.out.println("Pass?");
    String p = IOTools.readLine();
    System.out.println("Great job, we've logged you in!");
    //add a way to check and return bool whether this set of data exists in csv  
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
    
    Student s = new Student(u, p, g, a);
    System.out.println("Great job, we've made you an account and logged you in!");
  }

  public void mainMenu() {
    System.out.println("What would you like to do?");
    System.out.println("1. Print schedule");
    System.out.println("2. Choose classes");
    System.out.println("3. View stats");
    System.out.println("4. Logout");
  }

  public static void main(String[] args) {
    // seed data from CSVs
    Woo n = new Woo();
    n.loginPrompt();
  }
}
