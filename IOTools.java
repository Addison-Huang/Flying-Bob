import java.util.Scanner;
import java.io.IOException;
import java.io.FileNotFoundException;
import java.io.File;
import java.io.Writer;
import java.io.FileWriter;

public class IOTools {
  public static final File studentSave = new File("StudentData.csv");
  public static final File courseSave = new File("CourseData.csv");

  public static String readLine() {
    Scanner sc = new Scanner(System.in);
    return sc.nextLine();
  }

  public static String readInt() {
    Scanner sc = new Scanner(System.in);
    return sc.nextLine();
  }

  public static void writeStudent (String s, boolean a) throws FileNotFoundException, IOException {
    Writer writer = new FileWriter(studentSave, a); // the second parameter signifies that this is appending to the file
                                                    // instead of copying its contents and returning a slight variation of it
    writer.write(s);
    writer.close();
  }
  public static void writeCourse (String s, boolean a) throws FileNotFoundException, IOException {
    Writer writer = new FileWriter(courseSave, a); // the second parameter signifies that this is appending to the file
                                                   // instead of copying its contents and returning a slight variation of it
    writer.write(s);
    writer.close();
  }

  public static boolean checkSave() throws FileNotFoundException, IOException {
    if (!courseSave.exists()) {
      courseSave.createNewFile();
      writeCourse("Teacher,Subject,Period,Waitlist|Roster\n", false);
    }
    
    if (!studentSave.exists()) {
      studentSave.createNewFile();
      writeStudent("Username,Password,Grade,GPA\n", false);
      return false;
    }
    return true;
  }
}
