import java.util.Scanner;

public class Woo{//driver
  public static void main(String[] args){
    //seed data from CSVs
      Scanner sc = new Scanner(System.in);
    System.out.println("Welcome to Flying Bob's Programming Program");
    System.out.println("Username?");
    String u = sc.next();
    System.out.println("Great job, your username is valid."); 
    System.out.println("Pass?");
    String p = sc.next();
    System.out.println("Great job, your pass is valid."); 
   
    Student bob = new Student(1, 1, 1);
    System.out.println("Hello, Student Bob. Your ID is " + bob.getId());
    System.out.println("What would you like to do?");
    System.out.println("1. Print schedule");
    System.out.println("2. Choose classes");
    System.out.println("3. View stats");
    System.out.println("4. Logout");
    /*    
 int i = sc.nextInt();
     if (i == 1)
    */	 

    
  }
}
